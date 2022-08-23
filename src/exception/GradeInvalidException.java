package exception;

import model.Student;

public class GradeInvalidException extends Exception{
    private int grade;

    public GradeInvalidException(int grade) {
        this.grade = grade;
    }
}
