package cn.soc.securityoperationscenter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication

@EnableTransactionManagement
@MapperScan(value = "cn.soc.securityoperationscenter.dao")


public class SecurityOperationsCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityOperationsCenterApplication.class, args);
    }

}
