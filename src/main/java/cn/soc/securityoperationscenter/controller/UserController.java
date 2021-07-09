package cn.soc.securityoperationscenter.controller;

import cn.soc.securityoperationscenter.common.CommonResult;
import cn.soc.securityoperationscenter.common.PageResult;
import cn.soc.securityoperationscenter.entity.Users;
import cn.soc.securityoperationscenter.enums.CodeEnum;
import cn.soc.securityoperationscenter.service.IUsersService;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public CommonResult toLogin(@RequestBody JSONObject json) {
        System.out.println("进入了用户登录方法");
//        System.out.println("11111111111111111" + json);
        //接收url传值
        String username = json.getString("username");
        String password = json.getString("password");
        //查询是否有数据
        Users user = usersService.selectByNamePass(username, password);
        if (user != null) {
            //把用户的登录状态status改为已登录1
            user.setStatus(1);
            user.setLastlogintime(null);
            //并在数据库中进行更新
            usersService.updateByPrimaryKey(user);
            return new CommonResult(CodeEnum.SUCCESS.getValue(), CodeEnum.SUCCESS.getText(), user);
        }
        return new CommonResult(CodeEnum.ERROR.getValue(), "账号密码错误", null);
    }

    //登陆后查询到当前用户
    @RequestMapping("/userInfo")
    public CommonResult userInfo(@RequestBody JSONObject json) {
        Integer id = json.getInteger("id");
        Users users = usersService.selectByPrimaryKey(id);
        Map<String, Object> map = new HashMap<>();
        String[] strings = new String[1];
        if (users.getJurisdiction() == 1) {
            strings[0] = "admin";
        } else {
            strings[0] = "user";
        }
        map.put("permissions", strings);
        map.put("username", users.getUsername());
        map.put("user", users);
        return new CommonResult(CodeEnum.SUCCESS.getValue(), CodeEnum.SUCCESS.getText(), map);
    }

    //注册
    @RequestMapping("/register")
    public CommonResult toRegist(@RequestBody JSONObject json) {
        //获取前端传入的数据
        //用户名 密码 电话 邮箱
        String username = json.getString("username");
        String password = json.getString("password");
        String telephone = json.getString("phone");
        String email = json.getString("email");
        //查询手机以及邮箱是否已经被使用
        if (usersService.isOnlyTelephoneEmail(telephone, email) != null) {
            return new CommonResult(CodeEnum.ERROR.getValue(), "手机或者邮箱已经被使用", null);
        }
        Users user = new Users();
        user.setUsername(username);
        user.setPassword(password);
        user.setTelephone(telephone);
        user.setEmail(email);

        int i = usersService.insert(user);
        if (i != 0) {
            return new CommonResult(CodeEnum.SUCCESS.getValue(), CodeEnum.SUCCESS.getText(), user);
        } else {
            return new CommonResult(CodeEnum.ERROR.getValue(), CodeEnum.ERROR.getText(), null);
        }

    }

    //添加用户
    @RequestMapping("/addUser")
    public CommonResult addUser(@RequestBody JSONObject json) {
        String username = json.getString("username");
        String telephone = json.getString("telephone");
        String email = json.getString("email");
        int jurisdiction = json.getInteger("jurisdiction");
        //查询手机以及邮箱是否已经被使用
        if (usersService.isOnlyTelephoneEmail(telephone, email) != null) {
            return new CommonResult(CodeEnum.ERROR.getValue(), "手机或者邮箱已经被使用", null);
        }
        Users user = new Users();
        user.setUsername(username);
        user.setPassword("123123");
        user.setJurisdiction(jurisdiction);
        user.setTelephone(telephone);
        user.setEmail(email);

        int i = usersService.insert(user);
        if (i != 0) {
            return new CommonResult(CodeEnum.SUCCESS.getValue(), CodeEnum.SUCCESS.getText(), user);
        } else {
            return new CommonResult(CodeEnum.ERROR.getValue(), CodeEnum.ERROR.getText(), null);
        }

    }


    //退出登录
    @RequestMapping("/logout")
    public CommonResult toLayout(@RequestHeader("id") int id) {
        //获取前端传入的数据
        //id
//        int id = Integer.parseInt(json.getString("id"));
        Users user = usersService.selectByPrimaryKey(id);
        //将用户的登录状态设为未登录
        user.setStatus(0);
        int i = usersService.updateByPrimaryKey(user);
        if (i != 0) {
            return new CommonResult(CodeEnum.SUCCESS.getValue(), CodeEnum.SUCCESS.getText(), null);
        } else {
            return new CommonResult(CodeEnum.ERROR.getValue(), CodeEnum.ERROR.getText(), null);
        }
    }

    //用户管理查询所有用户
    @RequestMapping("/userList")
    public CommonResult userList(@RequestBody JSONObject json) {
        Integer pageNum = json.getInteger("pageNum");
        Users users = new Users();
        String telephone = json.getString("telephone");
        String email = json.getString("email");
        String status1 = json.getString("status");
        Integer status = null;
        if (status1 != null && !status1.equals("")) {
            status = Integer.parseInt(status1);
        }
        String username = json.getString("username");
//        Integer pageSize = json.getInteger("pageSize");
        users.setTelephone(telephone);
        users.setEmail(email);
        users.setStatus(status);
        users.setUsername(username);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//        System.out.println(users.getStatus().toString());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        //查询用户列表
        PageResult pageResult = usersService.selectAll(pageNum, 5, users);
        //返回
        return new CommonResult(CodeEnum.SUCCESS.getValue(), CodeEnum.SUCCESS.getText(), pageResult);
    }

    //修改用户信息
    @RequestMapping("/update")
    public CommonResult update(@RequestBody JSONObject json) {
//        修改的用户
        int id = Integer.parseInt(json.getString("id"));
//        常规修改
        String telephone = json.getString("telephone");
        String email = json.getString("email");
        int jurisdiction = Integer.parseInt(json.getString("jurisdiction"));
        String username = json.getString("username");
//        获取改用户全部信息
        Users user = usersService.selectByPrimaryKey(id);
        //查询手机以及邮箱是否已经被使用
        int[] onlyTelephoneEmail = usersService.isOnlyTelephoneEmail(telephone, email);
        /**
         * 判断是否重复方法，
         * 首先如果重复数组一定不为空，如果数组长度大于2，必定重复
         *                          如果数组长度等于1，则id与自己不符合是重复
         */
        if (onlyTelephoneEmail != null && (
                onlyTelephoneEmail.length >= 2 ||
                        (onlyTelephoneEmail.length == 1 && onlyTelephoneEmail[0] != user.getId())
        )) {
            return new CommonResult(CodeEnum.ERROR.getValue(), "手机或者邮箱已经被使用", null);
        }
//        修改信息
        user.setJurisdiction(jurisdiction);
        user.setTelephone(telephone);
        user.setEmail(email);
        user.setUsername(username);
        int i = usersService.updateByPrimaryKey(user);
        if (i != 0) {
            return new CommonResult(CodeEnum.SUCCESS.getValue(), CodeEnum.SUCCESS.getText(), null);
        } else {
            return new CommonResult(CodeEnum.ERROR.getValue(), CodeEnum.ERROR.getText(), null);
        }
    }


    //修改用户信息
    @RequestMapping("/updatePassword")
    public CommonResult updatePassword(@RequestHeader("id") int id ,@RequestBody JSONObject json) {
//        特殊处理
        String password = json.getString("password");
//        获取改用户全部信息
        Users user = usersService.selectByPrimaryKey(id);
//        特殊处理
        System.out.println(password);
        if (password == null || password.equals("")) {
            return new CommonResult(CodeEnum.ERROR.getValue(),"密码为空",null);
        }
        user.setPassword(password);
        System.out.println(user.getPassword());
        int i = usersService.updateByPrimaryKey(user);
        if (i != 0) {
            return new CommonResult(CodeEnum.SUCCESS.getValue(), CodeEnum.SUCCESS.getText(), null);
        } else {
            return new CommonResult(CodeEnum.ERROR.getValue(), CodeEnum.ERROR.getText(), null);
        }
    }
    //删除用户
    @RequestMapping("/delete")
    public CommonResult delete(@RequestBody JSONObject json) {
        int id = Integer.parseInt(json.getString("id"));
        int i = usersService.deleteByPrimaryKey(id);
        if (i != 0) {
            return new CommonResult(CodeEnum.SUCCESS.getValue(), CodeEnum.SUCCESS.getText(), null);
        } else {
            return new CommonResult(CodeEnum.ERROR.getValue(), CodeEnum.ERROR.getText(), null);
        }
    }

}
