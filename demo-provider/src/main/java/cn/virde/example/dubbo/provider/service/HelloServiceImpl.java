package cn.virde.example.dubbo.provider.service;

import cn.virde.example.dubbo.api.service.HelloService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author SunAo
 * @Date 2019/8/29
 **/
@Service(version = "1.0.0")
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
