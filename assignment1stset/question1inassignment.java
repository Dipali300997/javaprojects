package assignment1stset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class question1inassignment {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("enter any two numbers");
        int i = Integer.parseInt(br.readLine());
        int j = Integer.parseInt(br.readLine());

        System.out.println("Enter 1 for addition, Enter 2 for subtraction," +
                "Enter 3 for multiplication, Enter 4 for division");
        int k=Integer.parseInt(br.readLine());

        switch (k)
        {
            case 1 :
                System.out.println(i+j);
                break;
            case 2 :
                System.out.println(i-j);
                break;
            case 3 :
                System.out.println(i*j);
                break;
            case 4:
                System.out.println(i/j);
                break;
        }

    }

}
