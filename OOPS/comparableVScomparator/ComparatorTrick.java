package OOPS.comparableVScomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class studentData{
    int roll;
    String name;
    int marks;
    studentData(int roll,String name,int marks){
        this.roll=roll;
        this.name=name;
        this.marks=marks;

    }

}
public class ComparatorTrick {
    static void main() {
        List<studentData> list =new ArrayList<>();
        list.add(new studentData(11,"udhgfhv",30));
        list.add(new studentData(12,"udfhvijfv",57));
        list.add(new studentData(4,"udfhbdbv",37));
        list.add(new studentData(16,"udfhvgfd",85));
        list.add(new studentData(5,"udfhvdg",88));
        list.add(new studentData(2,"uddfdfhv",76));
        list.add(new studentData(3,"udfhddfv",37));
        list.add(new studentData(8,"udfhdddv",87));
        list.add(new studentData(1,"udfhddv",85));
        list.add(new studentData(16,"udfhdv",67));
        list.add(new studentData(17,"udfhddv",97));

        Collections.sort(list , new Comparator<studentData>(){

            public int compare(studentData s1,studentData s2){
                return s2.marks-s1.marks;

            }

        });

        for (studentData s: list) {
            System.out.println(s.roll+" "+s.name+" "+s.marks);
        }



    }
}
