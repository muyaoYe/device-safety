package cn.soc.securityoperationscenter.controller;

import cn.soc.securityoperationscenter.common.CommonResult;
import cn.soc.securityoperationscenter.entity.AnnouncementLibrary;
import cn.soc.securityoperationscenter.entity.OperationLibrary;
import cn.soc.securityoperationscenter.entity.ResponseLibrary;
import cn.soc.securityoperationscenter.entity.WarningLibrary;
import cn.soc.securityoperationscenter.enums.CodeEnum;
import cn.soc.securityoperationscenter.service.IAnnouncementLibraryService;
import cn.soc.securityoperationscenter.service.IOperationLibraryService;
import cn.soc.securityoperationscenter.service.IResponseLibraryService;
import cn.soc.securityoperationscenter.service.IWarningLibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping("/selectWarning")
    public CommonResult selectAllWarning(){
        List<WarningLibrary> list =  warningLibraryService.selectAll();
        return new CommonResult(CodeEnum.SUCCESS.getValue(), CodeEnum.SUCCESS.getText(),list);
    }

    @RequestMapping("/selectAnnouncement")
    public CommonResult selectAllAnnouncement(){
        List<AnnouncementLibrary> list =  announcementLibraryService.selectAll();
        return new CommonResult(CodeEnum.SUCCESS.getValue(), CodeEnum.SUCCESS.getText(),list);
    }

    @RequestMapping("/selectOperation")
    public CommonResult selectAllOperation(){
        List<OperationLibrary> list =  operationLibraryService.selectAll();
        return new CommonResult(CodeEnum.SUCCESS.getValue(), CodeEnum.SUCCESS.getText(),list);
    }

    @RequestMapping("/selectResponse")
    public CommonResult selectAllResponse(){
        List<ResponseLibrary> list =  responseLibraryService.selectAll();
        return new CommonResult(CodeEnum.SUCCESS.getValue(), CodeEnum.SUCCESS.getText(),list);
    }
}
