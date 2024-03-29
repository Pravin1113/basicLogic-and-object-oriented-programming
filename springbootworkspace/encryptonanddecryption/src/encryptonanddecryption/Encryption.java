package encryptonanddecryption;

public class Encryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      final String secretKey= "pravinchavan";
      String originalString ="shweta bhosale";
       String enSite= MyAESApp.encrypt(originalString, secretKey);
       String dnSite= MyAESApp.dncrypt(enSite, secretKey);

       System.out.println("original "+ originalString);
       System.out.println("encrypted string " + enSite);
       System.out.println("dcrypted string " + dnSite);


	}

}
