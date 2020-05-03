package linearSearch;

public class LinearSearchDemo {

	public static void main(String[] args) {
		int[] a = {12, 45, 4, 10, 87, 7, 2};
		int ans=  searchLinear(a, 4);
		System.out.println("The index at which 4 is: " + ans);
	}
	
	public static int searchLinear(int a[], int x)
	{
		int answer = -1;
		for (int i=0; i<a.length;i++) {
			if(a[i] == x)
			{
				answer = i;
				return answer;
			}
			else if(i == a.length-1)
			{
				return -1;
			}
			else
				continue;
		}
		return -1;
	}
}