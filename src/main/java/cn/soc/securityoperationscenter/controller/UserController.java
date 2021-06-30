package cn.soc.securityoperationscenter.controller;

import cn.soc.securityoperationscenter.common.CommonResult;
import cn.soc.securityoperationscenter.entity.Users;
import cn.soc.securityoperationscenter.service.IUsersService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wjs
 * @Classname userController
 * @Description TODO
 * @Date 2021/5/23 0:24
 * @Created by wjs
 */
@RestController
@ResponseBody
public class UserController {

    @Autowired
    IUsersService usersService;

    @RequestMapping("/test")
    public String test() {
        return "this is a test";
    }

    @RequestMapping("/login")
    public CommonResult toLogin(@RequestBody JSONObject json){
        //接收url传值
        String username = json.getString("username");
        String password = json.getString("password");
        //查询是否有数据
        Users user = usersService.selectByNamePass(username,password);
        if(user!=null){

            //把用户信息传入session

            return new CommonResult("200","success",user);
        }
        return new CommonResult("100","error",null);
    }

    @RequestMapping("/regist")
    public CommonResult toRegist(@RequestBody JSONObject json ){
        String username = json.getString("username");
        String password = json.getString("password");
        Users user = new Users();
        user.setUsername(username);
        user.setPassword(password);
        int i = usersService.insert(user);
        if (i!=0){
            return new CommonResult("200","success",user);
        }
        return new CommonResult("100","error",null);
    }

    @RequestMapping("layout")
    public  CommonResult toLayout(){
        return null;
    }


}
