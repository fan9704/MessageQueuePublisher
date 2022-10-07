# Refernce Article

1. [前端與RabbitMQ實時消息推送未讀消息小紅點實現示例](https://walkonnet.com/archives/547911)
2. [MQTT教學（六）：使用PubSubClient程式庫開發Arduino MQTT應用](https://swf.com.tw/?p=1021)

# Technical Support

### RabbitMQ

###### Enable MQTT

```shell
 rabbitmq-plugins enable rabbitmq_mqtt #For Backend
 rabbitmq-plugins enable rabbitmq_web_mqtt #For Frontend
 # Through Docker add docker exec <Container ID> 
```

###### Check System RabbitMQ

```shell
rabbitmqctl status
```