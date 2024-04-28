public class Main {

    public static void main(String[] args) throws Exception {
        Person alice = new Person("Alice");
        Person bob = new Person("Bob");

        String message1 = "Hello Bob, this is Alice!";
        String message2 = "Hello Alice, this is Bob!";

        // Symmetric encryption and decryption of message sent between Alice and Bob
        // Use AES-256
        System.out.println("Encrypted result of AES: " + alice.encryptedSymmetricMessage(message1));
        System.out.println("Decrypted result of AES: " + alice.decryptedSymmetricMessage(message1));

        // Asymmetric encryption and decryption of message sent between Alice and Bob
        // Use RSA-2048
        System.out.println();
        System.out.println("Encrypted result of RSA: " + bob.encryptedAsymmetricMessage(message2));
        System.out.println("Decrypted result of RSA: " + bob.decryptedAsymmetricMessage(message2));

        // Signing the message, use RSA-2048
        String signature = bob.signMessage(message2);
        System.out.println();
        System.out.println("Signature: " + signature);

        // Verifying the signature, use RSA-2048
        boolean b = bob.verifySignature(message2, signature);
        System.out.println("Signature valid: " + b);
    }
}
