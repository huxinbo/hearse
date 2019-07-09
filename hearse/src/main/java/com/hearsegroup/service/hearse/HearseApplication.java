package com.hearsegroup.service.hearse;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import redis.clients.jedis.Jedis;

@SpringBootApplication
@EnableTransactionManagement
@EnableConfigurationProperties
@MapperScan("com.cheezgroup.service.purchase.mapper")
public class HearseApplication {

    public static void main(String[] args) {
        SpringApplication.run(HearseApplication.class, args);

      /*  Jedis jedis = new Jedis("6379");
        System.out.println("连接成功");
        // 查看服务是否运行
        System.out.println("服务正在运行: " + jedis.ping());*/
    }

}
