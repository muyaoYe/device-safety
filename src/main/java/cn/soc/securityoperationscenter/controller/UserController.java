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

import java.util.List;


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

    //登录
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

    //注册
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
        } else {
            return new CommonResult(CodeEnum.ERROR.getValue(), CodeEnum.ERROR.getText(),null);
        }

    }

    //退出登录
    @RequestMapping("/logout")
    public  CommonResult toLayout(@RequestBody JSONObject json){
        //获取前端传入的数据
        //id
        int id = Integer.parseInt(json.getString("id"));
        Users user = usersService.selectByPrimaryKey(id);
        //将用户的登录状态设为未登录
        user.setStatus(0);
        int i = usersService.updateByPrimaryKey(user);
        if (i!=0){
            return new CommonResult(CodeEnum.SUCCESS.getValue(), CodeEnum.SUCCESS.getText(),null);
        } else {
            return new CommonResult(CodeEnum.ERROR.getValue(), CodeEnum.ERROR.getText(),null);
        }

    }

    //用户管理查询所有用户
    @RequestMapping("/userList")
    public CommonResult userList(){
        //查询用户列表
        List<Users> usersList = usersService.selectAll();
        //返回
        return new CommonResult(CodeEnum.SUCCESS.getValue(), CodeEnum.SUCCESS.getText(),usersList);
    }



}
