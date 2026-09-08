package ArraylistPractic;
import java.util.*;
public class ArraylistEx5 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(2);

        int max = Integer.MIN_VALUE;
        for (int i=0; i< list.size(); i++){
            if(max < list.get(i)){
                max = list.get(i);
            }
        }
        System.out.println("max element = " + max);
    }
}
