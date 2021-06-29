package cn.soc.securityoperationscenter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableAutoConfiguration
//@ComponentScan(basePackages = { "cn.soc.securityoperationscenter" })
@MapperScan(value = "cn.soc.securityoperationscenter.dao")

public class SecurityOperationsCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityOperationsCenterApplication.class, args);
    }

}
