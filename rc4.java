import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.swing.JOptionPane;
class rc4{
	public static void main(String[] args) throws Exception{
		KeyGenerator kg=KeyGenerator.getInstance("rc4");
		SecretKey sk=kg.generateKey();
		Cipher ch=Cipher.getInstance("rc4");
		ch.init(Cipher.ENCRYPT_MODE,sk);
		String input=JOptionPane.showInputDialog("enter input");
		byte[] emsg=ch.doFinal(input.getBytes());
		ch.init(Cipher.DECRYPT_MODE,sk);
		byte[] dmsg=ch.doFinal(emsg);
		JOptionPane.showMessageDialog(null,"encrypted : " + new String(emsg)+"\ndecrypted : " + new String(dmsg));
		System.exit(0);
	}
}