package cn.soc.securityoperationscenter.controller;

import cn.soc.securityoperationscenter.common.CommonResult;
import cn.soc.securityoperationscenter.entity.Users;
import cn.soc.securityoperationscenter.enums.CodeEnum;
import cn.soc.securityoperationscenter.service.IUsersService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/userController")
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
        System.out.println("进入了用户登录方法");
        //接收url传值
        String username = json.getString("username");
        String password = json.getString("password");
        //查询是否有数据
        Users user = usersService.selectByNamePass(username,password);
        if(user!=null){
            //把用户的登录状态status改为已登录1
            user.setStatus(1);
            //并在数据库中进行更新
            usersService.updateByPrimaryKey(user);
            return new CommonResult(CodeEnum.SUCCESS.getValue(), CodeEnum.SUCCESS.getText(),user);
        }
        return new CommonResult(CodeEnum.ERROR.getValue(), CodeEnum.ERROR.getText(),null);
    }

    @RequestMapping("/register")
    public CommonResult toRegist(@RequestBody JSONObject json){
        //获取前端传入的数据
        //用户名 密码 电话 邮箱
        String username = json.getString("username");
        String password = json.getString("password");
        String telephone = json.getString("telephone");
        String email = json.getString("email");
        Users user = new Users();
        user.setUsername(username);
        user.setPassword(password);
        user.setTelephone(telephone);
        user.setEmail(email);

        int i = usersService.insert(user);
        if (i!=0){
            return new CommonResult(CodeEnum.SUCCESS.getValue(), CodeEnum.SUCCESS.getText(),user);
        }
        return new CommonResult(CodeEnum.ERROR.getValue(), CodeEnum.ERROR.getText(),null);
    }

    @RequestMapping("/logout")
    public  CommonResult toLayout(@RequestBody JSONObject json){

        return new CommonResult("200","success",null);
    }


}
