package cn.soc.securityoperationscenter.controller;

import cn.soc.securityoperationscenter.common.CommonResult;
import cn.soc.securityoperationscenter.entity.Assets;
import cn.soc.securityoperationscenter.entity.Users;
import cn.soc.securityoperationscenter.enums.CodeEnum;
import cn.soc.securityoperationscenter.service.IAssetService;
import cn.soc.securityoperationscenter.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
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
        System.out.println("进入了assetController里的selectAllAsset()查找所有资产");

        //查询所有资产返回集合
        List<Assets> assetsList = assetService.selectAll();

        //找到的返回给前端
        return new CommonResult(CodeEnum.SUCCESS.getValue(),CodeEnum.SUCCESS.getText(),assetsList);

    }

}
