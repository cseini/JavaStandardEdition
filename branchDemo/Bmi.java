import java.util.Scanner;
public class Bmi{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Ű(cm) > ");
		double height = scan.nextDouble();
		System.out.print("������(kg) > ");
		double weight = scan.nextDouble();
		double bmi = (weight)/(height*height/10000);
		System.out.println("BMI���� : "+bmi);
		String result = "";
		if(bmi<18.5){
			result = "��ü��";
		} else if(18.5<=bmi&&bmi<23){
			result = "����";
		} else if(23<=bmi&&bmi<25){
			result = "�� ���ܰ�";
		} else if(25<=bmi&&bmi<30){
			result = "1�ܰ� ��";
		} else if(30<=bmi&&bmi<35){
			result = "2�ܰ� ��";
		} else{
			result = "3�ܰ� ��";
		}
		System.out.print(result);
	}
}