package com.example.common.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 用户信息表，存储用户详细信息
 * @TableName user_info
 */
@TableName(value ="user_info")
public class UserInfo implements Serializable {
    /**
     * 用户ID
     */
    @TableId(type = IdType.AUTO)
    private Integer userId;

    /**
     * 用户名，唯一
     */
    private String username;

    /**
     * 密码哈希值
     */
    private String passwordHash;

    /**
     * 密码哈希的盐值
     */
    private String passwordSalt;

    /**
     * 用户真实姓名
     */
    private String fullName;

    /**
     * 电子邮件地址
     */
    private String email;

    /**
     * 手机号码
     */
    private String phoneNumber;

    /**
     * 用户角色，默认为普通用户
     */
    private Object role;

    /**
     * 用户权限
     */
    private String permissions;

    /**
     * 账户状态，ACTIVE表示激活状态，INACTIVE表示未激活状态，LOCKED表示被锁定
     */
    private Object accountStatus;

    /**
     * 注册时的IP地址
     */
    private String registrationIp;

    /**
     * 最后登录时的IP地址
     */
    private String lastLoginIp;

    /**
     * 头像URL
     */
    private String avatarUrl;

    /**
     * 用户网名
     */
    private String netName;

    /**
     * 注册时间
     */
    private Date registrationTime;

    /**
     * 最后登录时间
     */
    private Date lastLoginTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 用户ID
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 用户名，唯一
     */
    public String getUsername() {
        return username;
    }

    /**
     * 用户名，唯一
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 密码哈希值
     */
    public String getPasswordHash() {
        return passwordHash;
    }

    /**
     * 密码哈希值
     */
    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    /**
     * 密码哈希的盐值
     */
    public String getPasswordSalt() {
        return passwordSalt;
    }

    /**
     * 密码哈希的盐值
     */
    public void setPasswordSalt(String passwordSalt) {
        this.passwordSalt = passwordSalt;
    }

    /**
     * 用户真实姓名
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * 用户真实姓名
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * 电子邮件地址
     */
    public String getEmail() {
        return email;
    }

    /**
     * 电子邮件地址
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 手机号码
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 手机号码
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * 用户角色，默认为普通用户
     */
    public Object getRole() {
        return role;
    }

    /**
     * 用户角色，默认为普通用户
     */
    public void setRole(Object role) {
        this.role = role;
    }

    /**
     * 用户权限
     */
    public String getPermissions() {
        return permissions;
    }

    /**
     * 用户权限
     */
    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }

    /**
     * 账户状态，ACTIVE表示激活状态，INACTIVE表示未激活状态，LOCKED表示被锁定
     */
    public Object getAccountStatus() {
        return accountStatus;
    }

    /**
     * 账户状态，ACTIVE表示激活状态，INACTIVE表示未激活状态，LOCKED表示被锁定
     */
    public void setAccountStatus(Object accountStatus) {
        this.accountStatus = accountStatus;
    }

    /**
     * 注册时的IP地址
     */
    public String getRegistrationIp() {
        return registrationIp;
    }

    /**
     * 注册时的IP地址
     */
    public void setRegistrationIp(String registrationIp) {
        this.registrationIp = registrationIp;
    }

    /**
     * 最后登录时的IP地址
     */
    public String getLastLoginIp() {
        return lastLoginIp;
    }

    /**
     * 最后登录时的IP地址
     */
    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    /**
     * 头像URL
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * 头像URL
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    /**
     * 用户网名
     */
    public String getNetName() {
        return netName;
    }

    /**
     * 用户网名
     */
    public void setNetName(String netName) {
        this.netName = netName;
    }

    /**
     * 注册时间
     */
    public Date getRegistrationTime() {
        return registrationTime;
    }

    /**
     * 注册时间
     */
    public void setRegistrationTime(Date registrationTime) {
        this.registrationTime = registrationTime;
    }

    /**
     * 最后登录时间
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * 最后登录时间
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        UserInfo other = (UserInfo) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getPasswordHash() == null ? other.getPasswordHash() == null : this.getPasswordHash().equals(other.getPasswordHash()))
            && (this.getPasswordSalt() == null ? other.getPasswordSalt() == null : this.getPasswordSalt().equals(other.getPasswordSalt()))
            && (this.getFullName() == null ? other.getFullName() == null : this.getFullName().equals(other.getFullName()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getPhoneNumber() == null ? other.getPhoneNumber() == null : this.getPhoneNumber().equals(other.getPhoneNumber()))
            && (this.getRole() == null ? other.getRole() == null : this.getRole().equals(other.getRole()))
            && (this.getPermissions() == null ? other.getPermissions() == null : this.getPermissions().equals(other.getPermissions()))
            && (this.getAccountStatus() == null ? other.getAccountStatus() == null : this.getAccountStatus().equals(other.getAccountStatus()))
            && (this.getRegistrationIp() == null ? other.getRegistrationIp() == null : this.getRegistrationIp().equals(other.getRegistrationIp()))
            && (this.getLastLoginIp() == null ? other.getLastLoginIp() == null : this.getLastLoginIp().equals(other.getLastLoginIp()))
            && (this.getAvatarUrl() == null ? other.getAvatarUrl() == null : this.getAvatarUrl().equals(other.getAvatarUrl()))
            && (this.getNetName() == null ? other.getNetName() == null : this.getNetName().equals(other.getNetName()))
            && (this.getRegistrationTime() == null ? other.getRegistrationTime() == null : this.getRegistrationTime().equals(other.getRegistrationTime()))
            && (this.getLastLoginTime() == null ? other.getLastLoginTime() == null : this.getLastLoginTime().equals(other.getLastLoginTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getPasswordHash() == null) ? 0 : getPasswordHash().hashCode());
        result = prime * result + ((getPasswordSalt() == null) ? 0 : getPasswordSalt().hashCode());
        result = prime * result + ((getFullName() == null) ? 0 : getFullName().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        result = prime * result + ((getRole() == null) ? 0 : getRole().hashCode());
        result = prime * result + ((getPermissions() == null) ? 0 : getPermissions().hashCode());
        result = prime * result + ((getAccountStatus() == null) ? 0 : getAccountStatus().hashCode());
        result = prime * result + ((getRegistrationIp() == null) ? 0 : getRegistrationIp().hashCode());
        result = prime * result + ((getLastLoginIp() == null) ? 0 : getLastLoginIp().hashCode());
        result = prime * result + ((getAvatarUrl() == null) ? 0 : getAvatarUrl().hashCode());
        result = prime * result + ((getNetName() == null) ? 0 : getNetName().hashCode());
        result = prime * result + ((getRegistrationTime() == null) ? 0 : getRegistrationTime().hashCode());
        result = prime * result + ((getLastLoginTime() == null) ? 0 : getLastLoginTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", username=").append(username);
        sb.append(", passwordHash=").append(passwordHash);
        sb.append(", passwordSalt=").append(passwordSalt);
        sb.append(", fullName=").append(fullName);
        sb.append(", email=").append(email);
        sb.append(", phoneNumber=").append(phoneNumber);
        sb.append(", role=").append(role);
        sb.append(", permissions=").append(permissions);
        sb.append(", accountStatus=").append(accountStatus);
        sb.append(", registrationIp=").append(registrationIp);
        sb.append(", lastLoginIp=").append(lastLoginIp);
        sb.append(", avatarUrl=").append(avatarUrl);
        sb.append(", netName=").append(netName);
        sb.append(", registrationTime=").append(registrationTime);
        sb.append(", lastLoginTime=").append(lastLoginTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}