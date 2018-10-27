package com.recruit.controller;

import com.recruit.entity.Advertising;
import com.recruit.service.AdvertisingService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Controller
@RequestMapping("adver")
public class AdvertisingController {

    @Resource
    private AdvertisingService adverservice;

    @RequestMapping("queryadv")
    public @ResponseBody
    List<Map<String,Object>> queryadvsing(){
        List<Map<String,Object>> list=adverservice.queryadver();
        return list;
    }

    @RequestMapping("addadv")
    public String addadvising(String atitle,Integer positionid,@RequestParam("aimage") MultipartFile aimage, HttpServletRequest request){
        if(!aimage.isEmpty()){
            try {
                String upload=request.getSession().getServletContext().getRealPath("/")+"images";
                File f=new File(upload);
                String name=aimage.getOriginalFilename();
                String uuids=UUID.randomUUID().toString()+name.substring(name.lastIndexOf("."));
                System.out.println(uuids);
                File ser=new File(upload+uuids);
                aimage.transferTo(ser);
                Advertising a=new Advertising();
                System.out.print(uuids);
                a.setAtitle(atitle);
                a.setPositionid(positionid);
                a.setAimage(uuids);
                if(adverservice.addadv(a)>0){
                    System.out.print("sdfghjkl");
                    return "redirect:/webback/queryadvertising.html";
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.print("21121222");
        return "error";
    }

}
