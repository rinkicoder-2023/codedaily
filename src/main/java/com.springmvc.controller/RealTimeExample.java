package com.springmvc.controller;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import org.json.JSONObject;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class RealTimeExample {

    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection connection = connectionFactory.newConnection();
        Channel channel = connection.createChannel();

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("from_date","20-09-2009");
        jsonObject.put("to_date","18-09-2029");
        jsonObject.put("origin","WEB");
        jsonObject.put("email","xyz@gmail.com");

        channel.basicPublish("","Queue-28jan2023",null,jsonObject.toString().getBytes());

        channel.close();
        connection.close();
    }
}
