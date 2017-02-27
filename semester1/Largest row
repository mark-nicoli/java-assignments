import java.util.Scanner;
public class LargestRow
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        int arrayinput = scan.nextInt();
        int array[][] = new int[arrayinput][arrayinput];
        int b= 0;
        int maximum = 0;
        int sum = 0;
        
        for (int row = 0; row<arrayinput; row++)
        {
            sum=0;
            for(int column = 0; column<arrayinput; column++)
            {
                array[row][column] = scan.nextInt();
                sum = sum+array[row][column];
            }
            if (sum>maximum)
            {
                maximum = sum;
                b = row+1;
            }
            
        }
        System.out.println("R"+b);
    }
}
    
