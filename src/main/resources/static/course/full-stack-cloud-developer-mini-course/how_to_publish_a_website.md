# How to publish a website

In this lesson, we will download a free bootstrap template from https://startbootstrap.com and copy it into our project's static folder. Then we will update our uploaded application with the new website content using the same gcloud app deploy command we used to deploy it initially.

1. Install a free bootstrap template:

    1. Open your browser and open https://startbootstrap.com

    1. Choose a template and download it. We will download this one:

        ![Landing page](/images/landing-page.jpeg)

    1. Extract the downloaded template

    1. Copy the extracted contents into your project's static folder (assuming `startbootstrap-landing-page-gh-pages`)

        1. Open a terminal window

        1. Run the copy command

            ```text
            $ cp -R ~/Downloads/startbootstrap-landing-page-gh-pages/* ~/Downloads/my-application/src/main/resources/static/
            ```
    
    1. Restart your web application:

        1. Open a terminal window

        1. Change into your web application folder

            ```text
            $ cd ~/Downloads/my-application
            ```

        1. Stop the application if it is running

        1. Start the application

            ```text
            $ mvn spring-boot:run
            ```
        
        1. Browse the updated application at http://localhost:8080

1. Upload the updated application to you Google Cloud project

    1. In your terminal window, stop the application by pressing `Ctrl-C`

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
        target version:  [20210513t180714]
        target url:      [https://landing-page-service-3.wl.r.appspot.com]

        Do you want to continue (Y/n)?  Y

        Beginning deployment of service [default]...
        Created .gcloudignore file. See `gcloud topic gcloudignore` for details.
        ╔════════════════════════════════════════════════════════════╗
        ╠═ Uploading 14 files to Google Cloud Storage               ═╣
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

    1. Browse your updated application

        ```text
        $ gcloud app browse
        ```
