import java.util.Scanner;
public class WhileDemo01{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 숫자 입력 : > ");
		int num1 = scan.nextInt();
		System.out.print("두번째 숫자 입력 : > ");
		int num2 = scan.nextInt();
		int sum = 0, min = num1, max = num2;
		if(num1>num2) {
			System.out.println("값을 치환합니다.");
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