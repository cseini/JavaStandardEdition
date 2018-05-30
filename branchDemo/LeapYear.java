import java.util.Scanner;

public class LeapYear{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.print("0.종료 1.실행 > ");
			int flag = scan.nextInt();
			switch(flag){
				case 0: 
					System.out.println("종료합니다.");
				return;
				case 1:
					System.out.println("실행합니다.");
					System.out.print("연도를 입력하세요.");
					int year = scan.nextInt();
					String result = "평년";
					if(
						((year%4==0)&&!(year%100==0)) ||
						(year%400==0)){
						result = "윤년";
					}
					System.out.println(result);
				break;
				default: break;
			}
		}
	}
}