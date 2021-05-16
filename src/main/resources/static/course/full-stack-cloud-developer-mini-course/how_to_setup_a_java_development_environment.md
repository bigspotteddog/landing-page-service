# How to set up a Java development environment

In this lesson, we will install Java 11 and Apache Maven, a Java build tool. We will also create a web application using Spring Boot Initializr and we will use Visual Studio Code to add a "hello world" response handler to our new web application. Finally, we will set up a Google Cloud Platform account and deploy our new web application to the cloud.

## How to install Java 11

1. Check for Java 11

    Open a terminal window and run this command:

    ```text
    $ java -version
    ```

    If Java is installed, you should see something that indicates the Java version installed, like this:

    ```text
    $ java -version

    openjdk version "11.0.10" 2021-01-19
    OpenJDK Runtime Environment AdoptOpenJDK (build 11.0.10+9)
    OpenJDK 64-Bit Server VM AdoptOpenJDK (build 11.0.10+9, mixed mode)
    ```

    If Java version 11 is already installed, skip the `Install Java 11` step below.

    Otherwise, you will see something that indicates that Java is not installed, like this:

    ```text
    $ java -version

    No Java runtime present, requesting install.    
    ```

1. Install Java 11

    1. Open your browser and open https://adoptopenjdk.net/

    1. Choose version: `OpenJDK 11 (LTS)`

    1. Choose JVM: `HotSpot`

    1. Download the latest release

    1. Open the downloaded package and follow the prompts to install Java 11

## How to install Maven

1. Install Maven

    1. Open your browser and open https://maven.apache.org/download.cgi

    1. Scroll down to `Files`

    1. Click the link for your operating system

        Windows: `apache-maven-*-bin.zip`

        Linux: `apache-maven-*-bin.tar.gz`

        Mac: `apache-maven-*-bin.tar.gz`

    1. Extract the downloaded archive in the directory of your choice

        For Mac, open a terminal window and run the following commands:

        Extract the archive to `/usr/local/share`:

        ```text
        $ sudo tar zxvf ~/Downloads/apache-maven-3.6.3-bin.tar.gz --directory /usr/local/share

        ```

    1. Add the maven directory to your `PATH` variable

        Create a symbolic link in `/usr/local/bin`:

        ```text
        $ sudo ln -s /usr/local/share/apache-maven-3.6.3/bin/mvn /usr/local/bin/mvn
        ```

        Verify the maven version installed:

        ```text
        $ mvn -v

        Apache Maven 3.6.3 (cecedd343002696d0abb50b32b541b8a6ba2883f)
        Maven home: /usr/local/share/apache-maven-3.6.3
        Java version: 11.0.10, vendor: AdoptOpenJDK, runtime: /Library/Java/JavaVirtualMachines/adoptopenjdk-11.jdk/Contents/Home
        Default locale: en_US, platform encoding: UTF-8
        OS name: "mac os x", version: "10.15.6", arch: "x86_64", family: "mac"        
        ```

## How to set up Spring Boot

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

    1. Open a terminal window in the directory where you extracted the downloaded application

    1. Run the following command to build and run your application:

        ```text
        $ mvn spring-boot:run
        ```

    1. Open your web browser and open http://localhost:8080

    1. You should see an error page like this:

        <h1>Whitelabel Error Page</h1>

        This applicattion has no explicit mapping for /error so you are seeing this as a fallback.

        Sat Mar 20 18:26:36 PDT 2021<br/>
        There was an unexpected error (type=Not Found, status=404).

        This means our application is running but we have not added anything to it yet.

## How to install Visual Studio Code

1. Install Visual Studio Code

    1. Open your web browser and open https://code.visualstudio.com/

    1. Download the build for your operating system

    1. Extract the archive in the folder of your choice

    1. Copy to your applications folder or leave it where it is

    1. Launch Visual Studio Code by running the extracted application

1. Add command line launcher

    1. Open the command pallete `Cmd + Shift + P`

    1. Search for `code`

    1. Select `Shell Command: install 'code' command in PATH`

1. Add the Java extension pack to VS Code

    1. Open the Extensions view. You can do this several ways. One way is to open the command palette `Cmd + Shift + P`, then search for `install extensions`.

    1. Search for the Java Extension Pack in the marketplace

    1. Click the install button to install Java support

## Add a default response to our web application

1. Open the downloaded Spring Boot project in VS Code

1. Open the file `MyApplication.java`

