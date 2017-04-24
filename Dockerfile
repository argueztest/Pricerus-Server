FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD pricerus-api.jar pricerus-api.jar
RUN sh -c 'touch /pricerus-api.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /pricerus-api.jar" ]