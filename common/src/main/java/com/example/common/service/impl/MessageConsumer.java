package com.example.common.service.impl;

import com.example.common.service.EmailService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import com.example.common.config.RabbitMQConfig;

@Service // 表示这是一个服务类（Spring Service），会被Spring上下文扫描并注册为Bean
public class MessageConsumer {
    @Autowired
    private EmailService emailService; // 自动注入EmailService实例

    @RabbitListener(queues = RabbitMQConfig.QUEUE_NAME) // 监听指定队列的消息
    public void receiveMessage(String message) {
        // 打印接收到的消息
        System.out.println("Message received: " + message);

        // 解析消息，假设消息内容是收件人邮箱地址
        String email = message;

        // 发送邮件
        emailService.sendEmail(email, "如何匹配到高质量队友", "This is a test email sent via RabbitMQ.");
    }


}