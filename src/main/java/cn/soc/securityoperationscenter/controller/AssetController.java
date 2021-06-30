package cn.soc.securityoperationscenter.controller;

import cn.soc.securityoperationscenter.common.CommonResult;
import cn.soc.securityoperationscenter.entity.Assets;
import cn.soc.securityoperationscenter.entity.Users;
import cn.soc.securityoperationscenter.enums.CodeEnum;
import cn.soc.securityoperationscenter.service.IAssetService;
import cn.soc.securityoperationscenter.service.IUsersService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@ResponseBody
@RequestMapping("/assetController")
public class AssetController {
    //资产管理
    @Autowired
    private IAssetService assetService;

    //查询所有资产
    @RequestMapping("/assetAll")
    public CommonResult selectAllAsset(){
        //查询所有资产返回集合
        List<Assets> assetsList = assetService.selectAll();

        //找到的返回给前端
        return new CommonResult(CodeEnum.SUCCESS.getValue(),CodeEnum.SUCCESS.getText(),assetsList);

    }

    //新增资产
    @RequestMapping("/createAsset")
    public CommonResult createAsset(@RequestBody JSONObject json){
        //获取输入
        String intranetIp = json.getString("intranetIp");
        String intranetPort = json.getString("intranetPort");
        String portService = json.getString("portService");
        String extranetIp = json.getString("extranetIp");
        String extranetPort = json.getString("extranetPort");
        String domainName = json.getString("domainName");
        String assetLocation = json.getString("assetLocation");
        String businessType = json.getString("businessType");
        String serverType = json.getString("serverType");
        String osType = json.getString("osType");
        String appType = json.getString("appType");
        String version = json.getString("version");
        String parentProject = json.getString("parentProject");
        String chargePerson = json.getString("chargePerson");
        String chargeDepartment = json.getString("chargeDepartment");
        String email = json.getString("email");
        String telphone = json.getString("telphone");
        String note = json.getString("note");

        //创建asset实例
        Assets asset = new Assets();
        asset.setIntranetIp(intranetIp);
        asset.setIntranetPort(intranetPort);
        asset.setPortService(portService);
        asset.setExtranetIp(extranetIp);
        asset.setExtranetIp(extranetIp);
        asset.setExtranetPort(extranetPort);
        asset.setDomainName(domainName);
        asset.setAssetLocation(assetLocation);
        asset.setBusinessType(businessType);
        asset.setServerType(serverType);
        asset.setOsType(osType);
        asset.setAppType(appType);
        asset.setVersion(version);
        asset.setParentProject(parentProject);
        asset.setChargePerson(chargePerson);
        asset.setChargeDepartment(chargeDepartment);
        asset.setEmail(email);
        asset.setTelphone(telphone);
        asset.setNote(note);

        //进行insert操作
        int i = assetService.insert(asset);

        //返回
        return new CommonResult(CodeEnum.SUCCESS.getValue(),CodeEnum.SUCCESS.getText(),null);
    }

}