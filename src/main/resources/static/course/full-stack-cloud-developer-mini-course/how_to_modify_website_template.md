# How to modify a website template

For this lesson, we will use Chrome Developer Tools to modify the web page we downloaded in the browser. This will allow us to make changes to the web page without having much knowledge of HTML or CSS yet. I use this tool a lot to figure out what HTML elements and attributes are needed and to preview what the CSS changes will look like.

The Developer Tools has a selection tool that allow you to click on an element on the page, a button, some text, and it takes you to that element in the HTML source. Once you have identified the element you want to change, you can change it in the web browser. There is a way to save this to the actual HTML page and CSS. We will learn how to do that too.

## Open Chrome Developer Tools

To open the Chrome Developer Tools in a way that we can edit the page and save the changes from our web browser, to the following:

1. Open the web page from your file system:

    1. On the browser menu, click File -> Open File...

    1. Navigate to the folder where you copied the downloaded bootstrap template to. In the previous video, we copied it to ~/Downloads/my-application/src/main/resources/static. In this video, I used a different path.

    1. Open the `index.html` page

1. Open Chrome Developer Tools by right-clicking anywhere on the page and selecting `Inspect` or click the 3-dots at the top-right of your browser and select `More Tools -> Developer Tools`.

1. Select any element on the page by:

    1. Click the element Selection Tool at the top-left of the Developer Tools window

    1. Then, click any element on the page to see that element in the HTML elements view. Hovering over the element will preview it before you click on it.

1. Modify the header title by:

    1. Clicking the element Selection Tool at the top-left of the Developer Tools window

    1. Then, click on the header title that says, `Start Bootstrap`

    1. Double-click the words `Start Bootstrap` in the Developer Tools window to enter edit mode

    1. Change the header title

1. Delete the `Sign In` button

    1. Clicking the element Selection Tool at the top-left of the Developer Tools window

    1. Then, click the `Sign In` button

    1. Then, press the `delete` button on your keyboard or right-click the element in the Developer Tools window and select `Delete element`

1. Change the landing page tag line

1. Change the tag line button text

1. Change the tag line background image by:

    1. Downloading a new background image. We will download from https://www.pexels.com.

    1. In the search, type the word `coding`

    1. Download a new background image. We will download this one:

        ![Background image](/images/bg-coding.jpeg)

    1. Copy the downloaded image to our website `img` folder at ~/Downloads/my-application/src/main/resources/static/assets/img

    1. Select the tag line background with the Developer Tools selection tool

        This will select the `overlay` element which does not have the background so we will have to click on the parent element in the Developer Tools window:

        ```text
        <header class="masthead text-white text-center">
        ```

    1. Edit the `header.masthead` background by:

        1. Clicking the `background -> url` in the Developer Tools `Style` tab

        1. Edit the url to be `../assets/img/bg-coding.jpeg`

1. Follow along with the video to change the feature icons, titles and descriptions in the middle of the page

1. Follow along with the video to delete the marketing squares below the features, but leave the first one. Note: `ctrl-z` will allow you to undo changes.

1. Delete the `What people are saying...` testimonials section

1. Change the bottom `Sign Up!` section to have the same background images as the tag line and change the text there too

1. Following along with the video to add a table in the remaining marketing square above
