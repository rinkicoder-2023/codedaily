package com.springmvc.controller;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class Publisher {

    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection connection = connectionFactory.newConnection();
        Channel channel = connection.createChannel();

        String message = "Second message to RabbitMq on 29jan 2023";
        String mobile = "MOBILE message to RabbitMq on 28jan 2023";
        String tv = "TV message to RabbitMq on 28jan 2023";
        String ac = "AC message to RabbitMq on 28jan 2023";
        channel.basicPublish("","Queue-28jan2023",null,message.getBytes());
        channel.basicPublish("Direct-Exchange","mobile",null,mobile.getBytes());
        channel.basicPublish("Direct-Exchange","tv",null,tv.getBytes());
        channel.basicPublish("Direct-Exchange","ac",null,ac.getBytes());

        channel.close();
        connection.close();
    }
}
