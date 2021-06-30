package cn.soc.securityoperationscenter.controller;

import cn.soc.securityoperationscenter.common.CommonResult;
import cn.soc.securityoperationscenter.entity.AppRiskCheckMission;
import cn.soc.securityoperationscenter.entity.WarningManager;
import cn.soc.securityoperationscenter.service.IAppRiskCheckMissionService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/appSecurityController")
@ResponseBody
public class SecurityController {

    @Autowired
    IAppRiskCheckMissionService appRiskCheckMissionService;
    //应用安全检测-list
    @RequestMapping("/checkAll")
    public CommonResult selectAllCheck() {

        System.out.println("进入到SecurityController的selectAllCheck()查询风险检测方法里了");

        return new CommonResult("200", "success", appRiskCheckMissionService.selectAll());
    }

    //创建应用安全检测
    @RequestMapping("/createRiskCheck")
    public CommonResult insertCheck(@RequestBody JSONObject json) {
        AppRiskCheckMission appRiskCheck = new AppRiskCheckMission();
        appRiskCheck.setMissionName(json.getString("missionName"));
        //任务名称/扫描模板/备注
        //创建时间
        appRiskCheck.setCreateTime(json.getDate("createTime"));
        //执行时间
        appRiskCheck.setExecuteTime(json.getDate("executeTime"));
        //创建人员直接session得到user？

        return new CommonResult("200", "success", null);
    }

    //



    @RequestMapping("/trackAll")
    public CommonResult selectAllRisk(){
        System.out.println("进入到SecurityController的selectAllRisk()查询风险跟踪方法里了");

        return new CommonResult("200", "success", appRiskCheckMissionService.selectAll());
    }

}
