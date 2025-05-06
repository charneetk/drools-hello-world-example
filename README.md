# Drools Hello World Application

This is a simple Java-based application demonstrating the use of the **Drools Rule Engine** using KieSession. It uses a basic `.drl` rule file to process a `Message` object.

## Prerequisites

- Java 11+
- Maven

## Setup and Running the Application

1.  Clone the repository .

2.  Update Java Version in pom.xml

        <properties>
        <maven.compiler.source>11</maven.compiler.source>
        <maven.compiler.target>11</maven.compiler.target>
        </properties>

    -> Adjust to match your installed JDK version (e.g., 17, 21).

3.  Build the Project

        mvn clean install

4.  Run the Application

        mvn exec:java -Dexec.mainClass="com.example.main.DroolTest"
