package org.lhx.vo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lhx
 * @date 2019/3/30 - 10:34
 */
public class Student {
    private String name;
    private int age;
    private List<String> qqList = new ArrayList<>();
    private Map<String,String> addressMap = new HashMap<>();

    public Student() {
    }

    public Map<String, String> getAddressMap() {
        return addressMap;
    }

    public void setAddressMap(Map<String, String> addressMap) {
        this.addressMap = addressMap;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getQqList() {
        return qqList;
    }

    public void setQqList(List<String> qqList) {
        this.qqList = qqList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", qqList=" + qqList +
                ", addressMap=" + addressMap +
                '}';
    }

}
