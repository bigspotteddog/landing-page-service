# How to send post request to server

In this lesson, we will learn how to modify HTML form elements and use JavaScript to send data to our server. This video will walk you through the coding process step-by-step.

## Adding a form action

1. Add a form action

    A form action tells the form what path to send its HTML input element values to the server.

    1. Open the `index.html` file in VS Code. The `index.html` file is in your downloaded application folder in the `src/main/resources/static` folder.

    1. Find the first `<form>` element in the `index.html` page

    1. Inside the form tag, add `action=/notify-me` so it looks like this:

        ```text
        <form action="notify-me">
        ```

## Adding a form method

1. Add a form method

    A form method tells the form how to send its HTML input element values to the server. The main form methods we use are:

    **POST** - add data to the server

    **PUT** - modify data on the server

    1. Inside the form tag, add `method=POST` so it now looks like this:

        ```text
        <form method=POST action="notify-me">
        ```

## Adding JavaScript to a page

1. Add JavaScript to our page

    Next we will add JavaScript to our index.html page with a `console.log` statement to let us know it is working. Since we already have jQuery (a JavaScript library to help us manage HTML elements) we will use it for now.

    1. Add a script tag to the page

        Near the bottom of the page, add a `<script>` below the other script tags on the page.

        1. Scroll to the bottom of the page and find the existing `<script>` tags

        1. Under the last existing `<script>` tag, add a new script tag that looks like this:

            ```text
            <script>
                console.log('hello console!');
            </script>
            ```

        1. Open the Developer Tools console tab

        1. Refresh the web page and let's see if it works. We should see `hello console!` in the Developer Tools console window.

        1. Follow along with the video for using jQuery's document ready function to know when the web page is ready to use JavaScript code on it

## Adding a form submit handler

1. Add a form submit handler to submit the form input values

    Now that our JavaScript is working, we will add a form handler to submit our form input values to the server.

    1. Follow along with the video to create jQuery form submit JavaScript function to handle the `Notify me!` button. After some exploration, the resulting JavaScript will look like this:

        ```text
        <script>
          $(form).on('submit', function(ev) {
            // This prevents the form from doing its default
            // submit behavior.
            ev.preventDefault();

          });
        </script>
        ```

## Using MDN to find a URL Fetch API example

1. Find a URL Fetch API example

    Follow along with the video to find an example URL Fetch function to submit our post data to the server. We will use the Mozilla Developer Network documentation to find a good example we will use. Here is the link to the MDN document we will use:

    https://developer.mozilla.org/en-US/docs/Web/API/Fetch_API/Using_Fetch

    ```text
    <script>
      $(form).on('submit', function(ev) {
        // This prevents the form from doing its default
        // submit behavior.
        ev.preventDefault();

        // Use JavaScript to post the email address to the
        // server instead of posting to a new page.
      });
    </script>
    ```

## Adding JavaScript to get HTML input element values

1. Add JavaScript to get the email address from the input element

    Follow along with the video to add JavaScript to the submit function that uses jQuery to get the email address from the input element.

    The resulting JavaScript will now look like this:

    ```text
    <script>
      $(form).on('submit', function(ev) {
        // This prevents the form from doing its default
        // submit behavior.
        ev.preventDefault();

        // Use JavaScript to post the email address to the
        // server instead of posting to a new page.

        // First, get the email address from the form.
        var form = $(ev.currentTarget);
        var email = form.find('input[name="email"]').val();

      });
    </script>
    ```

## Using the URL Fetch example we found to send data to the server

1. Add JavaScript to send data to the server

    Follow along with the video to add JavaScript that will use the URL Fetch API example we found earlier to send data to the server.

    The resulting JavaScript will now look like this:

    ```text
    <script>
      $(form).on('submit', function(ev) {
        // This prevents the form from doing its default
        // submit behavior.
        ev.preventDefault();

        // Use JavaScript to post the email address to the
        // server instead of posting to a new page.

        // First, get the email address from the form.
        var form = $(ev.currentTarget);
        var email = form.find('input[name="email"]').val();

        // Now, send the email as JSON data
        const data = { email: email };

        fetch(form.attr('action'), {
          method: 'POST',
          headers: {
            'Content-Type': 'application/json',
          },
          body: JSON.stringify(data),
        })
        .then(response => response.json())
        .then(data => {
          console.log(data);
        })
        .catch((error) => {
          console.error('Error:', error);
        });
      });
    </script>
    ```

1. Click the `Notify me!` button and see what happens
