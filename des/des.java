import java.lang.*;
import java.io.*;
import java.util.*;
class des{
public static void main(String args[]){

//plain text form user
System.out.println("enter text to be encrypted");
Scanner sc=new Scanner(System.in);
String pt=sc.nextLine();
StringBuilder pt1=new StringBuilder("");
StringBuilder pt2=new StringBuilder("");
StringBuilder key64=new StringBuilder("");
StringBuilder key56=new StringBuilder("");
StringBuilder roundkey=new StringBuilder("");
StringBuilder roundkey1=new StringBuilder("");
StringBuilder pt482=new StringBuilder("");
StringBuilder final1=new StringBuilder("");
StringBuilder final2=new StringBuilder("");
StringBuilder pt321=new StringBuilder("");
StringBuilder pt32=new StringBuilder("");
StringBuilder a1=new StringBuilder("");
StringBuilder a2=new StringBuilder("");
StringBuilder pt483=new StringBuilder("");


//converting into binary
for(int i=0;i<8;i++)
pt1.append('0'+Integer.toBinaryString((int)pt.charAt(i)));
System.out.println(pt1);

//intial permutation
for(int i=0;i<64;i++)
pt2.append(pt1.charAt(des_data.IP[i]-1));


//key from user
System.out.println("enter key");
String key=sc.nextLine();

//converting key to binary
for(int i=0;i<8;i++)
key64.append('0'+Integer.toBinaryString((int)key.charAt(i)));


//64 to 56 bit
for(int i=0;i<64;i++)
if((i+1)%8!=0)
key56.append(key64.charAt(i));


roundkey=key56;


//16 rounds
for(int i=0;i<16;i++)
{
roundkey=des_data.cshift(roundkey,i);
for(int j=0;j<48;j++)
roundkey1.append(roundkey.charAt(des_data.KT[j]-1));


for(int j=0;j<48;j++)
pt482.append(pt2.charAt(des_data.EB[j]-1+32));
for(int j=0;j<48;j++)
pt483.append(roundkey1.charAt(j) ^ pt482.charAt(j));



for(int j=0;j<8;j++)
{
a1.append(pt483.charAt(j*6));
a1.append(pt483.charAt(((j+1)*6)-1));
for(int k=0;k<4;k++)
a2.append(pt483.charAt((j*6)+1+k));

pt32.append(des_data.num_to_bin(des_data.SBfun(Integer.parseInt(a1.toString(),2),Integer.parseInt(a2.toString(),2),j+1)));

a1.delete(0,2);
a2.delete(0,4);

}

for(int j=0;j<32;j++)
pt321.append(pt32.charAt(des_data.PB[j]-1));

for(int j=32;j<64;j++)
final1.append(pt2.charAt(j));

for(int j=0;j<32;j++)
final1.append(pt2.charAt(j)^pt321.charAt(j));

pt2.delete(0,100);
for(int j=0;j<64;j++)
pt2.append(final1.charAt(j));

roundkey1.delete(0,100);
pt482.delete(0,100);
pt483.delete(0,100);
pt32.delete(0,100);
pt321.delete(0,100);
final1.delete(0,100);

}
for(int i=0;i<64;i++)
final2.append(pt2.charAt(des_data.FP[i]-1));
System.out.println("cipher");
System.out.println(final2);
for(int i=0;i<8;i++)
System.out.print((char)(Integer.parseInt(final2.substring(8*i,(8*i)+8))%128));


}}
