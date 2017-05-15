FROM openjdk:8-jre-alpine

VOLUME /tmp

ADD sos-gradle-sonar-gatling-0.1.0.jar app.jar

ENV SPRING_OUTPUT_ANSI_ENABLED=ALWAYS\
    SOS_SLEEP=0

EXPOSE 8084:8084
CMD echo "The ShengnianOS App will start in ${SOS_SLEEP}s" && \
    sleep ${SOS_SLEEP} && \
    java -Djava.security.egd=file:/dev/./urandom -jar /app.jar
