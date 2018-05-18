#https://www.codewars.com/kata/credit-card-mask/train/java

public class Maskify {
    public static String maskify(String str) {
        int length = str.length() - 4;
        return length > 0 ? new String(new char[length]).replace("\0", "#") + str.substring(length,str.length()) : str ;
    }
}