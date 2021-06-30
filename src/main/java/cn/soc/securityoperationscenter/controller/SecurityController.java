package cn.soc.securityoperationscenter.controller;

import cn.soc.securityoperationscenter.common.CommonResult;
import cn.soc.securityoperationscenter.service.IAppRiskCheckMissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/appSecurityController")
@ResponseBody
public class SecurityController {

    @Autowired
    IAppRiskCheckMissionService appRiskCheckMissionService;
    @RequestMapping("/checkAll")

    public CommonResult selectAllCheck() {

        System.out.println("进入到SecurityController的selectAllCheck()查询风险检测方法里了");

        return new CommonResult("101", "查询成功", appRiskCheckMissionService.selectAll());
    }

    @RequestMapping("/trackAll")
    public CommonResult selectAllRisk(){
        System.out.println("进入到SecurityController的selectAllRisk()查询风险跟踪方法里了");

        return new CommonResult("101", "查询成功", appRiskCheckMissionService.selectAll());
    }

}
