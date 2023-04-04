package com.atguigu.spring5.collectiontype;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Stu {
    // 1 数组类型属性
    private String[] courses;

    // 2 list 集合类型属性
    private List<String> list;

    // 3 map 集合类型属性
    private Map<String,String> maps;

    // 4 set 集合类型属性
    private Set<String> sets;

    // 学生所学的多门课程
    private List<Course> coursesList;

    public void setCoursesList(List<Course> coursesList) {
        this.coursesList = coursesList;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "courses=" + Arrays.toString(courses) +
                ", list=" + list +
                ", maps=" + maps +
                ", sets=" + sets +
                ", coursesList=" + coursesList +
                '}';
    }
}
