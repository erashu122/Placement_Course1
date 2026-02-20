package OOPS.comparableVScomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Studen {
    int rollNo;
    String name;
    int marks;
    Studen(int rollNo,String name,int marks){
        this.rollNo=rollNo;
        this.name=name;
        this.marks=marks;
    }
}
class MyCustomComparator implements Comparator<Studen> {
    @Override
    public int compare(Studen s1,Studen s2){
        if (s1.marks< s2.marks){
            return -1;
        }else {
            return 1;
        }
    }
}
public class ComparatorDemo {
    static void main() {
        List<Studen> list = new ArrayList<>();
        list.add(new Studen(3, "Ashu", 70));
        list.add(new Studen(2, "Asjhfu", 72));
        list.add(new Studen(1, "Asdsvshu", 50));
        Collections.sort(list,new MyCustomComparator());
        for (Studen s :list){
            System.out.println(s.rollNo+" "+s.name+" "+s.marks);
        }

    }
}
