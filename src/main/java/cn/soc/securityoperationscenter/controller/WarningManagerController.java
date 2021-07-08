package cn.soc.securityoperationscenter.controller;


import cn.soc.securityoperationscenter.common.CommonResult;
import cn.soc.securityoperationscenter.entity.WarningManager;
import cn.soc.securityoperationscenter.entity.WarningManagerShow;
import cn.soc.securityoperationscenter.enums.CodeEnum;
import cn.soc.securityoperationscenter.service.IUsersService;
import cn.soc.securityoperationscenter.service.IWarningManagerService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


//@Controller
@RestController
@RequestMapping("/warningManagerController")
@ResponseBody
public class WarningManagerController {

    @Autowired
    private IWarningManagerService warningManagerService;

    @Autowired
    private IUsersService usersService;

    @RequestMapping("/selectAll")
    public CommonResult selectAll() {
        //查找所有的安全通告预警
        List<WarningManager> warningManagerList = warningManagerService.selectAll();
        List<WarningManagerShow> list = new ArrayList<>();
        for (WarningManager warning : warningManagerList) {
            WarningManagerShow warningManagerShow = new WarningManagerShow();
            warningManagerShow.setId(warning.getId());
            warningManagerShow.setMissionName(warning.getMissionName());
            warningManagerShow.setMissionStatus(warning.getMissionStatus());
            warningManagerShow.setCreatePerson(usersService.selectByPrimaryKey(warning.getCreatePerson()).getUsername());
            warningManagerShow.setCreateTime(warning.getCreateTime());
            list.add(warningManagerShow);
        }
        return new CommonResult(CodeEnum.SUCCESS.getValue(), CodeEnum.SUCCESS.getText(),list );
    }

    @RequestMapping("/createWarning")
    public CommonResult insert(@RequestBody JSONObject json, @RequestHeader("id") int id) {
        //得到传值
        String missionName = json.getString("missionName");
        String missionstatus = json.getString("missionStatus");
        //新建对象放预警
        WarningManager warningManager = new WarningManager();
        warningManager.setMissionName(missionName);
        warningManager.setMissionStatus(missionstatus);
        warningManager.setCreatePerson(id);
        //进行创建操作
        int i = warningManagerService.insert(warningManager);
        //重新求值
        List<WarningManager> warningManagerList = warningManagerService.selectAll();
        //返回
        if(i!=0){
            return new CommonResult(CodeEnum.SUCCESS.getValue(), CodeEnum.SUCCESS.getText(), warningManagerList);
        }else {
            return new CommonResult(CodeEnum.ERROR.getValue(), CodeEnum.ERROR.getText(), warningManagerList);
        }
    }



}
