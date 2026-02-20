package OOPS.comparableVScomparator;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class student{
    int rollno;
    String name;
    int marks;
    student(int rollno,String name,int marks){
        this.rollno=rollno;
        this.name=name;
        this.marks=marks;
    }
}
public class AnomousComparatorDemo {
    static void main() {
        List<student>list=new ArrayList<>();
        list.add(new student(1,"mangergal",83));
        list.add(new student(2,"mangasgfdsl",45));
        list.add(new student(3,"mangalfgrd",73));

        Collections.sort(list, new Comparator<student>()
         {
             @Override
            public int compare(student s1,student s2){
                if (s1.marks<s2.marks){
                    return -1;
                }
                else {
                    return 1;
                }

            }

        });
        for (student s:list){
            System.out.println(s.rollno+" "+s.name+" "+s.marks);
        }
    }
}
