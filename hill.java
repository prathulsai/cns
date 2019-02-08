import java.io.*;
import java.lang.*;
import java.util.*;
class hill
{
public static void main(String args[])
{
String p;
String abc="abcdefghijklmnopqrstuvwxyz";
int k[][]={{6,24,1},{13,16,10},{20,17,15}};
int k1[][]={{8,5,10},{21,8,21},{21,12,8}};
int a[][]=new int[3][1];
int c[][]=new int[3][3];
int c1[][]=new int[3][3];
Scanner sc=new Scanner(System.in);
System.out.println("enter plain text");
p=sc.nextLine();
for(int i=0;i<3;i++)
{
a[i][0]=(((int)p.charAt(i))-97);
System.out.println(a[i][0]);
}
for(int i=0;i<3;i++)
for(int j=0;j<3;j++)
c[i][0]=c[i][0]+k[i][j]*a[j][0];
System.out.print("encrypted text is :");
for(int i=0;i<3;i++)
{
c[i][0]=c[i][0]%26;
System.out.print(abc.charAt(c[i][0]));
}
for(int i=0;i<3;i++)
for(int j=0;j<3;j++)
c1[i][0]=c1[i][0]+k1[i][j]*c[j][0];
System.out.println("\ndecrypted text is");
for(int i=0;i<3;i++)
{
c1[i][0]=c1[i][0]%26;
System.out.print(abc.charAt(c1[i][0]));
}
}}