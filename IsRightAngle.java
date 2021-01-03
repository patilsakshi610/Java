import java.util.Scanner;

public class IsRightAngle
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st dimention ");
        int a=sc.nextInt();
 System.out.println("enter 2nd dimention ");
        int b=sc.nextInt();
 System.out.println("enter 3rd dimention ");
        int c= sc.nextInt();
        if ( ((a==0) ||(a<0)) || ((b==0) || (b<0)) || ((c==0) || (c<0)))
             System.out.println("invalid dimentions");
        else {
            int s3 = IsGreater(a, b, c);
            isAngle(s3, a, b, c);
        }

    }

    static int IsGreater(int a, int b, int c)
    {
        int g=0;
        if ((a > b) && (a > c))
        {
            g = a;
        }
        else if ((b > a) && (b > c))
        {g = b;}
        else
        {
            g = c;
        }
        return g;
    }
    static void isAngle(int s3,int g,int m,int l)
    { int s1=0;int s2=0; int hypo=0; int hypo2=0;
        if (s3==g)
        {    s1=m; s2=l; }
        else if(s3==m)
        {    s1=g;s2=l;  }
        else if(s3==l)
        {    s1=g;s2=m;  }
        hypo=(s3*s3);
       hypo2=(s1*s1)+(s2*s2);
       if (hypo==hypo2)
           System.out.println("will form a right angled triangle");
       else
           System.out.println("will not form right angled triangle");

    }




}




