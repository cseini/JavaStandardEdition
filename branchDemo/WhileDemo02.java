import java.util.Scanner;
public class WhileDemo02{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 숫자 입력 : > ");
		int num1 = scan.nextInt();
		System.out.print("두번째 숫자 입력 : > ");
		int num2 = scan.nextInt();
		int sum = 0, tmp = 0;
		if(num1>num2) {
			System.out.println("값을 치환합니다.");
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
		System.out.print(result+sum);
	}
}