package com.company;


public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrom("8890988"));
        System.out.println(isPalindrom("106987t854"));
        System.out.println(isPalindrom("1918191"));
    }

    public static boolean isPalindrom(String number){

       char stringToChar [] = number.toCharArray();

        for (int i = 0; i < stringToChar.length; i++) {
            if (stringToChar[i] == stringToChar[stringToChar.length - 1 - i]){
               continue;
            }
            else return false;
        }
return true;
    }
}