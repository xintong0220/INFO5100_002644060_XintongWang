import javax.crypto.SecretKey;
import java.security.KeyPair;
import java.util.Base64;

class Person {
    private String name;
    private SecretKey secretKey;
    private KeyPair keyPair;

    public Person(String name) throws Exception {
        this.name = name;
        this.secretKey = Crypto.generateKey();
        this.keyPair = Crypto.generateKeyPair();
    }

    public String encryptedSymmetricMessage(String message) throws Exception {
        return Base64.getEncoder().encodeToString(Crypto.symmetricEncryption(message, secretKey));
    }

    public String decryptedSymmetricMessage(String message) throws Exception {
        byte[] encryptedMessage = Crypto.symmetricEncryption(message, secretKey);
        return Crypto.symmetricDecryption(encryptedMessage, secretKey);
    }

    public String encryptedAsymmetricMessage(String message) throws Exception {
        return Base64.getEncoder().encodeToString(Crypto.asymmetricEncryption(message, keyPair.getPublic()));
    }

    public String decryptedAsymmetricMessage(String message) throws Exception {
        byte[] encryptedMessage = Crypto.asymmetricEncryption(message,keyPair.getPublic());
        return Crypto.asymmetricDecryption(encryptedMessage, keyPair.getPrivate());
    }

    public String signMessage(String message) throws Exception {
        return Crypto.sign(message, keyPair.getPrivate());
    }

    public boolean verifySignature(String message, String signature) throws Exception {
        return Crypto.verify(message,signature,keyPair.getPublic());
    }
}
