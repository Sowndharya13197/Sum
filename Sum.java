import java.io.*;
import java.util.Scanner;
import java.math.*;
public class Sum {
    public static void main(String args[])
    {int i,n,sum=0;
    System.out.println("enter n");
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    for(i=1;i<=n;i++)
      sum=sum+i; 
    System.out.println(sum);
    }}
