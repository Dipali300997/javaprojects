package assignment2;

public class question2 {
    public static void main(String[] args) {
        int sum=0;
        for (int i=1; i<=3; i++) {
            int p=1;
            for (int j=1; j<=i; j++) {
                p *= j;//p=p*j
            }
           sum+=p;//sum=p+sum

        }
        System.out.println("sum"+sum);
        }
        {


        }

    }