1. Replace the contents of the file with the following code. Don't worry about knowing what it does we will learn that later.

    ```java
    package com.example.myapplication;

    import org.springframework.boot.SpringApplication;
    import org.springframework.boot.autoconfigure.SpringBootApplication;
    import org.springframework.web.bind.annotation.GetMapping; // added
    import org.springframework.web.bind.annotation.RestController; // added

    @SpringBootApplication
    @RestController // added
    public class MyApplication {

        public static void main(String[] args) {
            SpringApplication.run(MyApplication.class, args);
        }

        @GetMapping("/hello") // added
        public String hello() { // added
            return "Hello world!"; // added
        } // added
    }
    ```

1. Shutdown the web application by pressing `Ctrl-C` in the terminal

1. Start the web application again:

    ```text
    $ mvn springboot:run
    ```

1. Open your web browser and open http://localhost:8080/hello

1. You should now see a valid response:

    ```text
    Hello world!
    ```

## How to set up a cloud environment

1. Create a Google Cloud account

    1. Open your web browser and open https://cloud.google.com/

    1. If you have not created a Google Cloud account before, click the `Get started for free` button and follow the prompts; otherwise, click the `Console` or `Sign In` button

1. Install the Google Cloud SDK

    1. Check for Python 3.5 to 3.8 or Python 2.7.9 or higher

        Python 3.5 to 3.8 or Python 2.7.9 is required to run the Google Cloud SDK. To verify that Python is installed and is a supported version. Do the following.

        Open a terminal window and run this command:

        ```text
        $ python -V
        ```

        If You should see something like this:

        ```text
        $ python -V

        Python 3.7.8
        ```

        If Python is already installed, skip to the `Install Python` step

    1. Install Python

        1. Open a web browser and open https://www.python.org/downloads/

        1. Download the installer for version 3.8.x for your operating system

        1. Open the downloaded package and follow the prompts to install Python 3.8

    1. Install the Google Cloud SDK

        1. Open your web browser and open https://cloud.google.com/sdk/docs/quickstart

        1. Download the installer package for your operating system

        1. Extract the downloaded archive in the folder of your choice

            ```text
            $ tar zxvf ~/Downloads/google-cloud-sdk-333.0.0-darwin-x86_64.tar.gz --directory ~/
            ```

        1. Open a terminal window and change directory into the extracted archive folder

        1. Run the install script in the extracted archive folder and follow the prompts.

            ```text
            $ ./install.sh
            Welcome to the Google Cloud SDK!

            To help improve the quality of this product, we collect anonymized usage data
            and anonymized stacktraces when crashes are encountered; additional information
            is available at <https://cloud.google.com/sdk/usage-statistics>. This data is
            handled in accordance with our privacy policy
            <https://cloud.google.com/terms/cloud-privacy-notice>. You may choose to opt in this
            collection now (by choosing 'Y' at the below prompt), or at any time in the
            future by running the following command:

                gcloud config set disable_usage_reporting false

            Do you want to help improve the Google Cloud SDK (y/N)?
            ```

            ```text
            Do you want to help improve the Google Cloud SDK (y/N)?  y

            Your current Cloud SDK version is: 332.0.0
            The latest available version is: 332.0.0

            ┌────────────────────────────────────────────────────────────────────────────────────────────────────────────┐
            │                                                 Components                                                 │
            ├───────────────┬──────────────────────────────────────────────────────┬──────────────────────────┬──────────┤
            │     Status    │                         Name                         │            ID            │   Size   │
            ├───────────────┼──────────────────────────────────────────────────────┼──────────────────────────┼──────────┤
            │ Not Installed │ App Engine Go Extensions                             │ app-engine-go            │  4.8 MiB │
            │ Not Installed │ Appctl                                               │ appctl                   │ 18.5 MiB │
            │ Not Installed │ Cloud Bigtable Command Line Tool                     │ cbt                      │  7.6 MiB │
            │ Not Installed │ Cloud Bigtable Emulator                              │ bigtable                 │  6.6 MiB │
            │ Not Installed │ Cloud Datalab Command Line Tool                      │ datalab                  │  < 1 MiB │
            │ Not Installed │ Cloud Datastore Emulator                             │ cloud-datastore-emulator │ 18.4 MiB │
            │ Not Installed │ Cloud Firestore Emulator                             │ cloud-firestore-emulator │ 41.6 MiB │
            │ Not Installed │ Cloud Pub/Sub Emulator                               │ pubsub-emulator          │ 60.4 MiB │
            │ Not Installed │ Cloud SQL Proxy                                      │ cloud_sql_proxy          │  7.4 MiB │
            │ Not Installed │ Emulator Reverse Proxy                               │ emulator-reverse-proxy   │ 14.5 MiB │
            │ Not Installed │ Google Cloud Build Local Builder                     │ cloud-build-local        │  6.2 MiB │
            │ Not Installed │ Google Container Registry's Docker credential helper │ docker-credential-gcr    │  2.2 MiB │
            │ Not Installed │ Kustomize                                            │ kustomize                │ 22.8 MiB │
            │ Not Installed │ Minikube                                             │ minikube                 │ 23.7 MiB │
            │ Not Installed │ Nomos CLI                                            │ nomos                    │ 19.8 MiB │
            │ Not Installed │ On-Demand Scanning API extraction helper             │ local-extract            │ 10.4 MiB │
            │ Not Installed │ Skaffold                                             │ skaffold                 │ 17.0 MiB │
            │ Not Installed │ anthos-auth                                          │ anthos-auth              │ 16.3 MiB │
            │ Not Installed │ config-connector                                     │ config-connector         │ 43.8 MiB │
            │ Not Installed │ gcloud Alpha Commands                                │ alpha                    │  < 1 MiB │
            │ Not Installed │ gcloud Beta Commands                                 │ beta                     │  < 1 MiB │
            │ Not Installed │ gcloud app Java Extensions                           │ app-engine-java          │ 53.1 MiB │
            │ Not Installed │ gcloud app PHP Extensions                            │ app-engine-php           │ 21.9 MiB │
            │ Not Installed │ gcloud app Python Extensions                         │ app-engine-python        │  6.1 MiB │
            │ Not Installed │ gcloud app Python Extensions (Extra Libraries)       │ app-engine-python-extras │ 27.1 MiB │
            │ Not Installed │ kpt                                                  │ kpt                      │ 12.2 MiB │
            │ Not Installed │ kubectl                                              │ kubectl                  │  < 1 MiB │
            │ Not Installed │ kubectl-oidc                                         │ kubectl-oidc             │ 16.3 MiB │
            │ Not Installed │ pkg                                                  │ pkg                      │          │
            │ Installed     │ BigQuery Command Line Tool                           │ bq                       │  < 1 MiB │
            │ Installed     │ Cloud SDK Core Libraries                             │ core                     │ 17.6 MiB │
            │ Installed     │ Cloud Storage Command Line Tool                      │ gsutil                   │  3.9 MiB │
            └───────────────┴──────────────────────────────────────────────────────┴──────────────────────────┴──────────┘
            To install or remove components at your current SDK version [332.0.0], run:
            $ gcloud components install COMPONENT_ID
            $ gcloud components remove COMPONENT_ID

            To update your SDK installation to the latest version [332.0.0], run:
            $ gcloud components update

            Modify profile to update your $PATH and enable shell command
            completion?

            Do you want to continue (Y/n)?
            ```

            ```text
            Do you want to continue (Y/n)?  y

            The Google Cloud SDK installer will now prompt you to update an rc
            file to bring the Google Cloud CLIs into your environment.

            Enter a path to an rc file to update, or leave blank to use
            [/Users/fullstackclouddeveloper2/.zshrc]:                
            ```

            ```text
            Backing up [/Users/fullstackclouddeveloper2/.zshrc] to [/Users/fullstackclouddeveloper2/.zshrc.backup].
            [/Users/fullstackclouddeveloper2/.zshrc] has been updated.

            ==> Start a new shell for the changes to take effect.

            For more information on how to get started, please visit:
            https://cloud.google.com/sdk/docs/quickstarts

            $  
                
            ```

        1. Initialize gcloud
        
            Open a terminal window and run `gcloud init`

            ```text
            $ gcloud init
            Welcome! This command will take you through the configuration of gcloud.

            Your current configuration has been set to: [default]

            You can skip diagnostics next time by using the following flag:
            gcloud init --skip-diagnostics

            Network diagnostic detects and fixes local network connection issues.
            Checking network connection...done.
            Reachability Check passed.
            Network diagnostic passed (1/1 checks passed).

            You must log in to continue. Would you like to log in (Y/n)?
            ```

            ```text
            Your browser has been opened to visit:

                https://accounts.google.com/o/oauth2/auth?response_type=code&client_id=32555940559.apps.googleusercontent.com&redirect_uri=http%3A%2F%2Flocalhost%3A8085%2F&scope=openid+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fcloud-platform+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fappengine.admin+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fcompute+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Faccounts.reauth&state=8LKr5uwsYwQDp97Rukx1R34WU3JErc&access_type=offline&code_challenge=ZMqwLf1e8DJKa5Eu3t7K-fkRkHqN1DDg8Hb-dYFDu5I&code_challenge_method=S256

            You are logged in as: [fullstackclouddeveloper@gmail.com].

            Pick cloud project to use:
            [1] copper-canyon-284900
            [2] email-capture-service-2
            [3] email-capture-service-3
            [4] email-capture-service-4
            [5] helpful-cipher-284900
            [6] landing-page-service-2
            [7] landing-page-service-304308
            [8] responsive-amp-284900
            [9] Create a new project
            Please enter numeric choice or text value (must exactly match list
            item):                
            ```

            ```text
            Please enter numeric choice or text value (must exactly match list
            item):  9

            Enter a Project ID. Note that a Project ID CANNOT be changed later.
            Project IDs must be 6-30 characters (lowercase ASCII, digits, or
            hyphens) in length and start with a lowercase letter. landing-page-service-3                
            ```

            ```text
            Waiting for [operations/cp.5778704710818879908] to finish...done.
            Your current project has been set to: [landing-page-service-3].

            Not setting default zone/region (this feature makes it easier to use
            [gcloud compute] by setting an appropriate default value for the
            --zone and --region flag).
            See https://cloud.google.com/compute/docs/gcloud-compute section on how to set
            default compute region and zone manually. If you would like [gcloud init] to be
            able to do this for you the next time you run it, make sure the
            Compute Engine API is enabled for your project on the
            https://console.developers.google.com/apis page.

            Your Google Cloud SDK is configured and ready to use!

            * Commands that require authentication will use fullstackclouddeveloper@gmail.com by default
            * Commands will reference project `landing-page-service-3` by default
            Run `gcloud help config` to learn how to change individual settings

            This gcloud configuration is called [default]. You can create additional configurations if you work with multiple accounts and/or projects.
            Run `gcloud topic configurations` to learn more.

            Some things to try next:

            * Run `gcloud --help` to see the Cloud Platform services you can interact with. And run `gcloud help COMMAND` to get help on any gcloud command.
            * Run `gcloud topic --help` to learn about advanced features of the SDK like arg files and output formatting
            $                
            ```

