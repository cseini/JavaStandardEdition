import java.util.Scanner;

public class LeapYear{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���.");
		int year = scan.nextInt();
		String result = "���";
		if(((year%4==0)&&!(year%100==0))||(year%400==0)){
			result = "����";
		}
		System.out.print(result);
	}
}