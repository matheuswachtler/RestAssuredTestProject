# Rest-Assured Automation Project


Welcome to my Rest-Assured Automation Project.

I created this project with the intention of practicing the knowledge acquired through courses and research.

In this project, I chose to automate tests on the public API  <a href="https://dummyjson.com/"> DummyJSON </a>.

DummyJSON is a widely used fake RestFull API for testing with automation tools.

Hope you enjoy it, feel free to reach out to me.

A link to my LinkedIn profile will be available at the bottom of the page.



# About the project


In the tests, I chose Rest-Assured framework as the core for automating the requests made to the DummyJson API.

I also used frameworks like JUnit and Hamcrest to make assertions after each request sent.

The programming language used in the project development is JAVA.



# Before starting

To run the tests, you will first need to have some tools on your machine.

* Git

Git is required to make a copy of the project on your machine.

* Java 

Java is the language that was used for project development.



* Maven

Maven is a dependency and application build manager used in JAVA. It's also responsible for initiating test execution.

If you have any questions about any of the mentioned tools, I will leave a link to the documentation for all project dependencies at the bottom of the page.



# Dependencies

This project uses Maven for dependency management and application build.

| Artifact Id  | Version |
| ------------- | ------------- |
| rest-assured | 5.3.2 |
| json-schema-validator | 5.3.2 |
| commons-codec | 1.16.0 |
| jackson-databind | 2.15.2 |
| guava | 32.1.2-jre |
| Junit-jupiter | 5.10.0 |
| junit-jupiter-params | 5.10.0 |
| Java JDK | 17.0.8 |



# Plugins
| Artifact Id  | Version |
| ------------- | ------------- |
| maven-failsafe-plugin  | 3.1.2 |


# Copying the project

To start the tests, you'll first need to have the project on your machine.

Create a folder on your machine where you want to store the project.

![image](https://github.com/matheuswachtler/RestAssuredTestProject/assets/76985572/b12f28a8-3d81-4d9a-bc7a-8df47fca8e6e)

After creating the folder, using a terminal, navigate to the location where you created it using the 'cd' command.

![image](https://github.com/matheuswachtler/RestAssuredTestProject/assets/76985572/3d4c2817-cb16-47c1-9bbb-1290dedc3012)


Now that you've accessed the folder through the terminal, simply copy the following code and paste it into the terminal to make a copy of the project in the desired location.

```bash
git clone https://github.com/matheuswachtler/RestAssuredTestProject.git
```

![image](https://github.com/matheuswachtler/RestAssuredTestProject/assets/76985572/4a4273e7-c5d1-4a38-a760-2cac517ad25b)


# Running tests

To run the tests, in the terminal, navigate to the project's root folder (where the pom.xml file is located).

Use the 'ls' command to list all the files present in the directory you are in within the terminal.

![image](https://github.com/matheuswachtler/RestAssuredTestProject/assets/76985572/69465ff2-8f6d-412d-adb3-c1ea76240a6e)

Now that you are in the project's root folder, simply type the 'mvn clean verify' command, and all the tests will be executed.

```bash
mvn clean verify
```
![image](https://github.com/matheuswachtler/RestAssuredTestProject/assets/76985572/74f8a4de-fb05-43d8-94d4-962274b8bd0b)

![image](https://github.com/matheuswachtler/RestAssuredTestProject/assets/76985572/876a6032-f9c7-415a-88e9-761f0890ba33)


# Where to get answers

I will leave a list with links to all the documentation of the technologies used in the project

* [DummyJSON](https://dummyjson.com/docs/products)
* [Rest-Assured](https://rest-assured.io/)
* [JUnit 5 Documentation](https://junit.org/junit5/docs/current/user-guide/)
* [Maven Documentation](https://maven.apache.org/)
* [Git Documentation](https://docs.github.com/pt/get-started/using-git/about-git)
* [Java Documentation](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)

# Contact

Developed by Matheus Wachtler

[LinkedIn](https://www.linkedin.com/in/matheus-wachtler-a9a92911a/)
