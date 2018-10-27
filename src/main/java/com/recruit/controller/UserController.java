package com.recruit.controller;

import com.recruit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("user")
@SessionAttributes("email")
public class UserController {

    @Resource
    private UserService uservice;

    @RequestMapping("query")
    public @ResponseBody List<Map<String,Object>> queryuser(Model m){
        List<Map<String,Object>> list=uservice.queryuser();
        m.addAttribute("list",list);
        return list;
    }

}
