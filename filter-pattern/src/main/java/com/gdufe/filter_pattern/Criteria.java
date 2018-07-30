package com.gdufe.filter_pattern;

import java.util.List;

/**
 * @Author: laichengfeng
 * @Description: 过滤出标准person
 * @Date: 2018/7/30  20:00
 */
public interface Criteria {
    List<Person> meetCriteria(List<Person> personList);
}
