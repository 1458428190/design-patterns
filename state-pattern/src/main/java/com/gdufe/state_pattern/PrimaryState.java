package com.gdufe.state_pattern;

/**
 * @Author: laichengfeng
 * @Description:
 * @Date: 2018/8/6 21:17
 */
public class PrimaryState extends AbstractState {

    public PrimaryState(ForumAccount forumAccount) {
        this.forumAccount = forumAccount;
        this.point = 0;
        this.stateName = "新手";
    }

    public PrimaryState(AbstractState abstractState) {
        this.forumAccount = abstractState.forumAccount;
        this.point = abstractState.point;
        this.stateName = "新手";
    }

    @Override
    public void checkState(int score) {
        if (point >= 1000) {
            forumAccount.setState(new HighState(this));
        }
    }

    @Override
    public void downFile(int score) {
        System.out.println("对不起, 你还不够等级");
    }
}
