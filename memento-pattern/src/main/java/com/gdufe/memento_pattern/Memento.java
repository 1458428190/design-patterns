package com.gdufe.memento_pattern;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author: laichengfeng
 * @Description: 备忘录类, 主要用于保存备份信息, 只能包内访问
 * @Date: 2018/8/4 11:42
 */
@Data
@AllArgsConstructor
class Memento {
    private String account;
    private String password;
    private String telNo;
}
