package com.gdufe.memento_pattern;

import lombok.Data;

/**
 * @Author: laichengfeng
 * @Description: 原发器类,  用户账号信息
 * @Date: 2018/8/4 11:40
 */
@Data
public class UserInfoVO {

    private String account;
    private String password;
    private String telNo;

    /**
     * 用于保存到备忘录中
     * @param memento
     * @return
     */
    public Memento saveMemento() {
        return new Memento(account, password, telNo);
    }

    /**
     * 撤回
     * @param memento
     */
    public void restoreMemento(Memento memento) {
        this.account = memento.getAccount();
        this.password = memento.getPassword();
        this.telNo = memento.getTelNo();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserInfoVO{");
        sb.append("account='").append(account).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", telNo='").append(telNo).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
