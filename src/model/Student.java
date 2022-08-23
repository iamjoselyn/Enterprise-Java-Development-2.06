package model;

import exception.GradeInvalidException;

public class Student {
    private String name;
    private int grade;

    public Student (String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) throws GradeInvalidException {

        if ( grade <= 0 || grade >= 100) {
            throw new GradeInvalidException(grade);
        }

        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}



