package cn.soc.securityoperationscenter.controller;

import cn.soc.securityoperationscenter.common.CommonResult;

import cn.soc.securityoperationscenter.service.IAppRiskCheckMissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

//只返回json数据
@RestController
@RequestMapping("/app-lifecycle-manager")
public class AppSecurityController {

    @Autowired
    IAppRiskCheckMissionService appRiskCheckMissionService;

    @RequestMapping("safe-check-list")
    @ResponseBody
    public CommonResult allAppSecurityCheck(){

        System.out.println("查询应用安全检测表");
        return new CommonResult("111","查询成功",appRiskCheckMissionService.selectAll());
    }


}
