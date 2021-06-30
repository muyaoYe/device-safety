package cn.soc.securityoperationscenter.controller;


import cn.soc.securityoperationscenter.common.CommonResult;
import cn.soc.securityoperationscenter.entity.WarningManager;
import cn.soc.securityoperationscenter.service.IWarningManagerService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


//@Controller
@RestController
@RequestMapping("/warningManagerController")
public class WarningManagerController {

    @Autowired
    private IWarningManagerService warningManagerService;

    @RequestMapping("/selectAll")
    @ResponseBody
    public CommonResult selectAll() {

        System.out.println("进入到WarningManagerController的selectAll方法里了");

        return new CommonResult("101", "查询成功", warningManagerService.selectAll());
    }

    public CommonResult insert(@RequestBody JSONObject json) {
        WarningManager warningManager = new WarningManager();
        warningManager.setMissionName(json.getString("missionName"));
        warningManager.setMissionStatus(json.getString("missionStatus"));

        return new CommonResult("101", "新增成功", null);
    }
}
