FROM java:8-jdk-alpine 
EXPOSE 8020
ADD target/docker.jar docker.jar
ENTRYPOINT ["java","-jar","/docker.jar"]