FROM openjdk:8-jdk-alpine
WORKDIR /opt/pooja
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} /opt/pooja/app.jar
EXPOSE 8089
CMD java -jar app.jar
#ENTRYPOINT ["java","-jar","app.jar"]