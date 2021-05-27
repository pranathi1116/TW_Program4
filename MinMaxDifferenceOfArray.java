import java.util.*;
public class MinMaxDifferenceOfArray {
    public static void main(String args[])
    {
        Scanner scanner= new Scanner(System.in);
        int arraySize=scanner.nextInt();
        int[] arrayElements=new int [arraySize];
        for(int i=0;i<arraySize;i++)
            arrayElements[i]=scanner.nextInt();
        int max=arrayElements[0];
        int min=arrayElements[0];
        for(int i=0;i<arraySize;i++) {
            if (arrayElements[i] > max)
                max = arrayElements[i];
            if (arrayElements[i] < min)
                min = arrayElements[i];
        }
        System.out.println("The range of the array is "+(max-min));
        }
    }

