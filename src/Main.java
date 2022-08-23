import exception.GradeInvalidException;
import model.Student;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Student student1 = new Student("pepa", 10);
        Student student2 = new Student("lola", 20);
        Student student3 = new Student("pepe", 30);
        Student student4 = new Student("lolo", 100);

        HashMap<String, Student> studentHashMap = new HashMap<>();

        studentHashMap.put(student1.getName(), student1);
        studentHashMap.put(student2.getName(), student2);
        studentHashMap.put(student3.getName(), student3);
        studentHashMap.put(student4.getName(), student4);

        System.out.println("HashMap keyset : " + studentHashMap.keySet());
        System.out.println("HashMap values : " + studentHashMap.values());
        System.out.println("HashMap grades increased : " +  increaseGrade(studentHashMap).values());

    }

    public static HashMap<String, Student> increaseGrade(HashMap<String,Student> studentHashMap) {
        for (Student student: studentHashMap.values()) {
            try {
                int newGrade = (int) (student.getGrade() * 1.1); //int pasa de los decimales, averiguar el double
                student.setGrade(newGrade);
            } catch (GradeInvalidException e) {
                System.out.println("Grado invalido" + e);
            }
        }
        return studentHashMap;
    }
}