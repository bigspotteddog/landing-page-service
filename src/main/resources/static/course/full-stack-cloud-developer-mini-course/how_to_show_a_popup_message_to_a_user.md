# How to show a popup message to a user

In this lesson, we will use a Bootstrap modal dialog to show the user a `Thank you` message after they have clicked the `Notify me!` button.

## Adding the Bootstrap modal dialog to our web page

1. Add the Bootstrap dialog to our index.html page

    Follow along with the video to learn how to add the `Thank you` modal dialog message to our web page

    1. Open the index.html page in VS Code

    1. Open your browser to https://getbootstrap.com/docs/4.0/components/modal/ to look through Bootstrap modal examples

    1. Find an example modal dialog we will use

    1. Paste and modify the example into our index.html page

        The new `Thank you` modal dialog will look like this:

        ```text
        <!-- Modal -->
        <div class="modal fade" id="staticBackdrop" data-backdrop="static" tabindex="-1" role="dialog" aria-labelledby="staticBackdropLabel" aria-hidden="true">
            <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                <h5 class="modal-title" id="staticBackdropLabel">We'll notify you!</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                </div>
                <div class="modal-body">
                You've been added to the list. We'll notify you when registration begins.
                </div>
                <div class="modal-footer">
                <button type="button" class="btn btn-primary" data-dismiss="modal">Close</button>
                </div>
            </div>
            </div>
        </div>        
        ```

    1. Modify the URL Fetch function call to open our `Thank you` modal dialog

        The modified form submit function will look like this:

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
            $('#staticBackdrop').modal('show');
          })
          .catch((error) => {
            console.error('Error:', error);
          });
        });
        </script>
        ```
    1. Restart the server and send a new email to see what happens