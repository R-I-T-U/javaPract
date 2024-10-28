// wap to check whether input alphabet is vowel is consonant.

import java.util.Scanner;

public class p2 {
    public static void main(String [] args){
        System.out.println("enter a letter:");
        Scanner sc = new Scanner(System.in);
        char  a= sc.next().charAt(0); //next() is used to read a word of a string 
        // chatAt(index) is used to take 1 character from the given index

        switch(a){
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
            System.out.println(a+" is vowel");
            default:
            System.out.println(a+" is consonant");
        }
        sc.close();
    }
}
