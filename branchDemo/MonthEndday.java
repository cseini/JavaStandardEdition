import java.util.Scanner;

public class MonthEndday{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.print("0.���� 1.���� > ");
			int flag = scan.nextInt();
				switch(flag){
					case 0 :
					System.out.print("�����մϴ�.");
					return;
					case 1 :
					System.out.print("�����մϴ�.");
					System.out.print("���Ͻô� ���� �Է����ּ���. >");
					int month = scan.nextInt();
					String result = "";
					int lastday = 0;
					/*
					if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
						lastday = 31;
					} else if(month==4||month==6||month==9||month==11){
						lastday = 30;
					} else if(month==2){
						lastday = 28;
					}
					*/
					switch(month){
						case 2: lastday = 28; break;
						case 4: case 6: case 9: case 11 : lastday =  30; break;
						default : lastday = 31; break;
					}
					System.out.println("������ "+month+"�� "+lastday+"�Դϴ�.");
					break;
					default: break;
			}
		}
	}
}