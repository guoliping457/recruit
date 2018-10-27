package com.recruit.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface EnterpriseDao {

    @Select("select epid,cyaddress,epname,originator,epemail,epphone,eppwd,ctypeid,itypeid," +
            "cpcaleid,epstate,companyimage from enterprise")
    public List<Map<String,Object>> queryenterprise();

}
