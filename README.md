# Java Fundamentals, HW 14 - Java & Android

You're given a work-in-progress calculator app.

All of the UI has been done but it's missing code!

## Requirements



## Submitting

For your convenience, we have set up a Gradle task to ZIP up all
files in your project folder so it is easy for you to attach it
to an e-mail and send it our way. All you need to do is to
execute one of the following commands (depending on your OS)
in your project folder:

Linux / OSX:
```
./gradlew clean deploy --console=plain
```

Windows:
```
gradlew clean deploy --console=plain
```

It will ask you for your full name, Student Book Number (also
known as *matrikli number*), homework number and a comment (optional).

Example (OSX):

```bash
$ ./gradlew clean deploy --console=plain
Incremental java compilation is an incubating feature.
:clean
:gatherHwProps
Your full name (e.g. John Smith): Jane Smith
Your Student Book Number (matrikli number, e.g. B12345): B12345
Homework number: 14
Comment: Java & Android

:deploy
Built zip /Users/madis/Code/jf-hw-android-calculator/build/jf-homework-B12345-14.zip

BUILD SUCCESSFUL

Total time: 15.539 secs
```

After Maven has finished, you can find the generated ZIP file in *build* folder with name such as
*jf-homework-B12345-14.zip* (it contains your Student Book Number/matrikli number and homework number).

Attach the ZIP to an e-mail and **send it our way**, to *jf@zeroturnaround.com*.