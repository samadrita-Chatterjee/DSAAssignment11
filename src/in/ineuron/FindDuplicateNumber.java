package in.ineuron;


import java.util.*;

public class FindDuplicateNumber {
static ArrayList<Integer> duplicates(int arr[], int n)
{

	
	for (int i = 0; i < n; i++) {
	arr[i] += 1;
	}

	
	ArrayList<Integer> res = new ArrayList<>();

	
	int count = 0;

	for (int i = 0; i < n; i++) {

	
	int index = Math.abs(arr[i]) > n
		? Math.abs(arr[i]) / (n + 1)
		: Math.abs(arr[i]);

	
	if (index == n) {
		count++;
		continue;
	}

	
	int val = arr[index];

	
	if (val < 0) {
		res.add(index - 1);
		arr[index] = Math.abs(arr[index]) * (n + 1);
	}
	else if (val > n)
		continue;
	else
		arr[index] = -arr[index];
	}

	
	if (count > 1)
	res.add(n - 1);

	if (res.size() == 0)
	res.add(-1);
	else
	Collections.sort(res);

	return res;
}


public static void main(String[] args)
{
	int numRay[] = { 0, 4, 3, 2, 7, 8, 2, 3, 1 };
	int n = numRay.length;
	ArrayList<Integer> ans = duplicates(numRay, n);
	for (Integer i : ans) {
	System.out.println(i);
	}
}
}

