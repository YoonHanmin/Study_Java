package question06;

import java.util.Scanner;

public class MutipleOfThree {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int arr[] = new int[10];
	System.out.print("양의 정수 10개를 입력하시오>>");
	
	for (int i = 0; i < arr.length; i++) {
		arr[i] = scan.nextInt();
		
	}
	
	System.out.print("3의배수는 ");
	for (int j = 0; j < arr.length; j++) {
		if(arr[j]%3==0) {
			System.out.print(arr[j]);
		}
	}
	
	
}
	
	
}
