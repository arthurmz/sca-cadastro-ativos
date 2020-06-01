FROM maven:3.6.3-openjdk-8

COPY pom.xml /home/app/

WORKDIR /home/app

RUN mvn -B -f /home/app/pom.xml -s /usr/share/maven/ref/settings-docker.xml dependency:resolve

COPY . /home/app

RUN mvn clean package

#COPY *. app.jar