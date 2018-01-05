package com.hp.entity;

import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;

/**
 * usedfor：用户登录实体类
 * Created by javahao on 2017/6/23.
 * auth：JavaHao
 */
public class User {

    private String id;
    private String username; //用户名
    private String password; //密码
    private String salt; //加密密码的盐
    //是否锁定，默认是未锁定
    private Boolean locked = Boolean.FALSE;
    //是否激活，默认是未激活
    private Boolean activation = Boolean.FALSE;

    private String email;

    private String mobile;
    private List<String> idList;
    private String creatorId;
    private String modifierId;
    private Date createdAt;
    private Date modifiedAt;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCredentialsSalt() {
        return getUn() + salt;
    }

    public String getUn(){
        if(!StringUtils.isEmpty(username))
            return username;
        if(!StringUtils.isEmpty(mobile))
            return mobile;
        if(!StringUtils.isEmpty(email))
            return email;
        return null;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public Boolean getActivation() {
        return activation;
    }

    public void setActivation(Boolean activation) {
        this.activation = activation;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getIdList() {
        return idList;
    }

    public void setIdList(List<String> idList) {
        this.idList = idList;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public String getModifierId() {
        return modifierId;
    }

    public void setModifierId(String modifierId) {
        this.modifierId = modifierId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }
}
