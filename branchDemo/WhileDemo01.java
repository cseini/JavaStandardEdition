import java.util.Scanner;
public class WhileDemo01{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("ù��° ���� �Է� : > ");
		int num1 = scan.nextInt();
		System.out.print("�ι�° ���� �Է� : > ");
		int num2 = scan.nextInt();
		int sum = 0, min = num1, max = num2;
		if(num1>num2) {
			System.out.println("���� ġȯ�մϴ�.");
			min = num2;
			max = num1;
		}
		String opcode ="+", result = "";
		while(min<=max){
			if(min==max){
				opcode = "=";
			}
			result+=min+opcode;
			sum+=min;
			min++;
		}
		System.out.print(result+sum);
	}
}