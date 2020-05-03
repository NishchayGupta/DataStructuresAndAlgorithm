package binarySearch;

public class BinarySearch {

	public static void main(String[] args) {

		int arr[] = {3, 5, 7, 9, 29, 56, 69, 78, 89, 90, 92, 101};
		int ans = searchBinary(92, arr);
		System.out.println("The index of number 92 is: " + ans);
	}

	public static int searchBinary(int x, int[] arr)
	{
		int p = 0, r = arr.length-1; 
		int q;
		while(p<=r)
		{
			q = (p+r) / 2;
			if(arr[q] == x)
				return q;
			if(arr[q] > x)
				r = q-1;
			else
				p = q+1;
		}
		return -1;
	}
}