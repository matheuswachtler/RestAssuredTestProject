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
| Java JDK | 19.0.2 |



# Plugins
| Artifact Id  | Version |
| ------------- | ------------- |
| maven-failsafe-plugin  | 3.1.2 |


# Copying the project

To start the tests, you'll first need to have the project on your machine.

Create a folder on your machine where you want to store the project.

![image](https://github.com/matheuswachtler/RestAssuredTestProject/assets/76985572/d3ab41d8-33bf-4ff9-8e55-6d6054fca102)

After creating the folder, using a terminal, navigate to the location where you created it using the 'cd' command.

![image](https://github.com/matheuswachtler/RestAssuredTestProject/assets/76985572/dc23721c-bf97-42ad-9a51-6a43bc7939a0)

Now that you've accessed the folder through the terminal, simply copy the following code and paste it into the terminal to make a copy of the project in the desired location.

```bash
git clone https://github.com/matheuswachtler/RestAssuredTestProject.git
```

![image](https://github.com/matheuswachtler/RestAssuredTestProject/assets/76985572/b5e17811-cc75-48bc-b474-6f9e590590c2)

# Running tests

To run the tests, in the terminal, navigate to the project's root folder (where the pom.xml file is located).

Use the 'ls' command to list all the files present in the directory you are in within the terminal.

![image](https://github.com/matheuswachtler/RestAssuredTestProject/assets/76985572/1fdb80ed-e3fe-4def-9630-e0b8bbe58aaf)

Now that you are in the project's root folder, simply type the 'mvn clean verify' command, and all the tests will be executed.

```bash
mvn clean verify
```
![image](https://github.com/matheuswachtler/RestAssuredTestProject/assets/76985572/dc57faee-9ee3-46c5-96d1-2ae833b44e87)

![image](https://github.com/matheuswachtler/RestAssuredTestProject/assets/76985572/3c043091-ca9e-4b33-8941-9dac84adfe51)


If you have any questions about the mentioned commands, just go to the last topic. There, I will leave a list with links to the documentation that can help you.

