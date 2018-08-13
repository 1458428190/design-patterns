package com.gdufe.state_pattern;

/**
 * @Author: laichengfeng
 * @Description:
 * @Date: 2018/8/6 21:37
 */
public class MiddleState extends AbstractState {

    public MiddleState(AbstractState state) {
        this.forumAccount = state.forumAccount;
        this.point = state.point;
        this.stateName = "会员";
    }

    @Override
    public void checkState(int scores) {
        if(point < 0) {
            System.out.println("积分不够");;
            point += scores;
        } else if(point >= 1000) {
            forumAccount.setState(new HighState(this));
        }
    }

}
