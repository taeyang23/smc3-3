import java.util.Scanner;
public class Array {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[5];
		int max = 0;  // 최대값 저장
		int j = 0;    // ~번째
		
		for(int i=0; i<arr.length; i++) {   // 배열에 입력
			System.out.println((i+1)+"번 입력:");
			arr[i] = scan.nextInt();
		}
		for(int i=0; i<arr.length; i++) {    // 값 비교
			if(max < arr[i]) {
				max = arr[i];
				j = i+1;
			}
		}
		System.out.println("가장 큰 수는 " + j + "번째 숫자인 " + max);
	}
}
