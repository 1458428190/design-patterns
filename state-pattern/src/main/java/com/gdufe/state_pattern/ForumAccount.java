package com.gdufe.state_pattern;

/**
 * @Author: laichengfeng
 * @Description: 环境类,  论坛账号类
 * @Date: 2018/8/6 21:08
 */

public class ForumAccount {
    private AbstractState state;
    private String name;

    public ForumAccount(String name) {
        this.name = name;
        this.state = new PrimaryState(this);
    }

    public void downFile(int score){
        state.downFile(score);
    }

    public void writeNote(int score) {
        state.writeNote(score);
    }

    public void replyNote(int score) {
        state.replyNote(score);
    }

    public AbstractState getState() {
        return state;
    }

    public void setState(AbstractState state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
