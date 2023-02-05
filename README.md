# Spring Boot Rock, Paper Scissors "Microservice" Project

This is a Java / Maven / Spring Boot (version 3.0.2) application to play a simple game rock, paper and scissors.

## How to Run
* Clone this repository
* Make sure you are using an appropriate JDK version (mine:11.0.17 open jdk) and Maven 3.x
* You can build the project and run the tests by running ```mvn clean package```
* Once successfully built, you can run the application.

## About the Game
The is just a game REST service that would run on port **8080** locally. 
<br>
Here are some endpoints you can call:
```
GET: http://localhost:8080/home

Response:
Welcome to Rock, Paper and Scissors Game!
To play with computer post => /play?move={rock/paper/scissors}
Response code: 200;
```

```
POST: http://localhost:8080/play?move=paper

Response:
{
  "playerMove": "paper",
  "computerMove": "paper",
  "result": "It is a tie!"
}
```

## Unit Test Cases
This project contains **6** inbuilt unit test cases :
* testRockBeatsScissors
* testPaperBeatsRock
* testScissorsBeatsPaper
* testTie
* testGetHome
* testApiEndpoint

Unit testing ensures that all code meets quality standards before it's deployed.

## Swagger UI Documentation
Head over to the below link to access the swagger ui documentation: <br>

```http://localhost:8080/swagger-ui/index.html```
<br>
<br>
![Alt text](screenshots/swagger_doc.png?raw=true "Swagger UI")
You test out endpoints using Swagger UI's ***Try it out*** feature as well.