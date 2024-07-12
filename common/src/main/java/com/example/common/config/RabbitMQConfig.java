package com.example.common.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // 声明这是一个配置类
public class RabbitMQConfig {

    // 定义队列名称、交换器名称和路由键
    public static final String QUEUE_NAME = "demo-queue";
    public static final String EXCHANGE_NAME = "demo-exchange";
    public static final String ROUTING_KEY = "demo.routing.key";

    @Bean // 声明一个持久化的队列
    public Queue queue() {
        return new Queue(QUEUE_NAME, true);
    }

    @Bean // 声明一个Topic类型的交换器
    public TopicExchange exchange() {
        return new TopicExchange(EXCHANGE_NAME);
    }

    @Bean // 将队列和交换器通过路由键绑定
    public Binding binding(Queue queue, TopicExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(ROUTING_KEY);
    }
}
