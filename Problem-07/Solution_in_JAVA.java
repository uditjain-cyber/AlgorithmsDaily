/*
This is a sample file explaining the format of your code. Do not make any changes to the file.
Author : Rohan Nishant
College : Birla Institute of Technology, Mesra
Year/Department : 2018/CSE
E-Mail Id : rohan.nishant1999@gmail.com

Insert Your Code Here
*/
import java.util.Scanner;
 
public class Roman {
        static String romanNumeral;
        static int decimalNum;
        public static void main(String args[]) {
                Roman rmtoD = new Roman();
                rmtoD .convertToDecimal();
                rmtoD .printRoman(romanNumeral);
        }
 
        public void convertToDecimal () {
                Scanner scan = new Scanner(System.in);
                System.out.print("Enter a Roman number: ");
                romanNumeral = scan.nextLine();
                romanNumeral = romanNumeral.toUpperCase();
                
                int l=  romanNumeral.length();
                int num=0;
                int previousnum = 0;
                for (int i=l-1;i>=0;i--)
                { 
                        char x =  romanNumeral.charAt(i);
                        x = Character.toUpperCase(x);
                        switch(x)
                        {  
                                case 'I':
                                previousnum = num;
                                num = 1;
                                break;
                             case 'V':
                                     previousnum = num;
                                num = 5;
                                break;
                                case 'X':
                                        previousnum = num;
                                num = 10;
                                break;
                                case 'L':
                                        previousnum = num;
                                num = 50;
                                break;
                                case 'C':
                                        previousnum = num;
                                num = 100;
                                break;
                                case 'D':
                                        previousnum = num;
                                num = 500;
                                break;
                                case 'M':
                                        previousnum = num;
                                num = 1000;
                                break;
                        }           
                        if (num<previousnum)
                        {decimalNum= decimalNum-num;}
                         else
                        decimalNum= decimalNum+num;
                }
        }
        public static void printRoman (String romanNumeral){
                System.out.println ("The equivalent of the Roman numeral "+romanNumeral+" is "+decimalNum);
        }
 
        public static void printDecimal (int decimalNum){
                System.out.println ("Decimal Number stored is: " + decimalNum);
        }
        
}
