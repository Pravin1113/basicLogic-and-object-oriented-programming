import java.util.*;
public class a46 {

	

		static int findSum(int arr[], int n)
		{
		// sort all elements of array
		Arrays.sort(arr);
		System.out.println("Sum of Distinct numbers are:");
		int sum = 0;
		for (int i = 0; i < n-1; i++)
		
		
		{
		sum = sum + arr[i];
		
		}
		return sum;
		}
		public static void main(String[] args)
		{
		int arr[] = {8,  9};
		int n = arr.length;
		System.out.println(findSum(arr, n));
		}
		}