## How to deploy an app to the cloud

1. Change directory into the downloaded application folder

1. Run the following command to deploy the application

    ```text
    $ gcloud app deploy
    ```

    ```text
    $ gcloud app deploy
    Services to deploy:

    descriptor:      [/Users/fullstackclouddeveloper2/Downloads/my-application/pom.xml]
    source:          [/Users/fullstackclouddeveloper2/Downloads/my-application]
    target project:  [landing-page-service-3]
    target service:  [default]
    target version:  [20210330t223908]
    target url:      [https://landing-page-service-3.wl.r.appspot.com]

    Do you want to continue (Y/n)?  Y

    Beginning deployment of service [default]...
    ╔════════════════════════════════════════════════════════════╗
    ╠═ Uploading 0 files to Google Cloud Storage                ═╣
    ╚════════════════════════════════════════════════════════════╝
    File upload done.
    Updating service [default]...failed.
    ERROR: (gcloud.app.deploy) Error Response: [7] Access Not Configured. Cloud Build has not been used in project
    landing-page-service-3 before or it is disabled. Enable it by visiting
    https://console.developers.google.com/apis/api/cloudbuild.googleapis.com/overview?project=landing-page-service-3
    then retry. If you enabled this API recently, wait a few minutes for the action to propagate to our systems
    and retry.
    $
    ```

    If you see the error above, we need to enable cloud build. Visit the url mentioned in the error message to enable
    cloud billing, then try again.

