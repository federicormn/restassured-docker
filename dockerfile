FROM maven:3.8.7-eclipse-temurin-8-alpine
COPY . . 
RUN mvn install -Dmaven.test.skip
CMD mvn test -Dtest="TodoLy_CRUD.java"

#docker build . -t restassured --> crear imagen