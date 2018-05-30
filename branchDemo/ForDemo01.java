import java.util.Scanner;

public class ForDemo01{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("0.종료 1.실행 > ");
			switch(sc.nextInt()){
				case 0:
				System.out.println("종료합니다.");
				return;
				case 1:
				System.out.println("실행합니다.");
				System.out.print("첫번째 숫자");
				int num1 = sc.nextInt();
				System.out.print("두번째 숫자");
				int num2 = sc.nextInt();
				String result = "", opcode = "+";
				int sum = 0, tmp = 0;
				if(num1>num2){
					System.out.println("값 치환");
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
				System.out.println("잘못입력하셨습니다.");
				break;
			}
		}
	}

}