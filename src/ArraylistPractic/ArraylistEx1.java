package ArraylistPractic;
import java.util.ArrayList;


public class ArraylistEx1 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        //get operation
        int element =list.get(2);
       System.out.println(element);

        //Delete
        list.remove(3);
        System.out.println(list);

        //set
        list.set(2,40);
        System.out.println(list);

    }
}
