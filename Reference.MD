# Reference Article

1. [前端與RabbitMQ實時消息推送未讀消息小紅點實現示例](https://walkonnet.com/archives/547911)
2. [MQTT教學（六）：使用PubSubClient程式庫開發Arduino MQTT應用](https://swf.com.tw/?p=1021)
3. [MQTT Spring Boot Example](https://github.com/smltq/spring-boot-demo/tree/master/mqtt)
4. [Setup RabbitMQ with GitHub Actions](https://github.com/marketplace/actions/setup-rabbitmq-with-username-and-password)

# Technical Support

### RabbitMQ

###### Enable MQTT

```shell
 rabbitmq-plugins enable rabbitmq_mqtt #For Backend
 rabbitmq-plugins enable rabbitmq_web_mqtt #For Frontend
 # Through Docker add docker exec <Container ID> 
```

###### Open RabbitMQ
```shell
rabbitmq-server start
```

###### Check System RabbitMQ

```shell
rabbitmqctl status
```

### Spring Boot i18n Technical Support

1. [Spring Boot i18n example](https://bingdoal.github.io/backend/2021/12/i18n-internationalization-in-spring-boot/)