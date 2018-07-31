package com.gdufe.filter_pattern;


import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: laichengfeng
 * @Description: 过滤出男性
 * @Date: 2018/7/30  20:01
 */
public class CriteriaMale implements Criteria {

    private static final String GENDER = "MALE";

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> malePersonList = new ArrayList<>();
        for(Person person: personList) {
            if(StringUtils.equalsIgnoreCase(person.getGender(), GENDER)) {
                malePersonList.add(person);
            }
        }
        return malePersonList;
    }
}
