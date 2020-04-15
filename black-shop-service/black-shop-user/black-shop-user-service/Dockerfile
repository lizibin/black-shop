FROM java:8-jre

MAINTAINER 125720240@qq.com

ENV TZ=Asia/Shanghai

RUN ln -sf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone \
    && mkdir -p /black-shop-user-service

WORKDIR /black-shop-user-service

EXPOSE 8010

ADD ./target/black-shop-user-service.jar ./

CMD  java -Xms300m -Xm300m -Djava.security.egd=file:/dev/./urandom -jar black-shop-user-service.jar
