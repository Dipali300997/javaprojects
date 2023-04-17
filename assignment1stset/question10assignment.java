package assignment1stset;

public class question10assignment {
    public static void main(String[] args) {
        int [] s={23,59,11,12};
        int mn=s[0];
        int mx=s[0];
        for (int i=1;i<s.length;i++)
        {
            if (s[i]<mn)
                mn=s[i];
            else
                mn=mn;
        }
        for (int i=1;i<s.length;i++)
        {
            if (s[i]>mx)
                mx=s[i];
            else
                mx=mx;
        }
        System.out.println("smallest number :"+mn);
        System.out.println("largest number :"+mx);
    }}
