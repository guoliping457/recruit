package com.recruit.service;

import com.recruit.dao.EnterpriseDao;
import com.recruit.entity.Enterprise;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class EnterpriseService {

    @Resource
    private EnterpriseDao enterpriseDao;

    //查询企业用户
    public List<Map<String,Object>> queryenterprise() {
        return enterpriseDao.queryenterprise();
    }

}
