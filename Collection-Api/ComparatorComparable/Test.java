package ComparatorComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Student> student = new ArrayList<>();
        student.add(new Student(9, "Alias"));
        student.add(new Student(3, "Michale"));
        student.add(new Student(2, "Radhika"));
        student.add(new Student(1, "Parmod"));

        Collections.sort(student);
        for(Student s : student){
            System.out.println(s.id +"="+s.name);
        }
        
        System.out.println(" ");
        System.out.println("By Comparator");
        Collections.sort(student, new StudentComparator());
        for(Student s : student){
            System.out.println(s.id +"="+s.name);
        }
    }
}
