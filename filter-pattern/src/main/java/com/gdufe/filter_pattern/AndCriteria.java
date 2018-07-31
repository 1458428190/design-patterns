package com.gdufe.filter_pattern;

import java.util.List;

/**
 * @Author: laichengfeng
 * @Description: 与组合过滤
 * @Date: 2018/7/30 20:07
 */
public class AndCriteria implements Criteria {

    private List<Criteria> criteriaList;

    public AndCriteria(List<Criteria> criteriaList) {
        this.criteriaList = criteriaList;
    }

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        // 用一组标准 与 过滤personList
        List<Person> resultPersonList = personList;
        for(Criteria criteria: criteriaList) {
            resultPersonList = criteria.meetCriteria(resultPersonList);
        }
        return resultPersonList;
    }
}
