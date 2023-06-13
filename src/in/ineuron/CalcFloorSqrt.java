package in.ineuron;


public class CalcFloorSqrt {
	public static int floorSqrt(int x)
	{
		
		if (x == 0 || x == 1)
			return x;

		long start = 1, end = x / 2, ans = 0;
		while (start <= end) {
			long mid = (start + end) / 2;

			
			if (mid * mid == x)
				return (int)mid;

			
			if (mid * mid < x) {
				start = mid + 1;
				ans = mid;
			}
			else 
				end = mid - 1;
		}
		return (int)ans;
	}

	
	public static void main(String args[])
	{
		int x = 11;
		System.out.println(floorSqrt(x));
	}
}


