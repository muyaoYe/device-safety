package cn.soc.securityoperationscenter.controller;

import cn.soc.securityoperationscenter.common.CommonResult;
import cn.soc.securityoperationscenter.common.PageResult;
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
    public CommonResult selectAllAsset(@RequestBody JSONObject json){
        Integer pageNum = json.getInteger("pageNum");
        //查询所有资产返回集合
        PageResult pageResult = assetService.selectAll(pageNum, 5);

        //找到的返回给前端
        return new CommonResult(CodeEnum.SUCCESS.getValue(),CodeEnum.SUCCESS.getText(),pageResult);

    }

    //新增资产
    @RequestMapping("/createAsset")
    public CommonResult createAsset(@RequestBody JSONObject json){
        Integer pageNum = json.getInteger("pageNum");
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

        PageResult pageResult = assetService.selectAll(pageNum, 5);
        if(i!=0){
            return new CommonResult(CodeEnum.SUCCESS.getValue(), CodeEnum.SUCCESS.getText(),pageResult);
        }else{
            return new CommonResult(CodeEnum.ERROR.getValue(), CodeEnum.ERROR.getText(),pageResult);
        }
    }

//    删除资产
    @RequestMapping("/deleteAsset")
    public CommonResult deleteAsset(@RequestBody JSONObject json){
        Integer pageNum = json.getInteger("pageNum");
        //得到id
        Integer id = json.getInteger("id");
        //通过id删除
        int i = assetService.deleteByPrimaryKey(id);
        //删除完之后在返回一次数据
        PageResult pageResult = assetService.selectAll(pageNum, 5);
        if(i!=0){
            return new CommonResult(CodeEnum.SUCCESS.getValue(), CodeEnum.SUCCESS.getText(),pageResult);
        }else{
            return new CommonResult(CodeEnum.ERROR.getValue(), CodeEnum.ERROR.getText(),pageResult);
        }
    }

    //更新资产
    @RequestMapping("/updateAsset")
    public CommonResult updateAsset(@RequestBody JSONObject json){
        //获取输入
        Integer id = json.getInteger("id");
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
        asset.setId(id);
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

        //进行update操作
        int i = assetService.updateByPrimaryKey(asset);
        //更新完之后在返回一次数据
        PageResult pageResult = assetService.selectAll(1, 5);
        if(i!=0){
            return new CommonResult(CodeEnum.SUCCESS.getValue(), CodeEnum.SUCCESS.getText(),pageResult);
        }else{
            return new CommonResult(CodeEnum.ERROR.getValue(), CodeEnum.ERROR.getText(),pageResult);
        }
    }


    //查询资产
    @RequestMapping("/findAsset")
    public CommonResult findAsset(@RequestBody JSONObject json){

        //查询资产暂时放着
        return null;
    }

}
