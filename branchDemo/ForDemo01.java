import java.util.Scanner;

public class ForDemo01{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("0.���� 1.���� > ");
			switch(sc.nextInt()){
				case 0:
				System.out.println("�����մϴ�.");
				return;
				case 1:
				System.out.println("�����մϴ�.");
				System.out.print("ù��° ����");
				int num1 = sc.nextInt();
				System.out.print("�ι�° ����");
				int num2 = sc.nextInt();
				String result = "", opcode = "+";
				int sum = 0, tmp = 0;
				if(num1>num2){
					System.out.println("�� ġȯ");
					tmp = num1;
					num1 = num2;
					num2 = tmp;
				}
				for(int i=num1;i<=num2;i++){
					if(i==num2){
						opcode = "=";
					}
					result+=i+opcode;
					sum+=i;
				}
				System.out.println(result+sum);
				break;
				default:
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
				break;
			}
		}
	}

}