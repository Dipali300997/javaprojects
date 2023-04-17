package assignment1stset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class question5assignment {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter total cost");
        int x=Integer.parseInt(br.readLine());
        int finalcost = 0;
        if (x<=2000)
        {
            finalcost=x-(x*5)/100;
            System.out.println("Your final bill is :"+finalcost);
        }
        if (x>=2001 && x<=5000)
        {
            finalcost=x-(x*25)/100;
            System.out.println("Your final bill is :"+finalcost);
        }
        if (x>=5001 && x<=10000)
        {
            finalcost=x-(x*35)/100;
            System.out.println("Your final bill is :"+finalcost);
        }
        if (x>10000)
        {
            finalcost=x-(x*50)/100;
            System.out.println("Your final bill is :"+finalcost);
        }









    }
}
