package com.controller.inpatient;

import com.model.InpatientRecord;
import com.service.inpatient.InpatientRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
@Controller
@RequestMapping(value="/inpatient")
public class InpatientRecordController {
    @Autowired
    InpatientRecordService recordService;


    // 返回
    @RequestMapping(value = "/fanhui")
    public ModelAndView fanhui() {
        ModelAndView mav = new ModelAndView("redirect:select");
        return mav;
    }

    @RequestMapping(value ="/select")
    public ModelAndView select(){
        ModelAndView mav=new ModelAndView();
        List<InpatientRecord> inpatientRecords = recordService.selectInpatientRecord();
        mav.addObject("inpatientRecords",inpatientRecords);
        mav.setViewName("inpatient/index");
        return mav;
    }

    @RequestMapping(value ="/selectById")
    public ModelAndView selectById(int pId){

        InpatientRecord ir= recordService.selectInpatientRecordByRecordId(pId);
        ModelAndView mav=new ModelAndView("/inpatient/detail");
        mav.addObject("ir",ir);
        return mav;
    }

    @RequestMapping(value ="/addGo")
    public ModelAndView addInRecordGo(){
        ModelAndView mav=new ModelAndView("inpatient/add");
        return  mav;
    }

    @RequestMapping(value ="/add", method= RequestMethod.POST)
    public ModelAndView addInRecord(InpatientRecord inpatientRecord){
        recordService.addInpatientRecord(inpatientRecord);
        ModelAndView mav=new ModelAndView("redirect:/inpatient/select");
        return  mav;
    }

    @RequestMapping(value ="/updateGo")
    public ModelAndView updateInRecordGo(int pId){
        InpatientRecord ir= recordService.selectInpatientRecordByRecordId(pId);
        ModelAndView mav=new ModelAndView("inpatient/update");
        mav.addObject("ir",ir);
        return mav;
    }
    @RequestMapping(value ="/update")
    public ModelAndView updateInRecord(InpatientRecord inpatientRecord){
        recordService.updateInpatientRecord(inpatientRecord);
        ModelAndView mav=new ModelAndView("redirect:/inpatient/select");
        return mav;
    }

    @RequestMapping(value ="/delete")
    public ModelAndView deleteInRecord(int pId){
        recordService.deleteInpatientRecord(pId);
        ModelAndView mav=new ModelAndView("redirect:/inpatient/select");
        return mav;
    }


}