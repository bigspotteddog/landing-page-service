# How to save a record to the database

In this lesson, we will learn how to set up a Google Firestore database to store the email addresses received. The video will walk you through the steps for creating the database, creating a new collection (table) to store email address, and how to put the received email address into the database.

## Setting up a Firestore database

1. Open the Google Firestore quick start guide: https://cloud.google.com/firestore/docs/quickstart-servers

    Follow along with the video to set up the Firestore database and download the security key so we can access the database from our local machine.

    1. Select our project in the Google Cloud console

    1. Create a Firestore database in natvie mode

    1. Set up a service account for our database

    1. Create a service account key so we can access the database from our local machine

1. Add the Google Firestore libraries to our application

    Follow along with the video to configure Maven to load the Firestore libraries for use in our application.

    1. Open our Maven pom.xml file in VS Code. The pom.xml file is in our downloaded application folder.

    1. Add the Firestore libraries to our application dependencies

1. Create a function to access the Firestore database in our `/notify-me` handler

    Follow along with the video to add a function to access the Firestore database in our Java handler.

    The resulting Java code will look something like this:

    ```text
    private Firestore getFirestore() throws IOException {
        FirestoreOptions firestoreOptions =
            FirestoreOptions.getDefaultInstance().toBuilder()
                .setProjectId("my-application") // or whatever you named your project
                .setCredentials(GoogleCredentials.getApplicationDefault())
                .build();
        Firestore db = firestoreOptions.getService();
        return db;
    }    
    ```

## Add a collection to the database to store email addresses

1. Add a collection to the database to store email addresses

    Follow along with the video to add a new collection to the database to store email addresses.

    1. Open the Firestore console and open the `Data` tab

    1. Start a new `Collection` named 'emails'

## Add a new email to the database

1. Add a new email to the database 

    Follow along with the video to add a new email to the database.

    1. Add code to the `/notify-me` handler to add a new email address to the database

        The resulting Java code will look like this:

        ```text

        @PostMapping("/notify-me")
        public String notifyMe(@RequestBody Map<String, String> body) throws JsonProcessingException {
            Firestore db = getFirestore();
            DocumentReference document = db.collection("emails").document(body.get("email"));
            ApiFuture<WriteResult> data = document.set(body);
            System.out.println(data.get().getUpdateTime()); 
            return new ObjectMapper().writeValueAsString(body);
        }    
        ```

    1. Send a new email address from the browser and view it in the Firestore console

