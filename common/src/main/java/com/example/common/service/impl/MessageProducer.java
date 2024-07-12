package com.example.common.service.impl;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.common.config.RabbitMQConfig;

@Service // 表示这是一个服务类（Spring Service），会被Spring上下文扫描并注册为Bean
public class MessageProducer {

    @Autowired // 自动注入RabbitTemplate实例
    private RabbitTemplate rabbitTemplate;

    // 发送消息的方法
    public void sendMessage(String message) {
        // 使用RabbitTemplate发送消息
        // 第一个参数是交换器名称，这里使用配置类RabbitMQConfig中的EXCHANGE_NAME
        // 第二个参数是路由键，这里使用配置类RabbitMQConfig中的ROUTING_KEY
        // 第三个参数是消息的内容，这里是传入的字符串message
        rabbitTemplate.convertAndSend(RabbitMQConfig.EXCHANGE_NAME, RabbitMQConfig.ROUTING_KEY, message);
        // 打印消息发送的日志
        System.out.println("Message sent: " + message);
    }
}
