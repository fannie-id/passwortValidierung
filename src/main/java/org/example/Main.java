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

        String regex ="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=*])(?=\\S+$).{8,}$";

        System.out.println(isGood(password,regex));
    }
    public static boolean isLong(String str,int len){
        return str.length()>=len;
    }

    public static boolean containsNum(String str){
        //return str.matches(".*\\d+.*");
        int countNum = 0;
        for (int i = 0; i < str.length(); i++) {
            //Character.isDigit(str.charAt(i))
            if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
                countNum++;
            }
        }
        return countNum>0;
    }
    public static boolean containsUpLow(String str){
        //return str.matches(".*[a-z].*[A-Z].*");

        int countUp = 0;
        int countDown = 0;
        for (int i = 0; i < str.length(); i++) {
            //Character.isLowerCase(str.charAt(i))
            if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
                countUp++;
            }
            //Character.isUpperCase(str.charAt(i))
            if(str.charAt(i)>='A'&&str.charAt(i)<='Z'){
                countDown++;
            }
        }
        return countUp>0&&countDown>0;
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
        boolean containsUpLow = containsUpLow(password);

        return isLong&&containsNum&&containsUpLow;
    }

    public static boolean isGood(String str,String regex) {
        return str.matches(regex);
    }
}