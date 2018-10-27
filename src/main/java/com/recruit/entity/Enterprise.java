package com.recruit.entity;

public class Enterprise {
    private Integer epid;
    private String cyaddress;
    private String epname;
    private String originator;
    private String epemail;
    private String epphone;
    private String eppwd;
    private Integer ctypeid;
    private Integer itypeid;
    private Integer cpcaleid;
    private String synopsis;
    private Integer epstate;
    private String epimage;
    private String companyimage;

    public Integer getEpid() {
        return epid;
    }
    public void setEpid(Integer epid) {
        this.epid = epid;
    }

    public String getCyaddress() {
        return cyaddress;
    }
    public void setCyaddress(String cyaddress) {
        this.cyaddress = cyaddress;
    }

    public String getEpname() {
        return epname;
    }
    public void setEpname(String epname) {
        this.epname = epname;
    }

    public String getOriginator() {
        return originator;
    }
    public void setOriginator(String originator) {
        this.originator = originator;
    }

    public String getEpemail() {
        return epemail;
    }
    public void setEpemail(String epemail) {
        this.epemail = epemail;
    }

    public String getEpphone() {
        return epphone;
    }
    public void setEpphone(String epphone) {
        this.epphone = epphone;
    }

    public String getEppwd() {
        return eppwd;
    }
    public void setEppwd(String eppwd) {
        this.eppwd = eppwd;
    }

    public Integer getCtypeid() {
        return ctypeid;
    }
    public void setCtypeid(Integer ctypeid) {
        this.ctypeid = ctypeid;
    }

    public Integer getItypeid() {
        return itypeid;
    }
    public void setItypeid(Integer itypeid) {
        this.itypeid = itypeid;
    }

    public Integer getCpcaleid() {
        return cpcaleid;
    }
    public void setCpcaleid(Integer cpcaleid) {
        this.cpcaleid = cpcaleid;
    }

    public String getSynopsis() {
        return synopsis;
    }
    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Integer getEpstate() {
        return epstate;
    }
    public void setEpstate(Integer epstate) {
        this.epstate = epstate;
    }

    public String getEpimage() {
        return epimage;
    }
    public void setEpimage(String epimage) {
        this.epimage = epimage;
    }

    public String getCompanyimage() {
        return companyimage;
    }
    public void setCompanyimage(String companyimage) {
        this.companyimage = companyimage;
    }

    @Override
    public String toString() {
        return "Enterprise{" +
                "epid=" + epid +
                ", cyaddress='" + cyaddress + '\'' +
                ", epname='" + epname + '\'' +
                ", originator='" + originator + '\'' +
                ", epemail='" + epemail + '\'' +
                ", epphone='" + epphone + '\'' +
                ", eppwd='" + eppwd + '\'' +
                ", ctypeid=" + ctypeid +
                ", itypeid=" + itypeid +
                ", cpcaleid=" + cpcaleid +
                ", synopsis='" + synopsis + '\'' +
                ", epstate=" + epstate +
                ", epimage='" + epimage + '\'' +
                ", companyimage='" + companyimage + '\'' +
                '}';
    }

}
