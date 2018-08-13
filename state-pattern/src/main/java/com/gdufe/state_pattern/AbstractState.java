package com.gdufe.state_pattern;

/**
 * @Author: laichengfeng
 * @Description:
 * @Date: 2018/8/6 21:10
 */
public abstract class AbstractState {
    protected ForumAccount forumAccount;
    protected int point;
    protected String stateName;

    public abstract void checkState(int scores);

    public void downFile(int score) {
        System.out.println(forumAccount.getName() + "下载文件, 扣除" + score + "积分");
        this.point -= score;
        checkState(score);
        System.out.println("还剩" + point + "积分, 当前等级为:" + stateName);
    }

    public void writeNote(int score) {
        System.out.println(forumAccount.getName() + "写文章, 增加" + score + "积分");
        this.point += score;
        checkState(score);
        System.out.println("还剩" + point + "积分, 当前等级为:" + stateName);
    }

    public void replyNote(int score) {
        System.out.println(forumAccount.getName() + "回复留言, 增加" + score + "积分");
        this.point += score;
        checkState(score);
        System.out.println("还剩" + point + "积分, 当前等级为:" + stateName);
    }
}
