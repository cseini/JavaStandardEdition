import java.util.Scanner;

public class LeapYear{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.print("0.���� 1.���� > ");
			int flag = scan.nextInt();
			switch(flag){
				case 0: 
					System.out.println("�����մϴ�.");
				return;
				case 1:
					System.out.println("�����մϴ�.");
					System.out.print("������ �Է��ϼ���.");
					int year = scan.nextInt();
					String result = "���";
					if(
						((year%4==0)&&!(year%100==0)) ||
						(year%400==0)){
						result = "����";
					}
					System.out.println(result);
				break;
				default: break;
			}
		}
	}
}