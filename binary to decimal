// converting from binary to decimal

import java.util.Scanner;
public class binToDec
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        
        int power = 0;
        int res = 0;
        
        while(num>0)
        {
            res = res+((num%2)*(int)(Math.pow(2,power)));
            power++;
            num = num/10;
        }
        System.out.println(res);
        
    }
}
