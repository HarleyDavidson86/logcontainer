FROM amazoncorretto:21-alpine
### Set timezone
RUN apk add --no-cache tzdata
ENV TZ=Europe/Berlin

WORKDIR /app
COPY target/logcontainer.jar app.jar
COPY target/lib lib

ENTRYPOINT ["java","-jar","app.jar"]