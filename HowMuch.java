import java.util.Scanner;

public class HowMuch{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("�󸶿���? ");
		int price = scan.nextInt();
		System.out.println(">>" +price+"�� �Դϴ�.");
		System.out.print("� �帱���? ");
		int many = scan.nextInt();
		System.out.println(many+"�� �ּ���.");
		int tprice = price * many;
		System.out.println("�� �ݾ��� " +tprice+ "�� �Դϴ�.");
		System.out.println("��ο�. ����ּ���.");
		System.out.print("�� �ۼ�Ʈ DC �ұ��? ");
		int dc = scan.nextInt();
		String str = (dc<10) ? tprice-tprice*dc/100+"�� �Դϴ�." : "���Ⱦƿ�.";
		System.out.println(str);
		/*
		String str = "���Ⱦƿ�";
		if(dc<10){
			str = tprice-tprice*dc/100+"�� �Դϴ�.";
		}
		System.out.println(str);
		*/
		
	}
}