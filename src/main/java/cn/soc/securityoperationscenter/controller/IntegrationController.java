package cn.soc.securityoperationscenter.controller;

import cn.soc.securityoperationscenter.common.CommonResult;
import cn.soc.securityoperationscenter.entity.RiskCheckMission;
import cn.soc.securityoperationscenter.entity.RiskTrackMission;
import cn.soc.securityoperationscenter.enums.CodeEnum;
import cn.soc.securityoperationscenter.service.IRiskCheckMissionService;
import cn.soc.securityoperationscenter.service.IRiskTrackMissionService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
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

    //新增主机风险任务
    @RequestMapping("/reateTaskHost")
    public CommonResult createCheck(@RequestBody JSONObject json){
        //获取输入
        String missionName = json.getString("missionName");
        //还会输入资产范围、关联资产、扫描方式、执行时间
        //但是这些字段表都没有
        //存放对象
        RiskCheckMission riskCheckMission = new RiskCheckMission();
        riskCheckMission.setMissionName(missionName);
        //第一次创建，创建时间与更新时间相同
        riskCheckMission.setCreateTime(new Date());
        riskCheckMission.setUpdateTime(new Date());
        //新增操作
        int i = riskCheckMissionService.insert(riskCheckMission);
        if(i!=0){
            return new CommonResult(CodeEnum.SUCCESS.getValue(), CodeEnum.SUCCESS.getText(), null);
        }else {
            return new CommonResult(CodeEnum.ERROR.getValue(), CodeEnum.ERROR.getText(), null);
        }
    }

    //删除风险任务
    @RequestMapping("/deleteCheck")
    public CommonResult deleteCheck(@RequestBody JSONObject json){
        //通过id删除
        Integer id = Integer.parseInt(json.getString("id"));
        int i = riskCheckMissionService.deleteByPrimaryKey(id);
        if(i!=0){
            return new CommonResult(CodeEnum.SUCCESS.getValue(), CodeEnum.SUCCESS.getText(), null);
        }else {
            return new CommonResult(CodeEnum.ERROR.getValue(), CodeEnum.ERROR.getText(), null);
        }
    }

    //查询所有风险跟踪
    @RequestMapping("/trackAll")
    public CommonResult selectAllTrack(){
        //查找所有风险跟踪
        List<RiskTrackMission> riskTrackMissionList = riskTrackMissionService.selectAll();
        //fanhui
        return new CommonResult(CodeEnum.SUCCESS.getValue(),CodeEnum.SUCCESS.getText(),riskTrackMissionList);
    }

    //删除风险跟踪
    @RequestMapping("/deleteTrack")
    public CommonResult deleteTrack(@RequestBody JSONObject json){
        //通过id删除
        Integer id = Integer.parseInt(json.getString("id"));
        int i = riskTrackMissionService.deleteByPrimaryKey(id);
        if(i!=0){
            return new CommonResult(CodeEnum.SUCCESS.getValue(), CodeEnum.SUCCESS.getText(), null);
        }else {
            return new CommonResult(CodeEnum.ERROR.getValue(), CodeEnum.ERROR.getText(), null);
        }
    }

    //现有风险任务跟踪
    @RequestMapping("/createTaskExists")
    public CommonResult createTarck(@RequestBody JSONObject json){
        //获取输入
        String missionName = json.getString("missionName");
        //还会输入资产范围、关联资产、扫描方式、执行时间
        //但是这些字段表都没有
        //存放对象
        RiskTrackMission riskTrackMission = new RiskTrackMission();
        riskTrackMission.setMissionName(missionName);
        //第一次创建，创建时间与更新时间相同
        riskTrackMission.setCreateTime(new Date());
        riskTrackMission.setUpdateTime(new Date());
        //新增操作
        int i = riskTrackMissionService.insert(riskTrackMission);
        if(i!=0){
            return new CommonResult(CodeEnum.SUCCESS.getValue(), CodeEnum.SUCCESS.getText(), null);
        }else {
            return new CommonResult(CodeEnum.ERROR.getValue(), CodeEnum.ERROR.getText(), null);
        }
    }

}
