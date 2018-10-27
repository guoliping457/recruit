package com.recruit.service;

import com.recruit.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class UserService {

    @Resource
    private UserDao udao;

    public List<Map<String,Object>> queryuser(){
        return udao.queryuser();
    }


}
