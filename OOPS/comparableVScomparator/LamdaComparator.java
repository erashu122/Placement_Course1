package OOPS.comparableVScomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Bstudent{
    int roll;
    int marks;
    String Name;
    Bstudent(int roll,String name ,int marks){
        this.marks=marks;
        this.roll=roll;
        this.Name=name;

    }
}
public class LamdaComparator {
    static void main() {
        List<Bstudent> list=new ArrayList<>();
        list.add(new Bstudent(11,"udhgfhv",30));
        list.add(new Bstudent(12,"udfhvijfv",57));
        list.add(new Bstudent(4,"udfhbdbv",37));
        list.add(new Bstudent(16,"udfhvgfd",85));
        list.add(new Bstudent(5,"udfhvdg",88));
        list.add(new Bstudent(2,"uddfdfhv",76));
        list.add(new Bstudent(3,"udfhddfv",37));
        list.add(new Bstudent(8,"udfhdddv",87));
        list.add(new Bstudent(1,"udfhddv",85));
        list.add(new Bstudent(16,"udfhdv",67));
        list.add(new Bstudent(17,"udfhddv",97));

        Collections.sort(list,(s1,s2)->{
                    return s1.marks- s2.marks;
        });

        for (Bstudent s:list){
            System.out.println(s.roll+" "+s.Name+" "+s.marks);
        }
    }
}
