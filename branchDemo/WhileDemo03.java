import java.util.Scanner;
public class WhileDemo03{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(start.equals("y")){
			System.out.print("ù��° ���� �Է� : > ");
			int num1 = scan.nextInt();
			System.out.print("�ι�° ���� �Է� : > ");
			int num2 = scan.nextInt();
			int sum = 0, tmp = 0;
			if(num1>num2) {
				System.out.println("���� ġȯ�մϴ�.");
				tmp = num1;
				num1 = num2;
				num2 = tmp;
			}
			String opcode ="+", result = "";
			while(num1<=num2){
				if(num1==num2){
					opcode = "=";
				}
				result+=num1+opcode;
				sum+=num1;
				num1++;
			}
			System.out.println(result+sum);
		}
	}
}