FROM openjdk:8
ADD movie-rating-service-1.jar movie-rating-service-1.jar
EXPOSE 9092
ENTRYPOINT ["java","-jar", "movie-rating-service-1.jar"]