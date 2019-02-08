import java.io.*;
import java.lang.*;
import java.util.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.KeyGenerator;
import sun.misc.BASE64Encoder;
class blowfish
{
public static void main(String args[])throws Exception
{??
KeyGenerator keygenerator=KeyGenerator.getInstance("Blowfish");
keygenerator.init(128);
Key secretkey=keygenerator.generateKey();
Cipher cipherout=Cipher.getInstance("Blowfish/CFB/nopadding");
cipherout.init(Cipher.ENCRYPT_MODE,secretkey);
BASE64Encoder encoder=new BASE64Encoder();
byte iv[]=cipherout.getIV();
if(iv!=null){
System.out.println("initialization vector of the cipher :"+
encoder.encode(iv));
}
FileInputStream fin=new FileInputStream("input.txt");
FileOutputStream fout=new FileOutputStream("output.txt");
CipherOutputStream cout=new CipherOutputStream(fout,cipherout);
int input=0;
while((input=fin.read())!=-1){
cout.write(input);}
fin.close();
cout.close();
}}