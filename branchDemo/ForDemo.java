import java.util.Scanner;

public class ForDemo{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.print("0.���� 1.���� >");
			switch(scan.nextInt()){
				case 0:
				System.out.println("�����մϴ�.");
				return;
				case 1:
				System.out.println("�����մϴ�.");
				System.out.print("ù��° ���ڸ� �Է� > ");
				int num1 = scan.nextInt();
				System.out.print("�ι�° ���ڸ� �Է� > ");
				int num2 = scan.nextInt();
				String result = "", opcode = "+";
				int sum = 0, tmp = 0;
				if(num1>num2){
					System.out.println("���� ġȯ�մϴ�.");
					tmp = num1;
					num1 = num2;
					num2 = tmp;
				}
				for(int i=num1;i<=num2;i++){
					if(i==10){
						opcode = "=";
					}
					result += i+opcode;
					sum+=i;
				}
				System.out.println(result+sum);
				break;
				default :System.out.println("ERROR");break;
			}
		}
	}
}