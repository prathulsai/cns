import java.io.*;
import java.lang.*;
import java.util.*;
class RC4{
public static void main(String args[])throws Exception{
int temp=0;
String ptext;
String key;
int s[]=new int[256];
int k[]=new int[256];
DataInputStream in=new DataInputStream(System.in);
System.out.println("enter plain text \t");
ptext=in.readLine();
System.out.print("enter key text \t");
key=in.readLine();
char ptextc[]=ptext.toCharArray();
char keyc[]=key.toCharArray();
int cipher[]=new int[ptext.length()];
int decrypt[]=new int[ptext.length()];
int ptexti[]=new int[key.length()];
int keyi[]=new int[key.length()];
for(int i=0;i<ptext.length();i++){
ptexti[i]=(int)ptextc[i];
}
for(int i=0;i<key.length();i++){
keyi[i]=(int)keyc[i];
}
for(int i=0;i<256;i++){
s[i]=i;
k[i]=keyi[i%key.length()];
}
int j=0;
for(int i=0;i<256;i++){
j=(j+s[i]+k[i])%256;
temp=s[i];
s[i]=s[j];
s[j]=temp;
}
int i=0;
j=0;
int z=0;
for(int l=0;l<ptext.length();l++){
i=(l+1)%256;
j=(j+s[i])%256;
temp=s[i];
s[i]=s[j];
s[j]=temp;
z=s[(s[i]+s[j])%256];
cipher[l]=z^ptexti[l];
decrypt[l]=z^cipher[l];
}
System.out.println("\nencrypted :\t");
display(cipher);
System.out.println("\ndecrypted :\t");
display(decrypt);
}
static void display(int disp[]){
char convert[]=new char[disp.length];
for(int l=0;l<disp.length;l++){
convert[l]=(char)disp[l];
System.out.println(convert[l]);
}
}}
