import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLOutput;
import java.util.Base64;


public class ExEncryptDecrypt {
    public static void main(String[] args)  {
        if(args.length<4){
            System.out.println("Error : Insufficient input. Usage ");
            System.out.println("To Encrypt : Crypto <To-Encrypt> <Key> encrypt.");
            System.out.println("To Decrypt : Crypto <To-Decrypt> <Key> decrypt.");
            return;
        }
        String operation=args[3];
        String key=args[2];

        try{
            SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(), "AES");
            Cipher cipher=Cipher.getInstance("AES");
            cipher.init(operation.equals("encrypt") ? Cipher.ENCRYPT_MODE : Cipher.DECRYPT_MODE, secretKey);

            if(operation.equals("encrypt")){
                String textToEncrypt=args[1];
                byte[] encryptedBytes = cipher.doFinal(textToEncrypt.getBytes());
                String encryptedText = Base64.getEncoder().encodeToString(encryptedBytes);
                System.out.println("Encrypted text: " + encryptedText);

            }else if(operation.equals("decrypt")){
                byte[] textToDecrypt = args[1].getBytes();
                byte[] decryptedBytes=cipher.doFinal(Base64.getDecoder().decode(textToDecrypt));
                String decryptedText = new String(decryptedBytes);
                System.out.println("Decrypted text: " + decryptedText);
            }else{
                System.out.println("Please provide encrypt or decrypt for valid operations.");
            }
        } catch (NoSuchAlgorithmException e) {
        System.out.println("Error: The specified algorithm does not exist. " + e.getMessage());
    } catch (InvalidKeyException e) {
        System.out.println("Error: The provided key is invalid. " + e.getMessage());
    } catch (IllegalBlockSizeException e) {
        System.out.println("Error: The input data size is incorrect for the selected operation. " + e.getMessage());
    } catch (BadPaddingException e) {
        System.out.println("Error: The input data is not properly padded for decryption. " + e.getMessage());
    } catch (NoSuchPaddingException e) {
        System.out.println("Error: The specified padding scheme does not exist. " + e.getMessage());
    }


    }
}
