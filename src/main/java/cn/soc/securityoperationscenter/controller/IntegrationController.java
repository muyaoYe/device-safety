package cn.soc.securityoperationscenter.controller;

import cn.soc.securityoperationscenter.common.CommonResult;
import cn.soc.securityoperationscenter.entity.RiskCheckMission;
import cn.soc.securityoperationscenter.entity.RiskTrackMission;
import cn.soc.securityoperationscenter.enums.CodeEnum;
import cn.soc.securityoperationscenter.service.IRiskCheckMissionService;
import cn.soc.securityoperationscenter.service.IRiskTrackMissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/IntegrationController")
@ResponseBody
public class IntegrationController {

    //风险检测
    @Autowired
    private IRiskCheckMissionService riskCheckMissionService;
    //风险跟踪
    @Autowired
    private IRiskTrackMissionService riskTrackMissionService;

    //查询所有风险任务
    @RequestMapping("/checkAll")
    public CommonResult selectAllCheck(){
        //查找所有风险任务
        List<RiskCheckMission> riskCheckMissionList = riskCheckMissionService.selectAll();
        //将列表返回
        return new CommonResult(CodeEnum.SUCCESS.getValue(),CodeEnum.SUCCESS.getText(),riskCheckMissionList);
    }

    //查询所有风险跟踪
    @RequestMapping("/trackAll")
    public CommonResult selectAllTrack(){
        //查找所有风险跟踪
        List<RiskTrackMission> riskTrackMissionList = riskTrackMissionService.selectAll();
        //fanhui
        return new CommonResult(CodeEnum.SUCCESS.getValue(),CodeEnum.SUCCESS.getText(),riskTrackMissionList);
    }

}
