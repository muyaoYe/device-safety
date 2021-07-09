package cn.soc.securityoperationscenter.controller;

import cn.soc.securityoperationscenter.common.CommonResult;
import cn.soc.securityoperationscenter.common.PageResult;
import cn.soc.securityoperationscenter.entity.*;
import cn.soc.securityoperationscenter.enums.CodeEnum;
import cn.soc.securityoperationscenter.service.*;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/libraryController")
@ResponseBody
public class LibraryController {

    @Autowired
    private IWarningLibraryService warningLibraryService;

    @Autowired
    private IAnnouncementLibraryService announcementLibraryService;

    @Autowired
    private IOperationLibraryService operationLibraryService;

    @Autowired
    private IResponseLibraryService responseLibraryService;

    @Autowired
    private IUsersService usersService;

    @RequestMapping("/selectWarning")
    public CommonResult selectAllWarning(@RequestBody JSONObject json){
        Integer pageNum = json.getInteger("pageNum");
        PageResult pageResult =  warningLibraryService.selectAll(pageNum,5);
        List<WarningLibrary> warningLibraries = (List<WarningLibrary>) pageResult.getList();
        //处理用户id将其转换为用户名
        List<WarningLibraryShow> list = new ArrayList<>();
        for (WarningLibrary warning : warningLibraries) {
            WarningLibraryShow warningLibraryShow = new WarningLibraryShow();
            warningLibraryShow.setId(warning.getId());
            warningLibraryShow.setWarningName(warning.getWarningName());
            warningLibraryShow.setMissionMainType(warning.getMissionMainType());
            warningLibraryShow.setMissionSubType(warning.getMissionSubType());
            warningLibraryShow.setCreatePerson(usersService.selectByPrimaryKey(warning.getCreatePerson()).getUsername());
            warningLibraryShow.setCreateTime(warning.getCreateTime());
            warningLibraryShow.setUrl(warning.getUrl());
            list.add(warningLibraryShow);
        }
        pageResult.setList(list);
        return new CommonResult(CodeEnum.SUCCESS.getValue(), CodeEnum.SUCCESS.getText(),pageResult);
    }

    @RequestMapping("/selectAnnouncement")
    public CommonResult selectAllAnnouncement(@RequestBody JSONObject json){
        Integer pageNum = json.getInteger("pageNum");
        PageResult pageResult =  announcementLibraryService.selectAll(pageNum,5);
        List<AnnouncementLibrary> announcementLibraries = (List<AnnouncementLibrary>) pageResult.getList();
        //处理用户id将其转换为用户名
        List<AnnouncementLibraryShow> list = new ArrayList<>();
        for (AnnouncementLibrary announcement : announcementLibraries) {
            AnnouncementLibraryShow announcementLibraryShow = new AnnouncementLibraryShow();
            announcementLibraryShow.setId(announcement.getId());
            announcementLibraryShow.setAnnouncementName(announcement.getAnnouncementName());
            announcementLibraryShow.setCreatePerson(usersService.selectByPrimaryKey(announcement.getCreatePerson()).getUsername());
            announcementLibraryShow.setCreateTime(announcement.getCreateTime());
            announcementLibraryShow.setUrl(announcement.getUrl());
            list.add(announcementLibraryShow);
        }
        pageResult.setList(list);
        return new CommonResult(CodeEnum.SUCCESS.getValue(), CodeEnum.SUCCESS.getText(),pageResult);
    }

    @RequestMapping("/selectOperation")
    public CommonResult selectAllOperation(@RequestBody JSONObject json){
        Integer pageNum = json.getInteger("pageNum");
        PageResult pageResult =  operationLibraryService.selectAll(pageNum,5);
        List<OperationLibrary> operationLibraries = (List<OperationLibrary>) pageResult.getList();
        //处理用户id将其转换为用户名
        List<OperationLibraryShow> list = new ArrayList<>();
        for (OperationLibrary operation : operationLibraries) {
            OperationLibraryShow operationLibraryShow = new OperationLibraryShow();
            operationLibraryShow.setId(operation.getId());
            operationLibraryShow.setOperationName(operation.getOperationName());
            operationLibraryShow.setOperationType(operation.getOperationType());
            operationLibraryShow.setCreatePerson(usersService.selectByPrimaryKey(operation.getCreatePerson()).getUsername());
            operationLibraryShow.setCreateTime(operation.getCreateTime());
            operationLibraryShow.setUrl(operation.getUrl());
            list.add(operationLibraryShow);
        }
        pageResult.setList(list);
        return new CommonResult(CodeEnum.SUCCESS.getValue(), CodeEnum.SUCCESS.getText(),pageResult);
    }

    @RequestMapping("/selectResponse")
    public CommonResult selectAllResponse(@RequestBody JSONObject json){
        Integer pageNum = json.getInteger("pageNum");
        PageResult pageResult =  responseLibraryService.selectAll(pageNum,5);
        List<ResponseLibrary> responseLibraries = (List<ResponseLibrary>) pageResult.getList();
        //处理用户id将其转换为用户名
        List<ResponseLibraryShow> list = new ArrayList<>();
        for (ResponseLibrary response : responseLibraries) {
            ResponseLibraryShow responseLibraryShow = new ResponseLibraryShow();
            responseLibraryShow.setId(response.getId());
            responseLibraryShow.setResponseName(response.getResponseName());
            responseLibraryShow.setResponseType(response.getResponseType());
            responseLibraryShow.setCreatePerson(usersService.selectByPrimaryKey(response.getCreatePerson()).getUsername());
            responseLibraryShow.setCreateTime(response.getCreateTime());
            responseLibraryShow.setUrl(response.getUrl());
            list.add(responseLibraryShow);
        }
        pageResult.setList(list);
        return new CommonResult(CodeEnum.SUCCESS.getValue(), CodeEnum.SUCCESS.getText(),pageResult);
    }
}
