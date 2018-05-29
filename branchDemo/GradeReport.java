import java.util.Scanner;

public class GradeReport{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("�̸� ?\n");
		String name = scan.next();
		String err = "���������� �峭ġ�� ������.";
		System.out.print("��������?\n");
		int kor = scan.nextInt();
		if(0>kor||kor>100){
			System.out.print(err);
			return;
		}
		System.out.print("��������?\n");
		int eng = scan.nextInt();
		if(0>eng||eng>100){
			System.out.print(err);
			return;
		}
		System.out.print("��������?\n");
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
		System.out.print(name+"[���] "+avr+" [����] "+grade);
	}
}