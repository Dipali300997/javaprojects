package assignment1stset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class question2inassignmment {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter three numbers");
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        int z = Integer.parseInt(br.readLine());
        int result;

        if (x<y)
            result=x;
        else
            result=y;

        if (result<z)
            result=result;
        else
            result=z;

        System.out.println("The smallest number amongst the three numbers entered is:"+result);


          }
}
