import java.util.Scanner;
public class MonthEndday{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.print("0.���� 1.���� > ");
				switch(scan.nextInt()){
					case 0 :
					System.out.println("�����մϴ�.");
					return;
					case 1 :
					System.out.println("�����մϴ�.");
					System.out.print("���Ͻô� ���� �Է����ּ���. >");
					int month = scan.nextInt();
					String result = "";
					int lastday = 0;
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