package cn.soc.securityoperationscenter.controller;

import cn.soc.securityoperationscenter.common.CommonResult;
import cn.soc.securityoperationscenter.entity.DataDictionary;
import cn.soc.securityoperationscenter.entity.DictionaryType;
import cn.soc.securityoperationscenter.enums.CodeEnum;
import cn.soc.securityoperationscenter.service.IDataDictionaryService;
import cn.soc.securityoperationscenter.service.IDictionaryTypeService;
import com.alibaba.fastjson.JSONObject;
import com.sun.org.apache.bcel.internal.classfile.Code;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
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

    //新增数据字典
    @RequestMapping("/createDictionary")
    public CommonResult createDictionary(@RequestBody JSONObject json){
        //获取输入
        String dictionaryName = json.getString("dictionaryName");
        String dataType = json.getString("dataType");
        String dictionaryCore = json.getString("dictionaryCore");
        String dictionaryValue = json.getString("dictionaryValue");
        String dictionaryType = json.getString("dictionaryType");
        String note = json.getString("note");

        //放到数据字典对象
        DataDictionary dataDictionary = new DataDictionary();
        dataDictionary.setDictionaryName(dictionaryName);
        dataDictionary.setDataType(dataType);
        dataDictionary.setDictionaryCore(dictionaryCore);
        dataDictionary.setDictionaryValue(dictionaryValue);
        dataDictionary.setDictionaryType(dictionaryType);
        dataDictionary.setNote(note);

        //新增操作
        int i = dataDictionaryService.insert(dataDictionary);
        //重新请求数据
        List<DataDictionary> dataDictionaryList = dataDictionaryService.selectAll();
        //如果新增成功
        if(i!=0){
            return new CommonResult(CodeEnum.SUCCESS.getValue(), CodeEnum.SUCCESS.getText(),dataDictionaryList);
        }else{
            return new CommonResult(CodeEnum.ERROR.getValue(), CodeEnum.ERROR.getText(),dataDictionaryList);
        }
    }

    //搜索数据字典：通过名称
    @RequestMapping("/findDictionary")
    public CommonResult findDictionary(@RequestBody JSONObject json){
        //获取输入
        String dictionaryName = json.getString("dictionaryName");
        //查找数据库的匹配项:可能有多个name相同，所以让使用list
        List<DataDictionary> dataDictionaryList = dataDictionaryService.selectByName(dictionaryName);
        //把找到的集合返回过去
        return new CommonResult(CodeEnum.SUCCESS.getValue(), CodeEnum.SUCCESS.getText(),dataDictionaryList);
    }

    //编辑数据字典
    @RequestMapping("/updateDictionary")
    public CommonResult updateDictionary(@RequestBody JSONObject json){
        //获取id
        Integer id = Integer.parseInt(json.getString("id"));
        //获取输入
        String dictionaryName = json.getString("dictionaryName");
        String dataType = json.getString("dataType");
        String dictionaryCore = json.getString("dictionaryCore");
        String dictionaryValue = json.getString("dictionaryValue");
        String dictionaryType = json.getString("dictionaryType");
        String note = json.getString("note");
        //放到数据字典对象
        DataDictionary dataDictionary = new DataDictionary();
        dataDictionary.setId(id);
        dataDictionary.setDictionaryName(dictionaryName);
        dataDictionary.setDataType(dataType);
        dataDictionary.setDictionaryCore(dictionaryCore);
        dataDictionary.setDictionaryValue(dictionaryValue);
        dataDictionary.setDictionaryType(dictionaryType);
        dataDictionary.setNote(note);
        //进行更新
        int i = dataDictionaryService.updateByPrimaryKey(dataDictionary);
        //重新请求数据
        List<DataDictionary> dataDictionaryList = dataDictionaryService.selectAll();
        if(i!=0){
            return new CommonResult(CodeEnum.SUCCESS.getValue(), CodeEnum.SUCCESS.getText(),dataDictionaryList);
        }else{
            return new CommonResult(CodeEnum.ERROR.getValue(), CodeEnum.ERROR.getText(),dataDictionaryList);
        }
    }

    //删除数据字典
    @RequestMapping("/deleteDictionary")
    public CommonResult deleteDictionary(@RequestBody JSONObject json){
        //获取输入
        Integer id = Integer.parseInt(json.getString("id"));
        //通过id删除
        int i = dataDictionaryService.deleteByPrimaryKey(id);
        //重新获取数据
        List<DataDictionary> dataDictionaryList = dataDictionaryService.selectAll();
        //如果删除成功
        if(i!=0){
            return new CommonResult(CodeEnum.SUCCESS.getValue(), CodeEnum.SUCCESS.getText(),dataDictionaryList);
        }else{
            return new CommonResult(CodeEnum.ERROR.getValue(), CodeEnum.ERROR.getText(),dataDictionaryList);
        }
    }

    //查询所有字典类型
    @RequestMapping("/dictionaryType")
    public CommonResult selectAllType(){
        //查询所有数据字典
        List<DictionaryType> dictionaryTypeList = dictionaryTypeService.selectAll();
        //把查询结果返回
        return new CommonResult(CodeEnum.SUCCESS.getValue(), CodeEnum.SUCCESS.getText(),dictionaryTypeList);
    }

    //新增字典类型
    @RequestMapping("/createType")
    public CommonResult createType(@RequestBody JSONObject json){
        //获取输入
        String name = json.getString("name");
        String code = json.getString("code");
        String note = json.getString("note");
        //接收的实例
        DictionaryType dictionaryType = new DictionaryType();
        dictionaryType.setName(name);
        dictionaryType.setCode(code);
        dictionaryType.setNote(note);
        //新增
        int i = dictionaryTypeService.insert(dictionaryType);
        //重新请求
        List<DictionaryType> dictionaryTypeList = dictionaryTypeService.selectAll();
        if(i!=0){
            return new CommonResult(CodeEnum.SUCCESS.getValue(), CodeEnum.SUCCESS.getText(),dictionaryTypeList);
        }else{
            return new CommonResult(CodeEnum.ERROR.getValue(), CodeEnum.ERROR.getText(),dictionaryTypeList);
        }
    }

    //编辑字典类型
    @RequestMapping("/updateType")
    public CommonResult updateType(@RequestBody JSONObject json){
        //获取id
        Integer id = Integer.parseInt(json.getString("id"));
        //获取输入
        String name = json.getString("name");
        String code = json.getString("code");
        String note = json.getString("note");
        //接收的实例
        DictionaryType dictionaryType = new DictionaryType();
        dictionaryType.setId(id);
        dictionaryType.setName(name);
        dictionaryType.setCode(code);
        dictionaryType.setNote(note);
        //通过id更新操作
        int i = dictionaryTypeService.updateByPrimaryKey(dictionaryType);
        //重新请求数据
        List<DictionaryType> dictionaryTypeList = dictionaryTypeService.selectAll();

        if(i!=0){
            return new CommonResult(CodeEnum.SUCCESS.getValue(), CodeEnum.SUCCESS.getText(),dictionaryTypeList);
        }else{
            return new CommonResult(CodeEnum.ERROR.getValue(), CodeEnum.ERROR.getText(),dictionaryTypeList);
        }
    }

    //删除
    @RequestMapping("/deleteType")
    public CommonResult deleteType(@RequestBody JSONObject json){
        //获取id
        Integer id = Integer.parseInt(json.getString("id"));
        //通过id删除
        int i = dictionaryTypeService.deleteByPrimaryKey(id);
        //删除之后再请求一次数据
        List<DictionaryType> dictionaryTypeList = dictionaryTypeService.selectAll();
        if(i!=0){
            return new CommonResult(CodeEnum.SUCCESS.getValue(), CodeEnum.SUCCESS.getText(),dictionaryTypeList);
        }else{
            return new CommonResult(CodeEnum.ERROR.getValue(), CodeEnum.ERROR.getText(),dictionaryTypeList);
        }
    }

    //搜索字典类型：通过名称
    @RequestMapping("/findType")
    public CommonResult findType(@RequestBody JSONObject json){
        //获取输入
        String name = json.getString("name");
        //查找数据库的匹配项:可能有多个name相同，所以让使用list
        List<DictionaryType> dictionaryTypeList = dictionaryTypeService.selectByName(name);
        //把找到的集合返回过去
        return new CommonResult(CodeEnum.SUCCESS.getValue(), CodeEnum.SUCCESS.getText(),dictionaryTypeList);
    }

}
