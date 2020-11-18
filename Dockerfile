FROM openjdk:8

COPY ./order-management/target/order-management-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app

CMD ["java","-jar","order-management-0.0.1-SNAPSHOT.jar"]

