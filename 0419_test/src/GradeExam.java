import java.util.Scanner;

public class GradeExam {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("수학, 과학, 영어 순으로 3개의 점수 입력>>");
Grade me = new Grade();
me.math = scanner.nextInt();
me.science = scanner.nextInt();
me.english = scanner.nextInt();
System.out.println("평균은"+ me.average());

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