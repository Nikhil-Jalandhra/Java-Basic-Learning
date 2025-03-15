package List;
import java.util.ArrayList;
import java.util.List;

public class MyComparator {

    static class Students {
        private String name;
        private double gpa;

        public Students(String name, double gpa){
            this.name = name;
            this.gpa = gpa;
        }

        public String getStudent(){ return name; }
        public double getGpa(){ return gpa;}

    }

 public static void main(String[] args) {
    List<Students> nwStudents = new ArrayList<>();
    nwStudents.add(new Students("binod", 3.5));
    nwStudents.add(new Students("ramesh", 3.8));
    nwStudents.add(new Students("sudama", 3.7));
    nwStudents.add(new Students("bhugana", 3.1));

    nwStudents.sort((o1, o2) -> Double.compare(o2.getGpa(), o1.getGpa()));
    nwStudents.sort((o1, o2) -> o1.getStudent().compareTo(o2.getStudent()));


    for(Students s : nwStudents){
        System.out.println(s.getStudent() + ": " + s.getGpa());
    }
 }   
}
