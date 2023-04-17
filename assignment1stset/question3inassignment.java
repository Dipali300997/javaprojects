package assignment1stset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class question3inassignment {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number (containing maximum 3 digits)");
        int x=Integer.parseInt(br.readLine());
        if
        (x/100>=1)
            System.out.println("It is a three digit number");
        else
        {
            if (x/10>=1)
                System.out.println("It is a two digit number");
            if (x/10<1)
                System.out.println("It is a one digit number");

        }

    }
}
