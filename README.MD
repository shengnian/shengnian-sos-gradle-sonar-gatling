# Useage

## sonar and jacoco
`docker run -d --name sonarqube -p 9000:9000 -p 9092:9092 sonarqube`

`git clone https://github.com/shengnian/shengnian-sos-gradle-sonar-gatling`

`cd shengnian-sos-gradle-sonar-gatling`

`gradlew sonar`

Go to http://localhost:9000/

## gatling

Change the gatling.gradle line 28 HelloSimulation to your self simulation name, 
and run 

`gradlew gatlingRun`


