import java.util.Arrays;
import java.util.Scanner;
public class RandomSelect
{
	public static void main(String[] args)  
	{    
	    int arr[]={7980,22349,999,2799,229900,11101,9999,2195,9800,4999};
	    String items[]={ "MI Band: 999","Sandwich Toaster: 2195" ,"Cult Pass: 2799","Scale: 4999","Fitbit Plus: 7980","Microwave Oven: 9800"  ,"Alexa: 9999","Digital Camera: 11101", "IPods: 22349","Macbook Pro: 229900" };
	    int n = arr.length;
	    System.out.println("Enter the number of employees");
	    Scanner s = new Scanner(System.in);
	    int k=s.nextInt();
	    int result=minimumDifference(arr, n, k);  
	    System.out.println("Number of the employees:"+k); 
	    int startingindex=findelement(result,arr,n,k);
	    System.out.println("Here the goodies that are selected for distribution are:");
	    for(int i=startingindex;i<startingindex+k;i++)
	    System.out.println(items[i]);
	    System.out.println("And the difference between the chosen goodie with highest price and the lowest price is:"+result);
	} 
   
	public static int minimumDifference(int arr[], int n, int k) 
	{
		int num= Integer.MAX_VALUE;
		Arrays.sort(arr);
		for (int j=0; j<=n-k;j++)
		num= Math.min(num,arr[j+ k- 1]-arr[j]);
		return num;		
	}
	 public static int findelement(int res,int arr[], int n, int k)
	{
		int num= Integer.MAX_VALUE;
		for(int j=0; j<=n; j++)
		{
			num= Math.min(num, arr[j+ k - 1] - arr[j]);
			if (res==num)
				{
				return j;
				}
					
		}
		return 0;
	}
		
}
