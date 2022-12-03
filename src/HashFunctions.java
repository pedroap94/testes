import org.apache.commons.lang3.RandomStringUtils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashFunctions {
    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        String senha = "testing12345";
        String salt = RandomStringUtils.random(5, true, true);
        String senhaComSalt = senha;
        System.out.println(senhaComSalt);

        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte messageEmByte[] = messageDigest.digest(senhaComSalt.getBytes("UTF-8"));

        StringBuilder stringBuilder = new StringBuilder();
        for (byte b : messageEmByte){
            stringBuilder.append(b);
        }
        String retorno = stringBuilder.toString();
        System.out.println(retorno);

        if("-49-128-51-118-197245932139-41-36114-4-17-87899388940726812545-64-80-24125-4-102-112".equals(retorno)){
            System.out.println("Correto");
        }
    }
}
