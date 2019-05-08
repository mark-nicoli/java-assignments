import java.util.Scanner;
public class MethodsArrays
{
    public static void main(String[]args)
    {
       int array[] = fillArray();
       //printArray(array);
    }
    
    public static int [] fillArray()
    {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int array[] = new int[length];
         for(int i = 0; i<array.length;i++)
         {
           array[i] = scan.nextInt();
         }
         sumArray(array);
         return array;
    }
    
    public static int sumArray(int array[])
    {
        int add = 0;
        for(int i=0;i<array.length;i++)
        {
            add = add+array[i];
        }
        System.out.println("Sum = "+add);
        avgArray(array);
        return add;
    }
    
    public static int avgArray(int array[])
    {
        int average = 0;
        int num = 0;
        for(int i = 0; i<array.length;i++)
        {
            num = num+array[i];
        }
        average = num/array.length;
        System.out.println("Average = "+average);
        printArray(array);
        return average;
        
    }
    
    public static void printArray(int Array[])
    {
        for(int i = 0; i<Array.length;i++)
        {
            System.out.print(Array[i]+ " ");
        }
    }
    
}
