package com.gdufe.prototype_pattern;

import java.io.Serializable;

/**
 * @Author: laichengfeng
 * @Description: 辅助类， 用于测试是否会复制引用对象
 * @Date: 2018/7/29 21:51
 */
public class Attachment implements Serializable {

    public void download() {
        System.out.println("下载附件");
    }
}
