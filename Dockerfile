FROM openjdk:8

COPY ./order-management/target/order-management-0.0.1-SNAPSHOT.jar order-management-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","order-management-0.0.1-SNAPSHOT.jar"]

