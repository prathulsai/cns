import java.io.*;
import java.lang.*;
import java.util.*;
class cr
{
public static void  main(String args[] )
{
String p;
Scanner sc=new Scanner(System.in);
System.out.println("enter plain text");
String abc="abcdefghijklmnopqrstuvwxyz";
p=sc.nextLine();
char c[]=new char[100];
char p1[]=new char[100];
System.out.println("enter key");
int key=sc.nextInt();
for(int i=0;i<p.length();i++)
{
c[i]=abc.charAt(((int)p.charAt(i)-97+key)%26);
}
System.out.print("encrypted message is : ");
for(int i=0;i<p.length();i++)
System.out.print(c[i]);
for(int i=0;i<p.length();i++)
{
int a=((int)c[i]-97-key)%26;
if(a<0)
a=a+26;
p1[i]=abc.charAt(a);
}
System.out.println();
System.out.print("decrypted message is : ");
for(int i=0;i<p.length();i++)
System.out.print(p1[i]);
}}