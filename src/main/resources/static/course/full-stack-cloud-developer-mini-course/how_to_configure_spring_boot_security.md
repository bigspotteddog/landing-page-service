# How to Configure Spring Boot Authentication

In this lesson, we will learn how to add authentication to our web application. We will start with basic authentication using the browser to authenticate the user with a simple username and password. Next, we will upgrade to using a form instead of the brower dialog and we will add the ability to logout. Then, we will create a custom login form. Finally, we will use sign in with Google which will work for similarly to any other OAuth2 provider such as Facebook and GitHub.

## Start a Spring Boot application

Before we begin, we will start a new Spring Boot application to experiment with.

1. Initialize a Java application server with Spring Boot

    1. Open your browser and open https://start.spring.io/
    
    1. Choose project: `Maven`
    
    1. Choose language: `Java`

    1. Keep the selected Spring Boot version
    
    1. Configure project metadata:
    
        1. Group is your reverse domain name (the default is fine for now)
            
            `example: com.example`

        1. Artifact is the name of this application with no spaces (the default is fine for now)
            
            `example: my-application`

        1. Name is the human readable name of this application with spaces (the default is fine for now)

            `example: My Application`

        1. Description is the description for this application

            `example: My first Java web application`

        1. Package name is reverse domain plus the name of the application

            `example: com.example.myapplication`

    1. Choose packaging: `Jar`

    1. Choose Java: `11`

    1. Click the `Add Dependencies` button

    1. Search for `Web`

    1. Add `Spring Web`

    1. Click the `Generate` button to download the application

    1. In the directory of your choice, extract the downloaded application

1. Add a controller so we can pretend to have multiple website paths some public and some that require authentication.

    1. Add a new file named `WebController.java` under the `src/main/java/com/example/myapplication` folder

        ```java
        package com.example.myapplication;

        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.ResponseBody;

        @Controller
        public class WebController {
            @RequestMapping("/")
            @ResponseBody
            public String index() {
                return "hello";
            }

            @RequestMapping("/app")
            @ResponseBody
            public String app() {
                return "app";
            }

            @RequestMapping("/app/something")
            @ResponseBody
            public String something() {
                return "something";
            }

            @RequestMapping("/app/something/else")
            @ResponseBody
            public String somethingElse() {
                return "something else";
            }
        }
        ```

    Normally, we would put files in different packages and folders depending on their responsibility. We will keep it simple for now and put our files in the same package/folder.

1. Start the server with

    ```text
    $ ./mvnw spring-boot:run
    ```

1. Navigate your browser to these locations:

    * http://localhost:8080

    * http://localhost:8080/app

    * http://localhost:8080/app/something

    * http://localhost:8080/app/something/else

If you changed the port your server is running on rather than 8080, change the port in the links above.

You should see different outputs in your browser for each of the links. Now we are ready to start adding authentication to the app folder.

## Adding simple security with basic authentication

Let's start with basic authentication which uses the browser to handle login and logout.

1. Add a new Maven dependency to your `pom.xml` file under the `<dependencies>` tag

    ```xml
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-security</artifactId>
    </dependency>
    ```

    You can discover this dependency information by going back to https://start.spring.io and add the `security` dependency then click the `Explore` button.

1. Create a new file named `WebConfiguration.java` under the `src/main/java/com/example/myapplication` folder

    ```java
    package com.example.myapplication;

    import org.springframework.context.annotation.Configuration;
    import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
    import org.springframework.security.config.annotation.web.builders.HttpSecurity;
    import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

    @Configuration
    public class WebConfiguration extends WebSecurityConfigurerAdapter {
        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http
                .authorizeRequests()
                .anyRequest().authenticated()
                .and()
                .httpBasic();
        }

        /**
         * This handles the username and password authentication for now.
         * 
         * Username: admin
         * Password: password
         */
        @Override
        protected void configure(AuthenticationManagerBuilder auth) throws Exception {
            auth.inMemoryAuthentication()
                .withUser("admin")
                .password("{noop}password")
                .roles("ADMIN");
        }
    }
    ```

    This will require authentication for any url on our website.

1. Restart the server and navigate to any of the links above. Enter the username `admin` and password `password` when you want to login.

    ![Basic authentication](/images/basic_auth.png)

## Upgrading to form based basic authentication

Spring Boot will automatically generate a login form for us to replace the browser login dialog. All we have to do is add a couple of lines to our `configure` function.

1. Open the WebConfiguration.java file and make the `configuration` function look like this:

    ```java
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
            .anyRequest().authenticated()
            .and() // added
            .formLogin() // added
            .and()
            .httpBasic();
    }    
    ```

1. Restart the server and navigate to any of the links above. Enter the username `admin` and password `password` when you want to login.

    ![Form authentication](/images/form_login.png)

## Adding logout

By adding `.logout()` to our `configure` function Spring Boot will logout the user when the `/logout` url is called.

