import java.util.Scanner;
public class Clumps
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner (System.in);
        int num[];
        num = new int[scan.nextInt()];
        for(int i = 0; i<num.length;i++)
        {
            num[i] = scan.nextInt();
        }
        int counter = 1;
        int clump = 0;
        for(int i = 0; i<num.length-1;i++)
        {
            if(num[i]==num[i+1])
            {
                counter++;
                if(counter>clump)
                {
                    clump = counter;
                }
            }
            else
                {
                    counter = 1;
                }
        }
        System.out.println("Biggest Clump Size: "+clump);
    }
}
