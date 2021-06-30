package cn.soc.securityoperationscenter.controller;

import cn.soc.securityoperationscenter.common.CommonResult;
import cn.soc.securityoperationscenter.entity.AppRiskCheckMission;
import cn.soc.securityoperationscenter.entity.AppRiskTrackMission;
import cn.soc.securityoperationscenter.enums.CodeEnum;
import cn.soc.securityoperationscenter.service.IAppRiskCheckMissionService;
import cn.soc.securityoperationscenter.service.IAppRiskTrackMissionService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/appSecurityController")
@ResponseBody
public class SecurityController {

    @Autowired
    private IAppRiskCheckMissionService appRiskCheckMissionService;
    @Autowired
    private IAppRiskTrackMissionService appRiskTrackMissionService;

    //应用安全检测-list
    @RequestMapping("/checkAll")
    public CommonResult selectAllCheck() {
        //得到集合
        List<AppRiskCheckMission> appRiskCheckMissionList = appRiskCheckMissionService.selectAll();
        return new CommonResult(CodeEnum.SUCCESS.getValue(), CodeEnum.SUCCESS.getText(), appRiskCheckMissionList);
    }

    //创建应用安全检测
    @RequestMapping("/createRiskCheck")
    public CommonResult insertCheck(@RequestBody JSONObject json) {
        //得到参数
        String missionName = json.getString("missionName");
        Date cretaTime = json.getDate("createTime");
        Date executeTime = json.getDate("executeTime");
        //创建对象接收参数
        AppRiskCheckMission appRiskCheck = new AppRiskCheckMission();
        appRiskCheck.setMissionName(missionName);
        //任务名称/扫描模板/备注
        //创建时间
        appRiskCheck.setCreateTime(cretaTime);
        //执行时间
        appRiskCheck.setExecuteTime(executeTime);

        //insert操作
        int i = appRiskCheckMissionService.insert(appRiskCheck);

        return new CommonResult(CodeEnum.SUCCESS.getValue(), CodeEnum.SUCCESS.getText(), null);
    }

    //删除应用安全检测数据
    @RequestMapping("/deleteCheck")
    public  CommonResult deleteCheck(@RequestBody JSONObject json){
        //获取要删除的id的索引
        int id = json.getInteger("id");
        //删除操作
        int i = appRiskCheckMissionService.deleteByPrimaryKey(id);

        return new CommonResult(CodeEnum.SUCCESS.getValue(),CodeEnum.SUCCESS.getText(),null);
    }


    //应用风险跟踪
    @RequestMapping("/trackAll")
    public CommonResult selectAllRisk(){
        //查询所有风险跟踪值
        List<AppRiskTrackMission> appRiskTrackMissionList = appRiskTrackMissionService.selectAll();
        return new CommonResult(CodeEnum.SUCCESS.getValue(), CodeEnum.SUCCESS.getText(), appRiskTrackMissionList);
    }

    //应用风险跟踪创建
    @RequestMapping("/createRiskTrack")
    public CommonResult insertTrack(@RequestBody JSONObject json) {
        //得到参数
        String missionName = json.getString("missionName");
        Date cretaTime = json.getDate("createTime");
        Date updateTime = json.getDate("updateTime");

        //创建对象接收参数
        AppRiskTrackMission appRiskTrack = new AppRiskTrackMission();
        appRiskTrack.setMissionName(missionName);
        //任务名称/扫描模板/备注
        //创建时间
        appRiskTrack.setCreateTime(cretaTime);
        //执行时间
        appRiskTrack.setUpdateTime(updateTime);

        //insert操作
        int i = appRiskTrackMissionService.insert(appRiskTrack);

        return new CommonResult(CodeEnum.SUCCESS.getValue(), CodeEnum.SUCCESS.getText(), null);
    }

}
