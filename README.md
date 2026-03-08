# Maven Assignment

This project is a simple Java Maven application that takes a lowercase string as input from the user, capitalizes the input string, and generates the MD5 hex value of the input string.

The main class of the project is `App.java` under the package `com.smu.mscda`.

## Technologies Used

- Java
- Maven
- Apache Commons Text
- Apache Commons Codec
- JUnit 5

## Features

- Accepts a lowercase string as input from the user
- Capitalizes the input string using `WordUtils.capitalize()`
- Generates the MD5 hex value of the input string using `DigestUtils.md5Hex()`
- Includes JUnit test cases
- Can be packaged into a single executable JAR using Maven Shade Plugin

## Maven Dependencies

- `commons-text` for capitalizing the string
- `commons-codec` for generating MD5 hex
- `junit-jupiter` for testing

## How to Run the Project

### Clean and Package

```bash
mvn clean package
