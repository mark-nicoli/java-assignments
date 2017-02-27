import java.util.Scanner;
public class AddElements
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner (System.in);
        double array[] = new double[10];
        for(int i = 0; i<array.length;i++)
        {
            array[i] = scan.nextDouble();
        }
        double total = 0;
        for(int i = 0; i<9; i++)
        {
            total = array[i+1]+array[i];
            double num1 = ((double)Math.round((total)*100)/100);
            System.out.println(array[i+1]+"+"+array[i]+"="+num1);
        }
    }
}
