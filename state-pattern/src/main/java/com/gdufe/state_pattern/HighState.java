package com.gdufe.state_pattern;

/**
 * @Author: laichengfeng
 * @Description:
 * @Date: 2018/8/6 21:29
 */
public class HighState extends AbstractState {

    public HighState(AbstractState state) {
        this.forumAccount = state.forumAccount;
        this.point = state.point;
        this.stateName = "高级会员";
    }

    @Override
    public void checkState(int score) {
        if(point < 0) {
            System.out.println("积分不够, 下载失败");
            this.point += score/2;
        }
        else if(point < 100) {
            forumAccount.setState(new PrimaryState(this));
        }
        else if(point < 1000) {
            forumAccount.setState(new MiddleState(this));
        }
    }

    @Override
    public void downFile(int score) {
        System.out.println(forumAccount.getName() + " 高级会员下载文件, 扣除:" +score/2 + "积分");
        point -= score/2;
        checkState(score);
        System.out.println("还剩: " + point + " 积分, 当前等级为:" + stateName);
    }

    @Override
    public void writeNote(int score) {
        System.out.println(forumAccount.getName() + " 高级会员写文章, 增加:" +score*2 + "积分");
        point += score*2;
        checkState(score);
        System.out.println("还剩: " + point + " 积分, 当前等级为:" + stateName);
    }

    @Override
    public void replyNote(int score) {
        System.out.println(forumAccount.getName() + " 高级会员回复留言, 增加:" +score*2 + "积分");
        point += score*2;
        checkState(score);
        System.out.println("还剩: " + point + " 积分, 当前等级为:" + stateName);
    }
}
