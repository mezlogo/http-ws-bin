FROM openjdk:11-jre-slim
COPY build/libs/http-ws-bin.jar http-ws-bin.jar
EXPOSE 8843
ENTRYPOINT ["java","-jar","/http-ws-bin.jar"]