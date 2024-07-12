package com.example.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service // 表示这是一个服务类，会被Spring上下文扫描并注册为Bean
public class EmailService {

    @Autowired
    private JavaMailSender mailSender; // 自动注入JavaMailSender实例

    // 发送邮件的方法
    @Async
    @Transactional
    public void sendEmail(String to, String subject, String text) {
        try {
            SimpleMailMessage message = new SimpleMailMessage(); // 创建简单邮件消息对象
            message.setTo(to); // 设置收件人邮箱地址
            message.setSubject(subject); // 设置邮件主题
            message.setText(text); // 设置邮件内容
            message.setFrom("729421463@qq.com"); // 设置发件人邮箱地址

            mailSender.send(message); // 发送邮件

            System.out.println("Email sent to: " + to); // 打印发送日志
        }catch (Exception e){
            System.err.println("Error sending email: " + e.getMessage());
            e.printStackTrace();
            // 手动回滚事务
            throw new RuntimeException("Transaction failed and rolled back.");
        }


    }
}