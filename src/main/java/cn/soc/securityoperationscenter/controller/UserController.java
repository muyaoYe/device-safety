package cn.soc.securityoperationscenter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wjs
 * @Classname userController
 * @Description TODO
 * @Date 2021/5/23 0:24
 * @Created by wjs
 */
@RestController
public class UserController {
    @RequestMapping("/test")
    public String test() {
        return "this is a test";
    }
}
