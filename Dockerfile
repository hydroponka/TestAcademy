FROM adoptopenjdk:17-jdk-hotspot
ADD target/TestAcademy.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]