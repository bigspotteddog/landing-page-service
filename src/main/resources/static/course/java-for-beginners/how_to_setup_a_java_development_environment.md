## How to install Java 11

To start, we will install Java 11 so we can compile and execute Java applications.

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

## How to install Visual Studio Code

Visual Studio Code is a code editor we can use to edit our Java class files.

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
