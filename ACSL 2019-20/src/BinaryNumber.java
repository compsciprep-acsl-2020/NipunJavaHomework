import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        int seven1 = 0;
        int six1 = 0;
        int five1 = 0;
        int four1 = 0;
        int three1 = 0;
        int two1 = 0;
        int one1 = 0;
        int zero1 = 0;
        int seven = 128;
        int six = 64;
        int five = 32;
        int four = 16;
        int three = 8;
        int two = 4;
        int one = 2;
        int zero = 1;
        if(decimal - seven >= 0){
            seven1 = 1;
            decimal = decimal - seven;
        } if(decimal - six >= 0){
            six1 = 1;
            decimal = decimal - six;
        } if(decimal - five >= 0){
            five1 = 1;
            decimal = decimal - five;
        } if(decimal - four >= 0){
            four1 = 1;
            decimal = decimal - four;
        } if(decimal - three >= 0){
            three1 = 1;
            decimal = decimal - three;
        } if(decimal - two >= 0){
            two1 = 1;
            decimal = decimal - two;
        } if(decimal - one >= 0){
            one1 = 1;
            decimal = decimal - one;
        } if(decimal - zero >= 0){
            zero1 = 1;
            decimal = decimal - zero;
        }
        System.out.println(seven1 + "" + six1 + "" + five1 + "" + four1 + "" + three1 + "" +  two1 + "" + one1 + "" + zero1);
    }
}
