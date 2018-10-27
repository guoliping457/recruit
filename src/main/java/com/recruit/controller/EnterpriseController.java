package com.recruit.controller;

import com.recruit.entity.Enterprise;
import com.recruit.service.EnterpriseService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("enterprise")
public class EnterpriseController {

    @Resource
    public EnterpriseService entservie;

    @RequestMapping("queryent")
    public @ResponseBody
    List<Map<String,Object>> queryentprise(Model m){
        List<Map<String,Object>> list=entservie.queryenterprise();
        m.addAttribute("list",list);
        return list;
    }

}
