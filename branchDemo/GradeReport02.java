import java.util.Scanner;

public class GradeReport02{
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
		int avrdv = avr/10;
		switch(avrdv){
			case 9: grade = "A"; break;
			case 8: grade = "B"; break;
			case 7: grade = "C"; break;
			case 6: grade = "D"; break;
			case 5: grade = "E"; break;
			default :grade = "F"; break;
		}
		System.out.print(name+"[���] "+avr+" [����] "+grade);
	}
}