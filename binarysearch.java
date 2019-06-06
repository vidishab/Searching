
import java.util.Scanner;

public class binarysearch {
    public void search(int arr[],int val,int min,int max)
    {
            int mid = (min+max)/2;
            if(arr[mid] == val)
            {
                System.out.println("Element found at " + (mid+1));
                return;
            }
            else if(arr[mid] > val)
            {
                search(arr, val, min, mid-1);
            }
            else if(arr[mid] < val)
            {
                search(arr, val, mid+1, max);
            }
    }

    public static void main(String args[])
    {
        binarysearch ob = new binarysearch();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int p = sc.nextInt();
        int arr[]=new int[p];
        System.out.println("Enter the elements");
        for(int i=0;i<p;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int val=sc.nextInt();
        ob.search(arr,val,0,p);
    }
}

