
package viva1;
import java.util.Scanner;

public class Viva1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String strength;
        int upper=0,lower=0,special=0,digit=0;
        System.out.println("Enter your password: ");
        String password=sc.nextLine();
                
        for(int i=0;i<password.length();i++){
        char x1=password.charAt(i);
   
           if(Character.isLowerCase(x1))
               lower++;
           if(Character.isUpperCase(x1))
               upper++;
           if(x1=='!'||x1=='@'||x1=='#'||x1=='$'||x1=='%'||x1=='^'||x1=='&'||x1=='*'||x1=='('||x1==')'||x1=='-'||x1=='+')
               special++;
           if(Character.isDigit(x1))
               digit++;
           
           }
        if(upper>0&&lower>0&&special>0&&password.length()>=8&&digit>0)
            strength="Strong";
        
        else if(upper>0&&lower>0&&special>0&&password.length()>=6)
            strength="Moderate";
        else
            strength="Weak";
        
        System.out.println("Strength of password: "+strength);
    }
            
}

