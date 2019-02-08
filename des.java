import java.io.*;
import java.lang.*;
import java.util.*;
class des
{
public static void main(String args[])
{
int i,ch,lp=1;
char cipher[],plain1[];
String plain,key;
cipher=new char[50];
plain1=new char[50];
while(true)
{
System.out.println("MENU");
System.out.println("\n1.data encryption\n2.data decryption\n3.exit");
System.out.println("enter your choice");
Scanner sc=new Scanner(System.in);
ch=sc.nextInt();
switch(ch)
{
case 1:System.out.println("\nData encryption");
System.out.println("enter the plain text : ");
plain=sc.next();
System.out.println("enter the encryption key");
key=sc.next();
lp=key.length();
for(i=0;i!=plain.length();i++)
cipher[i]=(char)((int)plain.charAt(i)^lp);
cipher[i]='\0';
System.out.println("\nthe encrypted text is");
System.out.println(cipher);
break;
case 2:System.out.println("\ndata decryption");
for(i=0;cipher[i]!='\0';i++)
plain1[i]=(char)((int)cipher[i]^lp);
System.out.println("\ndecrypted text is");
System.out.println(plain1);
break;
case 3:System.exit(0);
}}}}

