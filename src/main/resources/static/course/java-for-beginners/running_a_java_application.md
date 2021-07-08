## Running a Java Application

### Compiling a Java source file

Open a terminal window in the folder for your project and run the following command

```bash
$ javac <java source file name>
```

For example, to compile a Java source file named `HelloWorld.java`

```bash
$ javac HelloWorld.java
```

### Running a Java class

In a terminal window in the folder for your project run the following command.

```bash
$ java <java class name>
```

For example, to run a class named `HelloWorld`

```bash
$ java HelloWorld
```

example output

```bash
Hello, World!
```


### Compiling a Java source file with a classpath

  If your Java application uses external library jar files, you must include them on the classpath to compile the source file

  ```bash
  $ javac -cp .:jar-file1.jar:jar-file2.jar HelloWorld.java
  ```

### Running a Java source file with a classpath

  If your Java application uses external library jar files, you must include them on the classpath to run the class

  ```bash
  $ java -cp .:jar-file1.jar:jar-file2.jar HelloWorld
  ```
