package org.example;

public class Main {
    public static void main(String[] args) {
        String password = "9kldunm*De";
        int len = 8;
        if(isGoodPW(password,len)){
            System.out.println("ur password is OK");
        }else{
            System.out.println("ur password is not ok, please change it.");
        }
        System.out.println("========================");

        String regex ="^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=*_])(?=\\S+$).{8,}$";

        System.out.println(isGood(password,regex));
    }
    public static boolean isLong(String str,int len){
        //return str.matches(".{8,}");
        return str.length()>=len;
    }

    public static boolean containsNum(String str){
        //return str.matches(".*\\d+.*");
        for (int i = 0; i < str.length(); i++) {
            //(str.charAt(i)>='0'&&str.charAt(i)<='9')
            if(Character.isDigit(str.charAt(i))){
                return true;
            }
        }
        return false;
    }
    public static boolean containsUp(String str){
        //return str.matches(".*[a-z].*[A-Z].*");
        for (int i = 0; i < str.length(); i++) {
            //(str.charAt(i)>='a' &&str.charAt(i)<='z')
            if(Character.isLowerCase(str.charAt(i))){
                return true;
            }
        }
        return false;
    }

    public static boolean containsLow(String str){
        //return str.matches(".*[a-z].*[A-Z].*");
        for (int i = 0; i < str.length(); i++) {
            //if(str.charAt(i)>='A'&&str.charAt(i)<='Z')
            if(Character.isUpperCase(str.charAt(i))){
                return true;
            }
        }
        return false;
    }

/*
    public static boolean isGoodPW1(String pw) {
        String[] badPW = {"123456789","asdfg","password"};
        for (String str:badPW) {
            if(pw.equals(badPW[i])){
                return false;
            }
        }
        return true;
    }

 */

    public static boolean isGoodPW(String password,int len) {
        boolean isLong = isLong(password,len);
        boolean containsNum = containsNum(password);
        boolean containsUp = containsUp(password);
        boolean containsLow = containsLow(password);

        return isLong && containsNum && containsUp && containsLow;
    }

    public static boolean isGood(String str,String regex) {
        return str.matches(regex);
    }
}