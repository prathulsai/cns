import java.io.*;
import java.lang.*;
import java.util.*;
class substition
{
public static void main(String args[])throws Exception
{
String abc="qazwsxedcrfvtgbyhnujmikolp";
System.out.println("enter the plain text");
Scanner sc=new Scanner(System.in);
String plain=sc.nextLine();
char cipher[]=new char[100];
System.out.println("encrypted message is");
for(int i=0;i<plain.length();i++)
cipher[i]=abc.charAt(plain.charAt(i)-97);
System.out.println(cipher);
}}