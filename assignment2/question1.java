package assignment2;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class question1 {
    public static void main(String[] args) throws IOException {
        int count=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any number");
        int x= Integer.parseInt(br.readLine());
        for (int i=1; i<=x; i++)
            if (x%1==0)
                count=count+1;
        if (count==2) {
            System.out.println("This is  a prime number");
        }else
                System.out.println("This is not the prime number");






    }

}
