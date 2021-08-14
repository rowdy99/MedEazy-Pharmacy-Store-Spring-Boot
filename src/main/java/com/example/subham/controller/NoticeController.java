package com.example.subham.controller;

import com.example.subham.model.Notice;
import com.example.subham.repository.NoticeRepo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class NoticeController {


    @Autowired
    NoticeRepo noticeRepo;




    @GetMapping("/noticeupload")
    public String noticeupload(Model model){
        ArrayList<Notice> oc = (ArrayList<Notice>) noticeRepo.findAll();
        model.addAttribute("notice",oc);
        return "noticeupload";
    }

    @GetMapping("/noticepage")
    public String getNoticeController(Model model)
    {
        ArrayList<Notice> oc=(ArrayList<Notice>)noticeRepo.findAll();
        model.addAttribute("notice",oc);

        return "noticepage";
    }

    @PostMapping("/noticepage")
    public  String saveNotice(Notice oc){

        oc.getNoticeTitle();oc.setNoticeTitle();oc.getContent();oc.setContent();oc.getId();oc.setId();
        noticeRepo.save(oc);

        System.out.println(oc);
        return "redirect:noticeupload";
    }

    @GetMapping("/search")
    public String Search(HttpServletRequest request, Model m)
    {
        String name= request.getParameter("search");
        List<Notice> oc=noticeRepo.findAllByNoticeTitle(name);
        m.addAttribute("notice",oc);

        System.out.println(oc);

        return "search";

    }
    @GetMapping("/noticedelete")
    public  String DeleteNotice(Model model){
        ArrayList<Notice> oc=(ArrayList<Notice>)noticeRepo.findAll();
        model.addAttribute("notice",oc);

        return "noticedelete";
    }

    @GetMapping("/notice/delete/{id}")
    public String DeleteNotice(@PathVariable("id") int id){

        noticeRepo.deleteById(id);

        return "noticepage";
    }
    

}
