package com.gdufe.filter_pattern;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: laichengfeng
 * @Description: 过滤出女性
 * @Date: 2018/7/30  20:04
 */
public class CriteriaFemale implements Criteria{
    private static final String GENDER = "FEMALE";

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> femalePersonList = new ArrayList<>();
        for(Person person: personList) {
            if(StringUtils.equalsIgnoreCase(person.getGender(), GENDER)) {
                femalePersonList.add(person);
            }
        }
        return femalePersonList;
    }
}
