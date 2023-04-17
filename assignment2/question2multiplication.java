package assignment2;

public class question2multiplication {
    public static void main(String[] args) {
        int m=1;
        for (int i=1; i<=3; i++) {
            int p=1;
            for (int j=1; j<=i; j++) {
                p *= j;//p=p*j
            }
            m*=p;//m=m*p

        }
        System.out.println("m:"+m);
    }



    }






