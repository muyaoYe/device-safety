package cn.soc.securityoperationscenter.controller;

import cn.soc.securityoperationscenter.common.CommonResult;
import cn.soc.securityoperationscenter.common.PageResult;
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
import org.yaml.snakeyaml.events.Event;


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

    //查询所有应用安全检测-list
    @RequestMapping("/checkAll")
    public CommonResult selectAllCheck(@RequestBody JSONObject json) {
        Integer pageNum = json.getInteger("pageNum");
        //得到集合
        PageResult pageResult = appRiskCheckMissionService.selectAll(pageNum, 5);
        return new CommonResult(CodeEnum.SUCCESS.getValue(), CodeEnum.SUCCESS.getText(), pageResult);
    }

    //创建应用安全检测
    @RequestMapping("/createRiskCheck")
    public CommonResult insertCheck(@RequestBody JSONObject json) {
        //分页
        Integer pageNum = json.getInteger("pageNum");
        //是否添加到应用风险跟踪
//        Boolean flag = false;
        Boolean check = json.getBoolean("check");
//        if(check!=null){flag=true;}
        //得到参数
        String missionName = json.getString("missionName");
        Date cretaTime = new Date();
        Date executeTime = new Date();
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

        //是否添加到应用风险跟踪
        if (check!=null){
            AppRiskTrackMission appRiskTrack = new AppRiskTrackMission();
//            appRiskTrack.set
            appRiskTrack.setMissionName(missionName);
            appRiskTrack.setCreateTime(cretaTime);
            appRiskTrack.setUpdateTime(cretaTime);
            //添加操作
            int insert = appRiskTrackMissionService.insert(appRiskTrack);
        }else {
            System.out.println("不勾选");
        }

        //重新请求
        PageResult pageResult = appRiskCheckMissionService.selectAll(pageNum, 5);
        if(i!=0){
            return new CommonResult(CodeEnum.SUCCESS.getValue(), CodeEnum.SUCCESS.getText(), pageResult);
        }else {
            return new CommonResult(CodeEnum.ERROR.getValue(), CodeEnum.ERROR.getText(), pageResult);
        }

    }

    //删除应用安全检测数据
    @RequestMapping("/deleteCheck")
    public  CommonResult deleteCheck(@RequestBody JSONObject json){
        Integer pageNum = json.getInteger("pageNum");
        //获取要删除的id的索引
        Integer id = Integer.parseInt(json.getString("id"));
        //删除操作
        int i = appRiskCheckMissionService.deleteByPrimaryKey(id);
        //重新请求数据
        PageResult pageResult = appRiskCheckMissionService.selectAll(pageNum, 5);
        if(i!=0){
            return new CommonResult(CodeEnum.SUCCESS.getValue(), CodeEnum.SUCCESS.getText(), pageResult);
        }else {
            return new CommonResult(CodeEnum.ERROR.getValue(), CodeEnum.ERROR.getText(), pageResult);
        }
    }


    //应用风险跟踪
    @RequestMapping("/trackAll")
    public CommonResult selectAllRisk(@RequestBody JSONObject json){
        Integer pageNum = json.getInteger("pageNum");
        //查询所有风险跟踪值
        PageResult pageResult = appRiskTrackMissionService.selectAll(pageNum, 5);
        return new CommonResult(CodeEnum.SUCCESS.getValue(), CodeEnum.SUCCESS.getText(), pageResult);
    }

    //应用风险跟踪创建
    @RequestMapping("/createRiskTrack")
    public CommonResult insertTrack(@RequestBody JSONObject json) {
        Integer pageNum = json.getInteger("pageNum");
        //得到参数
        String missionName = json.getString("missionName");
        Date createTime = new Date();
        String missionType = json.getString("missionType");
        Date updateTime = new Date();

        //创建对象接收参数
        AppRiskTrackMission appRiskTrack = new AppRiskTrackMission();
        appRiskTrack.setMissionName(missionName);
        appRiskTrack.setMissionType(missionType);
        //任务名称/扫描模板/备注
        //创建时间
        appRiskTrack.setCreateTime(createTime);
        //执行时间
        appRiskTrack.setUpdateTime(updateTime);

        //insert操作
        int i = appRiskTrackMissionService.insert(appRiskTrack);
        //请求数据
        PageResult pageResult = appRiskTrackMissionService.selectAll(pageNum, 5);
        if(i!=0){
            return new CommonResult(CodeEnum.SUCCESS.getValue(), CodeEnum.SUCCESS.getText(), pageResult);
        }else {
            return new CommonResult(CodeEnum.ERROR.getValue(), CodeEnum.ERROR.getText(), pageResult);
        }
    }


    //应用风险跟踪创建
    @RequestMapping("/deleteTrack")
    public CommonResult deleteTrack(@RequestBody JSONObject json) {
        Integer pageNum = json.getInteger("pageNum");
        //得到参数
        Integer id = json.getInteger("id");

        //shanchu
        int i = appRiskTrackMissionService.deleteByPrimaryKey(id);
        //请求数据
        PageResult pageResult = appRiskTrackMissionService.selectAll(pageNum, 5);
        if(i!=0){
            return new CommonResult(CodeEnum.SUCCESS.getValue(), CodeEnum.SUCCESS.getText(), pageResult);
        }else {
            return new CommonResult(CodeEnum.ERROR.getValue(), CodeEnum.ERROR.getText(), pageResult);
        }
    }

}
