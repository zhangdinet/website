package com.zhangdi.website.entity;

import java.io.Serializable;

/**
 * Created by hzzhandi3 on 2016/12/11.
 */
public class UserEntity implements Serializable {

    private static final long serialVersionUID = 7198758082258678036L;

    private String name;

    private String nickName;

    private String phone;

    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserEntity{");
        sb.append("name='").append(name).append('\'');
        sb.append(", nickName='").append(nickName).append('\'');
        sb.append(", phone='").append(phone).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
