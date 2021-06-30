package cn.soc.securityoperationscenter.controller;


import cn.soc.securityoperationscenter.common.CommonResult;
import cn.soc.securityoperationscenter.entity.WarningManager;
import cn.soc.securityoperationscenter.enums.CodeEnum;
import cn.soc.securityoperationscenter.service.IWarningManagerService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


//@Controller
@RestController
@RequestMapping("/warningManagerController")
@ResponseBody
public class WarningManagerController {

    @Autowired
    private IWarningManagerService warningManagerService;

    @RequestMapping("/selectAll")
    public CommonResult selectAll() {
        //查找所有的安全通告预警
        List<WarningManager> warningManagerList = warningManagerService.selectAll();

        return new CommonResult(CodeEnum.SUCCESS.getValue(), CodeEnum.SUCCESS.getText(),warningManagerList );
    }

    @RequestMapping("/createWarning")
    public CommonResult insert(@RequestBody JSONObject json) {
        //得到传值
        String missionName = json.getString("missionName");
        String missionstatus = json.getString("missionStatus");
        //新建对象放预警
        WarningManager warningManager = new WarningManager();
        warningManager.setMissionName(missionName);
        warningManager.setMissionStatus(missionstatus);
        //返回
        return new CommonResult(CodeEnum.SUCCESS.getValue(), CodeEnum.SUCCESS.getText(), null);
    }


}
