import java.util.ArrayList;
import java.util.List;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<Integer> random = new ArrayList<Integer>();
        for(int i = 0; i < 100; i++){
            random.add((int)(Math.random()*201));
        }
        System.out.println(random);
        System.out.println(evens(random));
        System.out.println(odds(random));

    }
    public static ArrayList<Integer> evens(ArrayList<Integer> random){
        ArrayList<Integer> even = new ArrayList<Integer>();

        for (int i = 0; i < random.size(); i++){
            if(random.get(i)%2 == 0){
                even.add(random.get(i));
            }
        }
        return even;
    }
    public static ArrayList<Integer> odds(ArrayList<Integer> random){
        ArrayList<Integer> odd = new ArrayList<Integer>();
        for (int i = 0; i < random.size(); i++){
            if(random.get(i)%2 != 0){
                odd.add(random.get(i));
            }
        }
        return odd;
    }
}
