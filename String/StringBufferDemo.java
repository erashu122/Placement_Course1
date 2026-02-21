package String;

public class StringBufferDemo {
    static void main() {
        StringBuffer sc = new StringBuffer("Mr.. ");
        sc.append(" Ashutosh"); //for adding the new String
        sc.insert(2, "r"); //for inserting the string in specific index
        sc.delete(2, 3); //for deleting string from given index to given index as sintex o
        //deleting the string is deleted( startIndex ,to endIndex as u want )
        sc.append(" Kumar Pandit");
        //is there many type of function are there like remove ,repace all
        System.out.println(sc); //for printing the value
    }
}
