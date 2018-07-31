package com.gdufe.filter_pattern;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: laichengfeng
 * @Description: 过滤出单身
 * @Date: 2018/7/30  20:04
 */
public class CriteriaSingle implements Criteria{
    private static final String MARIALSTATUS = "SINGLE";

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> singlePersonList = new ArrayList<>();
        for(Person person: personList) {
            if(StringUtils.equalsIgnoreCase(person.getMarialStatus(), MARIALSTATUS)) {
                singlePersonList.add(person);
            }
        }
        return singlePersonList;
    }
}
