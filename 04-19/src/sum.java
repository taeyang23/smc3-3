	
	import java.util.Scanner;

	public class sum {
	static int sum;
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("���� ����: ");
	int a = sc.nextInt();
	System.out.print("������ ����: ");
	int b = sc.nextInt();
	sc.close();

	for(int i=a; i<=b; i++) {
	sum += i;
	}

	System.out.println(a + "���� " + b + "������ ���� " + sum);
	}

	} 

