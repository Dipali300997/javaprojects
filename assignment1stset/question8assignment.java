package assignment1stset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class question8assignment {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any number");
        int x=Integer.parseInt(br.readLine());
        int f=1;
        for (int y=1; y<=x; y++) {
             f=f*y;

        }
        System.out.println("Factorial of given number is:"+f);
        }



    }

