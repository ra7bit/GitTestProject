/*******************************************************************************
 * Adobe CONFIDENTIAL INFORMATION
 * 
 * Copyright (c) 2012 Adobe LLC. All Rights Reserved. Unauthorized reproduction,
 * transmission, or distribution of this software is a violation of applicable
 * laws.
 * 
 * ***************************************************************************
 * User
 * 
 * $Id: User.java, v 1.0 Aug 15, 2012 6:06:35 PM$
 * 
 * Created on Aug 15, 2012
 * 
 * @author ligyu
 ******************************************************************************/
package com.omniture.uiautomation.util.dao;

public class ScUser {
    private String loginID;
    private String firstName = "SCautoTest_FirstName";
    private String lastName = "SCautoTest_LastName";
    private String phone = "1234567890";
    private String password = "A12$asdB0";
    private String email = "test@adobe.com";
    private Boolean isAdmin = false;

    public String getLoginID() {
        return loginID;
    }

    public void setLoginID(String loginID) {
        this.loginID = loginID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
}

