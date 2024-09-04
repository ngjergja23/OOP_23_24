package Zad_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {
    private int studentId;
    private String studName;
    private String university;
    private List<String> courses;

    public Student(int id, String studName, String university, ArrayList<String> courses) {
        this.studentId = id;
        this.studName = studName;
        this.university = university;
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studName='" + studName + '\'' +
                ", university='" + university + '\'' +
                ", courses=" + courses +
                '}';
    }
}