1. To add the ability to logout, modify the `configure` function to look like this

    ```java
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
            .anyRequest().authenticated()
            .and()
            .formLogin()
            .and()
            .httpBasic()
            .and() // added
            .logout(); // added
    }
    ```

1. Restart the server, login, the navigate to `/logout` to see what happens.

NOTE: Logout only works with form based login. Basic authentication (above), where the browser handles login, will ask you to login again only after you have closed and reopened the browser. For login with Google, you must be logged out of Google before you will be asked to login again.

## Upgrading to a custom form based basic authentication

Next we will add a custom form for our login page. The custom form will use the Thymeleaf template engine to help render the login page.

1. Add a new dependency to our `pom.xml` dependencies for Thymeleaf.

    1. Navigate your browser to https://start.spring.io

    1. Add a dependency for Thymeleaf

    1. Click the explore button to view the generated `pom.xml` file

    1. Copy the Thymeleaf dependency xml and paste it into your `pom.xml`

        ```text
        <dependency>
          <groupId>org.springframework.boot</groupId>
          <artifactId>spring-boot-starter-thymeleaf</artifactId>
        </dependency>
        ```

1. Modify the `configure` function to use a custom login form

    ```java
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
            .anyRequest().authenticated()
            .and()
            .formLogin()
                .loginPage("/login") // added
                .failureUrl("/login-error") // added
                .permitAll() // added
            .and()
            .logout()
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout")) // added
                .logoutSuccessUrl("/"); // added
    }
    ```

    Here is what changed:

    * We added the url for our new login html page

    * We added the url for login failure

    * We added `permitAll` to allow access after successful login

    * We redirected the `/logout` url to our home page at `/`

    * We removed `httpBasic`

1. Add a new import for the `AntPathRequestMatcher`

    ```java
    import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
    ```

1. Create a new Thymeleaf template under a new folder `src/main/resources/templates` named `index.html`

    ```html
    <!DOCTYPE html>
    <html xmlns:th="http://www.thymeleaf.org">
    <head>
        <title>Login</title>
    </head>
    <body>
        <div>
            <div>Login</div>
            <form th:action="@{/login}" method="POST">
                <label>Username</label>
                <input type="text" name="username" />
                <label>Password</label>
                <input type="password" name="password" />
                <input type="submit" value="Log in" />
            </form>
            <p th:if="${error}" th:text="${error}">error message here</p>
        </div>
    </body>
    </html>
    ```

1. Add new controller request mappings to our `WebController` to send the Thymeleaf `login` template

    1. Open the `WebController.java` file

    1. Add the following request mappings for the new login urls

        ```java
        @RequestMapping("/login")
        public String login() {
            return "login.html";
        }

        @RequestMapping("/login-error")
        public String loginError(Model model) {
            model.addAttribute("error", "Username or password incorrect");
            return "login.html";
        }        
        ```

        For the `/login` url, we will send the new login.html page. For the `/login-error` url, we will send the same template but with an `error` message attribute that will be displayed on the `login.html` page.

    1. Login with a bad username or password to see what happens.

## Require authentication for the `/app` url

To require the user to be logged in to access the `/app` url modify the `configure` function to add path matchers to allow or authenticate access.

1. Open the `WebConfiguration.java` file

1. Modify the `configure` function to add the path matchers

    ```java
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
            .anyRequest().authenticated() // remove
            .antMatchers("/app/**").authenticated() // added
            .antMatchers("/**").permitAll() // added
            .and()
            .formLogin()
                .loginPage("/login")
                .failureUrl("/login-error")
                .permitAll()
            .and()
            .logout()
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                .logoutSuccessUrl("/");
    }
    ```

1. Logout and access the root url `/` to see that you are now allowed to see this page without logging in

1. Try to access the `/app` folder and see that you are asked to login.

## Upgrading to sign in with Google

To allow our users to login with Google do the following

1. Add a new dependency to our `pom.xml` dependencies for OAuth2.

    1. Navigate your browser to https://start.spring.io

    1. Add a dependency for OAuth2

    1. Click the explore button to view the generated `pom.xml` file

    1. Copy the OAuth2 dependency xml and paste it into your `pom.xml`

        ```xml
        <dependency>
          <groupId>org.springframework.boot</groupId>
          <artifactId>spring-boot-starter-oauth2-client</artifactId>
        </dependency>
        ```

1. Open the `WebConfiguration.java` file

1. Modify the `configure` function to add the p

    ```java
    http
            .authorizeRequests()
            .antMatchers("/app/**").authenticated()
            .antMatchers("/**").permitAll()
            .and()
            .formLogin() // remove
                .loginPage("/login") // remove
                .failureUrl("/login-error") // remove
                .permitAll() // remove
            .oauth2Login() // added
            .and()
            .logout()
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                .logoutSuccessUrl("/");
    ```

    What changed:

    * We removed `formLogin`

    * We added `oauth2Login`

1. Logout and navigate your browser to the `/` root url

1. Navigate your browser to the `/app/something/else` url and see that you are asked to login with Google

    You may need to clear your cookies and other site data to clear out your previous login before you see login with Google.
