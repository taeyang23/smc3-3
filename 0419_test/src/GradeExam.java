import java.util.Scanner;

public class GradeExam {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("����, ����, ���� ������ 3���� ���� �Է�>>");
Grade me = new Grade();
me.math = scanner.nextInt();
me.science = scanner.nextInt();
me.english = scanner.nextInt();
System.out.println("�����"+ me.average());

}

}
class Grade{
int math;
int science;
int english;
public int average() {
return (math+science+english)/3;
}
}