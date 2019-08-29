package cn.virde.example.dubbo.consumer;

import cn.virde.example.dubbo.api.service.HelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoConsumerApplication implements CommandLineRunner {

    @Reference(version = "1.0.0")
    private HelloService helloService;

    public static void main(String[] args) {
        SpringApplication.run(DemoConsumerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(helloService.sayHello("SunAo "));
    }

}
