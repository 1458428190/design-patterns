package com.gdufe.filter_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: laichengfeng
 * @Description:
 * @Date: 2018/7/30  19:59
 */
public class App {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Robert","Male", "Single"));
        personList.add(new Person("John","Male", "Married"));
        personList.add(new Person("Laura","Female", "Married"));
        personList.add(new Person("Diana","Female", "Single"));
        personList.add(new Person("Mike","Male", "Single"));
        personList.add(new Person("Bobby","Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();

        List<Criteria> singleAndMaleList = new ArrayList<>();
        singleAndMaleList.add(single);
        singleAndMaleList.add(male);

        List<Criteria> femaleOrMaleList = new ArrayList<>();
        femaleOrMaleList.add(female);
        femaleOrMaleList.add(male);

        Criteria singleAndMale = new AndCriteria(singleAndMaleList);
        Criteria femaleOrMale = new OrCriteria(femaleOrMaleList);

        System.out.println(male.meetCriteria(personList));
        System.out.println(female.meetCriteria(personList));
        System.out.println(single.meetCriteria(personList));
        System.out.println(singleAndMale.meetCriteria(personList));
        System.out.println(femaleOrMale.meetCriteria(personList));
    }
}
