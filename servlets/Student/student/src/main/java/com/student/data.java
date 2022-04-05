package com.student;

import java.util.ArrayList;
import java.util.List;

public class data extends student {

    public  static final List<student> studentList=new ArrayList<student>();


public data(){
    student s1 = new student();
    s1.setName("manish");
    s1.setId(101);
    s1.setPassword("password");

    student s2 = new student();
    s2.setId(102);
    s2.setName("shiva");
    s2.setPassword("password");
    student s3 = new student();
    s3.setId(103);
    s3.setName("ganesh");
    s3.setPassword("password");

    course c1 = new course();
    c1.setCourseId(1);
    c1.setCourseName("Telugu");

    course c2 = new course();
    c2.setCourseId(2);
    c2.setCourseName("Hindi");

    List<course> courseList = new ArrayList<>();
    courseList.add(c1);
    courseList.add(c2);

    s1.setCourseList(courseList);
    s2.setCourseList(courseList);
    s3.setCourseList(courseList);
    studentList.add(s1);
    studentList.add(s2);
    studentList.add(s3);


            }

    // display  details
    public String getStudentDetails () {
        return studentList.toString();
    }

    public String getStudentDetailsById ( int id){
        for (int j = 0; j <= studentList.size(); j++) {
            if (studentList.get(j).getId() == id) {

                return studentList.get(j).toString();
            }
        }

        return "";

    }

                public String deleteStudentDetails ( int id){
                    for (int i = 1; i <= studentList.size(); i++) {
                        if (studentList.get(i).getId()==id) {
                        studentList.remove(i);
                        return String.valueOf(true);
                    }
                    }
                    return "";

                }

}
