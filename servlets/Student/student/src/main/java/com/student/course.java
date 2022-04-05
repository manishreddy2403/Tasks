package com.student;

public class course {
    int courseId;
    String courseName;


    public int getCourseId( int courseId) {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName(String courseName) {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                '}';
    }


}
