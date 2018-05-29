import java.util.Scanner;
public class Calc03{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number 1 > ");
		int num1 = scan.nextInt();
		System.out.print("Enter OPCODE(+, -, *, /, %) > ");
		String opcode = scan.next();
		System.out.print("Enter Number 2 > ");
		int num2 = scan.nextInt();
		int result = 0;
		String str = "";
		switch(opcode){
			case "+":result = num1 + num2; break;
			case "-":result = num1 - num2; break;
			case "*":result = num1 * num2; break;
			case "/":result = num1 / num2; break;
			case "%":result = num1 % num2; break;
			default :str="Invalid OPCODE"; break;
		}
		if(str.equals("")){
			str = num1 + " " + opcode + " " + num2 + " = " + result;
		}
		System.out.println(str);
	}
}