package OOPS.comparableVScomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
    int rollNo;
    String name;
    int marks;
    Student(int rollNo,String name,int marks){
        this.rollNo=rollNo;
        this.name=name;
        this.marks=marks;
    }
    @Override
    public int compareTo(Student that ){
        if (this.rollNo<that.rollNo ){
            return -1;

        }
        else {
            return 1;
        }
    }
}
public class ComparableDemo {
    static void main() {
        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "Ashu", 70));
        list.add(new Student(2, "Asjhfu", 72));
        list.add(new Student(1, "Asdsvshu", 50));
        Collections.sort(list);
        for (Student s :list){
            System.out.println(s.rollNo+" "+s.name);
        }

    }
}
