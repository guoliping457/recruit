package com.recruit.entity;

import java.util.Date;

public class User {
    private Integer useid;
    private String useemail;
    private String usepwd;
    private Integer usestate;
    private Date usecreatetime;
    private Date usepdatetime;
    private String useimg;
    private String useattention;
    private Integer useblock;

    public Integer getUseid() {
        return useid;
    }
    public void setUseid(Integer useid) {
        this.useid = useid;
    }

    public String getUseemail() {
        return useemail;
    }
    public void setUseemail(String useemail) {
        this.useemail = useemail;
    }

    public String getUsepwd() {
        return usepwd;
    }
    public void setUsepwd(String usepwd) {
        this.usepwd = usepwd;
    }

    public Integer getUsestate() {
        return usestate;
    }
    public void setUsestate(Integer usestate) {
        this.usestate = usestate;
    }

    public Date getUsecreatetime() {
        return usecreatetime;
    }
    public void setUsecreatetime(Date usecreatetime) {
        this.usecreatetime = usecreatetime;
    }

    public Date getUsepdatetime() {
        return usepdatetime;
    }
    public void setUsepdatetime(Date usepdatetime) {
        this.usepdatetime = usepdatetime;
    }

    public String getUseimg() {
        return useimg;
    }
    public void setUseimg(String useimg) {
        this.useimg = useimg;
    }

    public String getUseattention() {
        return useattention;
    }
    public void setUseattention(String useattention) {
        this.useattention = useattention;
    }

    public Integer getUseblock() {
        return useblock;
    }
    public void setUseblock(Integer useblock) {
        this.useblock = useblock;
    }

    @Override
    public String toString() {
        return "User{" +
                "useid=" + useid +
                ", useemail='" + useemail + '\'' +
                ", usepwd='" + usepwd + '\'' +
                ", usestate=" + usestate +
                ", usecreatetime=" + usecreatetime +
                ", usepdatetime=" + usepdatetime +
                ", useimg='" + useimg + '\'' +
                ", useattention='" + useattention + '\'' +
                ", useblock=" + useblock +
                '}';
    }

}
