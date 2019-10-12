import java.util.ArrayList;

public class ArrayTotals {
    public static void main(String[] args) {
        int[] counts = new int[100];
        for (int i = 0; i < counts.length; i++) {
            counts[i] = (int) (Math.random() * 201);
        }

        int[] evens = even(counts);
        for(int i = 0; i < evens.length; i++){
            System.out.println(evens[i]);
        }
    }
    public static int[] even(int[] counts){
        int[] evens = new int[100];
        for (int i = 0; i < counts.length; i++){
            if(counts[i]%2==0){
                for (int j = 0; j < counts.length; j++) {
                    evens[j] = counts[i];
                }
            }
        }
        return evens;
    }
    public static int[] odds(int[] counts, int[] evens){
        for (int i = 0; i < counts.length; i++){
            if(counts[i]%2==1){
                for (int j = 0; j < counts.length; j++) {
                    evens[j] = counts[i];
                }
            }
        }
        return evens;
    }
}
