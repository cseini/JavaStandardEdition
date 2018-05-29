import java.util.Scanner;

public class GradeReport{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 ?\n");
		String name = scan.next();
		String err = "학점가지고 장난치지 마세요.";
		System.out.print("국어점수?\n");
		int kor = scan.nextInt();
		if(0>kor||kor>100){
			System.out.print(err);
			return;
		}
		System.out.print("영어점수?\n");
		int eng = scan.nextInt();
		if(0>eng||eng>100){
			System.out.print(err);
			return;
		}
		System.out.print("수학점수?\n");
		int math = scan.nextInt();
		if(0>math||math>100){
			System.out.print(err);
			return;
		}
		int avr = (kor+eng+math)/3;
		String grade = "";
		if(avr>=90){
			grade = "A";
		} else if(avr>=80){
			grade = "B";
		} else if(avr>=70){
			grade = "C";
		} else if(avr>=60){
			grade = "D";
		} else if(avr>=50){
			grade = "E";
		} else{
			grade = "F";
		}
		System.out.print(name+"[평균] "+avr+" [학점] "+grade);
	}
}