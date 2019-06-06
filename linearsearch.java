import java.util.Scanner;

public class linearsearch {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int p = sc.nextInt();
        int arr[]=new int[p];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Give the element to be searched");
        int val=sc.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==val)
            {
                System.out.println("Element found at " + (i+1));
                return;
            }
        }
        System.out.println("Element not found");
    }
}

