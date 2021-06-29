package cn.soc.securityoperationscenter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "cn.soc" })
public class SecurityOperationsCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityOperationsCenterApplication.class, args);
    }

}
