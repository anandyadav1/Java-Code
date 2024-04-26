import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<Integer>();
        //add element
        list.add(5);
        list.add(6);
        list.add(9);
        list.add(8);
        list.add(2);
        System.out.println(list);

        //get element
        int element= list.get(2);
        System.out.println("The element is get index 2 :\n" +element);

        //add element in between
        list.add(1,23);
        System.out.println("After add ellemnt in between index 1 :\n" +list);

        //set element 
        list.set(0,98);
        System.out.println("After set new element on index 0 :\n"+ list);

        //delete element
        list.remove(5);
        // list.remove(list.size()-3);
        System.out.println("After delete element at last index :\n"+list);

        
        //size
        int size=list.size();
        System.out.println("The size of list :\n"+size);

        //loops
        for( int i=0; i<list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();

        //sorting
        Collections.sort(list);
        System.out.println("After sorting list :\n"+list);
    }
}
