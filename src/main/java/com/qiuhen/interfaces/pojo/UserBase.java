package com.qiuhen.interfaces.pojo;

import java.io.Serializable;
import java.util.Date;


/**
 * user_base
 * @author 
 */

public class UserBase implements Serializable {
    /**
     * 用户ID
     */
    private String uid;

    /**
     * 2正常用户 3禁言用户 4虚拟用户 5运营
     */
    private Byte userRole;

    /**
     * 注册来源：1手机号 2邮箱 3用户名 4qq 5微信 6腾讯微博 7新浪微博
     */
    private Byte registerSource;

    /**
     * 用户账号，必须唯一
     */
    private String userName;

    /**
     * 用户昵称
     */
    private String nickName;

    /**
     * 用户性别 0-female 1-male
     */
    private Boolean gender;

    /**
     * 用户生日
     */
    private Long birthday;

    /**
     * 用户个人签名
     */
    private String signature;

    /**
     * 手机号码(唯一)
     */
    private String mobile;

    /**
     * 手机号码绑定时间
     */
    private Integer mobileBindTime;

    /**
     * 邮箱(唯一)
     */
    private String email;

    /**
     * 头像
     */
    private String face;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 用户设备push_token
     */
    private String pushToken;

    private static final long serialVersionUID = 1L;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Byte getUserRole() {
        return userRole;
    }

    public void setUserRole(Byte userRole) {
        this.userRole = userRole;
    }

    public Byte getRegisterSource() {
        return registerSource;
    }

    public void setRegisterSource(Byte registerSource) {
        this.registerSource = registerSource;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Long getBirthday() {
        return birthday;
    }

    public void setBirthday(Long birthday) {
        this.birthday = birthday;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getMobileBindTime() {
        return mobileBindTime;
    }

    public void setMobileBindTime(Integer mobileBindTime) {
        this.mobileBindTime = mobileBindTime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getPushToken() {
        return pushToken;
    }

    public void setPushToken(String pushToken) {
        this.pushToken = pushToken;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}