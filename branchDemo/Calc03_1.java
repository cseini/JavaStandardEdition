import java.util.Scanner;
public class Calc03_1{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 숫자 입력 : ");
		int num1 = scan.nextInt();
		System.out.print("연산자 입력 : ");
		String opcode = scan.next();
		System.out.print("두번째 숫자 입력 : ");
		int num2 = scan.nextInt();
		int result = 0;
		/*
		if(opcode.equals("+")){
			result = num1 + num2;
		} else if(opcode.equals("-")){
			result = num1 - num2;
		} else if(opcode.equals("*")){
			result = num1 * num2;
		} else if(opcode.equals("/")){
			result = num1 / num2;
		} else if(opcode.equals("%")){
			result = num1 % num2;
		} else{
			System.out.println("연산자 입력 에러");
		}
		*/

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
