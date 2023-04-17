package assignment1stset;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class question4assignment {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Type any number");
        int x=Integer.parseInt(br.readLine());
        int flag=0;
        for (int i=1;i<x;i++) {

            if (i * i == x) {
                System.out.println(x + "is the perfect square.");
                flag=1;
            }
        }
    if (flag==0)
        System.out.println(x+ " is not perfect square");
    }
}
