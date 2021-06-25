package com.example.employeemanagement;

public class Employee {
    private String key;
    private String id;
    private String name;
    private String mobile;
    private String email;
    private String designation;
    private String reportingTo;
    private String DOJ;
    private String DOB;
    // department
    //employee type
    private String type;
    private String currRating;
    private String rights;

    public Employee(){

    }

    public Employee(String id, String name, String mobile, String email, String designation, String reportingTo, String DOJ, String rights) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.designation = designation;
        this.reportingTo = reportingTo;
        this.DOJ = DOJ;
        this.rights = rights;
    }

    public Employee(String key, String id, String name, String mobile, String email, String designation, String reportingTo, String DOJ, String DOB, String type, String currRating, String rights) {
        this.key = key;
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.designation = designation;
        this.reportingTo = reportingTo;
        this.DOJ = DOJ;
        this.DOB = DOB;
        this.type = type;
        this.currRating = currRating;
        this.rights = rights;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCurrRating() {
        return currRating;
    }

    public void setCurrRating(String currRating) {
        this.currRating = currRating;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getReportingTo() {
        return reportingTo;
    }

    public void setReportingTo(String reportingTo) {
        this.reportingTo = reportingTo;
    }

    public String getDOJ() {
        return DOJ;
    }

    public void setDOJ(String DOJ) {
        this.DOJ = DOJ;
    }

    public String getRights() {
        return rights;
    }

    public void setRights(String rights) {
        this.rights = rights;
    }
}
