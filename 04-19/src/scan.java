import java.util.Scanner;

public class scan {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("1000 이하의 자연수를 입력하세요.");
int num = sc.nextInt();
int sum = 0;

for(int i=1; i<=num; i++) {
if(i%4==0) {
sum += i;
System.out.println(i);
}
}
System.out.println("1부터 " + num + "까지 4의 배수의 합은 " + sum + "입니다.");
}

}