1. Run the `gcloud app deploy` command again

    ```text
    $ gcloud app deploy
    ```

    ```text
    $ gcloud app deploy
    Services to deploy:

    descriptor:      [/Users/fullstackclouddeveloper2/Downloads/my-application/pom.xml]
    source:          [/Users/fullstackclouddeveloper2/Downloads/my-application]
    target project:  [landing-page-service-3]
    target service:  [default]
    target version:  [20210330t225645]
    target url:      [https://landing-page-service-3.wl.r.appspot.com]

    Do you want to continue (Y/n)?

    Beginning deployment of service [default]...
    ╔════════════════════════════════════════════════════════════╗
    ╠═ Uploading 0 files to Google Cloud Storage                ═╣
    ╚════════════════════════════════════════════════════════════╝
    File upload done.
    Updating service [default]...done.
    Setting traffic split for service [default]...done.
    Deployed service [default] to [https://landing-page-service-3.wl.r.appspot.com]

    You can stream logs from the command line by running:
    $ gcloud app logs tail -s default

    To view your application in the web browser run:
    $ gcloud app browse
    ```

1. Open the app in a new browser tab by running `gcloud app browse`

    ```text
    $ gcloud app browse
    Opening [https://landing-page-service-3.wl.r.appspot.com] in a new tab in your default browser.
    $
    ```

    You will see the `Whitelabel error page` we saw when we ran it locally

1. Add `/hello` to the url like we did before

    ```text
    Hello world!
    ```

    Now you will see `Hello world!`

    Your app is now deployed to the cloud!