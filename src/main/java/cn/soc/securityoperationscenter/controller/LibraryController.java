package cn.soc.securityoperationscenter.controller;

import cn.soc.securityoperationscenter.common.CommonResult;
import cn.soc.securityoperationscenter.entity.*;
import cn.soc.securityoperationscenter.enums.CodeEnum;
import cn.soc.securityoperationscenter.service.*;
import org.springframework.beans.factory.annotation.Autowired;
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
    public CommonResult selectAllWarning(){
        List<WarningLibrary> warningLibraries =  warningLibraryService.selectAll();
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
            list.add(warningLibraryShow);
        }
        return new CommonResult(CodeEnum.SUCCESS.getValue(), CodeEnum.SUCCESS.getText(),list);
    }

    @RequestMapping("/selectAnnouncement")
    public CommonResult selectAllAnnouncement(){
        List<AnnouncementLibrary> announcementLibraries =  announcementLibraryService.selectAll();
        //处理用户id将其转换为用户名
        List<AnnouncementLibraryShow> list = new ArrayList<>();
        for (AnnouncementLibrary announcement : announcementLibraries) {
            AnnouncementLibraryShow announcementLibraryShow = new AnnouncementLibraryShow();
            announcementLibraryShow.setId(announcement.getId());
            announcementLibraryShow.setAnnouncementName(announcement.getAnnouncementName());
            announcementLibraryShow.setCreatePerson(usersService.selectByPrimaryKey(announcement.getCreatePerson()).getUsername());
            announcementLibraryShow.setCreateTime(announcement.getCreateTime());
            list.add(announcementLibraryShow);
        }
        return new CommonResult(CodeEnum.SUCCESS.getValue(), CodeEnum.SUCCESS.getText(),list);
    }

    @RequestMapping("/selectOperation")
    public CommonResult selectAllOperation(){
        List<OperationLibrary> operationLibraries =  operationLibraryService.selectAll();
        //处理用户id将其转换为用户名
        List<OperationLibraryShow> list = new ArrayList<>();
        for (OperationLibrary operation : operationLibraries) {
            OperationLibraryShow operationLibraryShow = new OperationLibraryShow();
            operationLibraryShow.setId(operation.getId());
            operationLibraryShow.setOperationName(operation.getOperationName());
            operationLibraryShow.setOperationType(operation.getOperationType());
            operationLibraryShow.setCreatePerson(usersService.selectByPrimaryKey(operation.getCreatePerson()).getUsername());
            operationLibraryShow.setCreateTime(operation.getCreateTime());
            list.add(operationLibraryShow);
        }
        return new CommonResult(CodeEnum.SUCCESS.getValue(), CodeEnum.SUCCESS.getText(),list);
    }

    @RequestMapping("/selectResponse")
    public CommonResult selectAllResponse(){
        List<ResponseLibrary> responseLibraries =  responseLibraryService.selectAll();
        //处理用户id将其转换为用户名
        List<ResponseLibraryShow> list = new ArrayList<>();
        for (ResponseLibrary response : responseLibraries) {
            ResponseLibraryShow responseLibraryShow = new ResponseLibraryShow();
            responseLibraryShow.setId(response.getId());
            responseLibraryShow.setResponseName(response.getResponseName());
            responseLibraryShow.setResponseType(response.getResponseType());
            responseLibraryShow.setCreatePerson(usersService.selectByPrimaryKey(response.getCreatePerson()).getUsername());
            responseLibraryShow.setCreateTime(response.getCreateTime());
            list.add(responseLibraryShow);
        }
        return new CommonResult(CodeEnum.SUCCESS.getValue(), CodeEnum.SUCCESS.getText(),list);
    }
}
