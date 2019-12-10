package com.guanwanli.producer.configs;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.Queue;

/**
 * @author:wanliguan
 * @date:2019/12/10
 * @description:
 */
@Configuration
public class BeanConfig {
    //定义存放消息的队列
    @Bean
    public Queue queue() {
        return new ActiveMQQueue("ActiveMQQueue");
    }
}
