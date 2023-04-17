package assignment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class question4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any number(containing maximum three numbers)");
        int num=Integer.parseInt(br.readLine());
        int firstdigit=0; int seconddigit=0; int thirddigit=0;
        int sum=0;
         firstdigit= num%10;
         seconddigit= (num/10)%10;
         thirddigit= num/100;
         sum = firstdigit+seconddigit+thirddigit;
        System.out.println("The sum of the digits in given number is:"+sum);









    }
}
