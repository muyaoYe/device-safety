package cn.soc.securityoperationscenter.controller;

import cn.soc.securityoperationscenter.common.CommonResult;
import cn.soc.securityoperationscenter.entity.DataDictionary;
import cn.soc.securityoperationscenter.enums.CodeEnum;
import cn.soc.securityoperationscenter.service.IDataDictionaryService;
import cn.soc.securityoperationscenter.service.IDictionaryTypeService;
import com.sun.org.apache.bcel.internal.classfile.Code;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@ResponseBody
@RequestMapping("/dictionaryController")
public class DictionaryController {

    //数据字典
    @Autowired
    private IDataDictionaryService dataDictionaryService;
    //字典类型
    @Autowired
    private IDictionaryTypeService dictionaryTypeService;

    //查询所有数据字典
    @RequestMapping("/dataDictionary")
    public CommonResult selectAllData(){
        //查询所有数据字典
        List<DataDictionary> dataDictionaryList = dataDictionaryService.selectAll();

        return new CommonResult(CodeEnum.SUCCESS.getValue(), CodeEnum.SUCCESS.getText(),dataDictionaryList);
    }
}
