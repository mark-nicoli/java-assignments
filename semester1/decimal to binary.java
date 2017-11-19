// decimal to binary

import java.util.Scanner;
public class decToBin
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner (System.in);
        int num = 0;
        String s = "";
        num = scan.nextInt();
    
            if (num<=0)
            {
                System.out.println("not a positive number");
            }
            else
            {
                s = "";
            }
            while(num !=0)
            {
                s=(num%2+s);
                num/=2;
            }
             System.out.println(s);
        }
        
 }
