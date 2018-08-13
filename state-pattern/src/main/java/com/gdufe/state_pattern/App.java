package com.gdufe.state_pattern;

/**
 * @Author: laichengfeng
 * @Description: 状态模式
 * @Date: 2018/8/6 21:07
 */
public class App {
    public static void main(String[] args) {
        ForumAccount forumAccount = new ForumAccount("小三");
        forumAccount.writeNote(100);
        forumAccount.writeNote(100);
        forumAccount.downFile(300);
        forumAccount.replyNote(800);
        forumAccount.downFile(100);
    }
}
