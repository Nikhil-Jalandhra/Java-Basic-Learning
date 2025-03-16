package Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
    int id;
    String name;

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student other){
        return this.id - other.id; // By Id
        // return this.name.compareTo(other.name); //By Name
    }

}

public class MyComparable {


    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Aryan"));
        students.add(new Student(4, "Deniel"));
        students.add(new Student(9, "Bimla"));
        students.add(new Student(8, "Aarchi"));

        System.out.println("Before Sorting");
        for(Student s : students){
            System.out.println(s.id + "="+s.name);
        }
        
        Collections.sort(students);
        System.out.println(" ");
        System.out.println("After Sorting");

        for(Student s : students){
            System.out.println(s.id + "="+s.name);
        }
    }
}
