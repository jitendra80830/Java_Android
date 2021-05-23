package Bank_Accounts;

import java.util.*;
public class First_Char {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = input.nextLine();
        str = " " + str;

        String str2 = "";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch ==' '){
                str2 = str2+ch;
                i++;
                ch = str.charAt(i);
                str2 = str2+Character.toUpperCase(ch);

            }else{
                str2 = str2+ch;
            }
        }
        str2=str2.strip();
        System.out.println(str2);
    }
}