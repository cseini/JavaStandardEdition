import java.util.Scanner;
public class Calc03_1{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("ù��° ���� �Է� : ");
		int num1 = scan.nextInt();
		System.out.print("������ �Է� : ");
		String opcode = scan.next();
		System.out.print("�ι�° ���� �Է� : ");
		int num2 = scan.nextInt();
		int result = 0;
		switch(opcode){
		case "+":
			result = num1 + num2;
		break;
		case "-":
			result = num1 - num2;
		break;
		case "*":
			result = num1 * num2;
		break;
		case "/":
			result = num1 / num2;
		break;
		case "%":
			result = num1 % num2;
		break;
		}
		System.out.println(num1+" "+opcode+" "+num2+" = "+result);
	}
}