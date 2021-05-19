# How to receive a post request on the server

In this lesson, we will learn how to modify our web application to receive data sent from the web browser. The video will walk you through the steps to create a Java function to receive the posted data and return the data it received back to the browser.

## Adding a post request handler to our web application

1. Add a post request handler to the server

    1. Open the `MyApplication.java` file, or whatever you named yours, in VS Code. This Java file is in your downloaded application folder in the `src/main/<package>` folder. The package name we used when we created the application is `com.example`.

    1. Follow along with the video to add a `PostMapping` function to receive the `/notify-me` post data. The function will initially return that it was called back to the browser.

        The resulting `/notify-me` function will look like this:

        ```text
            @PostMapping("/notify-me")
            public String notifyMe() {
                return "{\"message\": \"notify-me\"}";
            }
        ```

    1. Restart the server and send an email address to the server with the Developer Tools console open to see what happens.

## Receiving the post data on the server

1. Add parameters to the `/notify-me` post mapping function to receive the email address

    1. Follow along with the video to add parameters to the `/notify-me` function to receive the email address from the browser. This function will return the data it received back to the browser.

        The resulting `/notify-me` function will now look like this:

        ```text
            @PostMapping("/notify-me")
            public String notifyMe(@RequestBody Map<String, String> body) throws JsonProcessingException {
                return new ObjectMapper().writeValueAsString(body);
            }
        ```
    
    1. Restart the server and send an email address to the server with the Developer Tools console open to see what happens.
