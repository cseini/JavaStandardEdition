import java.util.Scanner;
public class InfiniteLoop{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
		while (true){
			System.out.print("0.종료 1.실행 > ");
			switch(scan.nextInt()){
				case 0: 
					System.out.println("종료합니다.");
					return;
				case 1: 
					System.out.println("주문하세요.");
					break;
				default : break;
			}
		}
	}
}
