FROM openjdk:8

COPY ./order-management/target/order-management-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app

#CMD command can get arguments from outside 
#For these reason, You should be aware of that outside arguments override default 
CMD ["java","-jar","order-management-0.0.1-SNAPSHOT.jar"]

