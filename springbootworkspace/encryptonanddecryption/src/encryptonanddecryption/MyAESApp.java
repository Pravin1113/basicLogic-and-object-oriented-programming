package encryptonanddecryption;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

public class MyAESApp {
  private static SecretKeySpec secretkey;
  private static byte []key;
  
  public static void setKey(String myKey) {
	  try {
		key= myKey.getBytes("UTF-8");
		MessageDigest sha= MessageDigest.getInstance("SHA-1");
		key=sha.digest(key);
		key=Arrays.copyOf(key, 16);
		secretkey= new SecretKeySpec(key,"AES");
	} catch (UnsupportedEncodingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (NoSuchAlgorithmException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	    
  }
  public static String encrypt(String strToEnc,String sec) {
	  setKey(sec);
	  Cipher cipher;
	try {
		cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
	
	  cipher.init(cipher.ENCRYPT_MODE, secretkey);
	  return Base64.getEncoder().encodeToString(cipher.doFinal(strToEnc.getBytes()));
	}
	catch (Exception e) {
		// TODO: handle exception
	}
	return null;
	
	  
  }
  public static String dncrypt(String strToDec,String sec) {
	  setKey(sec);
	 
	try {
	 Cipher	cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
	  cipher.init(cipher.DECRYPT_MODE, secretkey);
	  return  new String (cipher.doFinal(Base64.getDecoder().decode(strToDec)));
	}
	catch (Exception e) {
		// TODO: handle exception
	}
	return null;
	
	  
  }
}
