
/*
 *
 *  Author : Udit Jain
	College : Maharaja Agrasen Institute Of Technology Rohini
	Year/Department : 2nd year - Computer Science And Engineering
	E-Mail Id : jain30udit@gmail.com

*/

import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(mn(arr, n));

	}

	public static int mn(int[] arr, int n) {
		int sum = 0;
		int act_sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		for (int i = 0; i < n; i++) {
			act_sum += i;
		}
		int ans = act_sum - sum;
		return ans;
	}

}
