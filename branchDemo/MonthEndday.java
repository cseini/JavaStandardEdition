import java.util.Scanner;

public class MonthEndday{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.print("0.종료 1.실행 > ");
			int flag = scan.nextInt();
				switch(flag){
					case 0 :
					System.out.print("종료합니다.");
					return;
					case 1 :
					System.out.print("실행합니다.");
					System.out.print("원하시는 월을 입력해주세요. >");
					int month = scan.nextInt();
					String result = "";
					int lastday = 0;
					/*
					if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
						lastday = 31;
					} else if(month==4||month==6||month==9||month==11){
						lastday = 30;
					} else if(month==2){
						lastday = 28;
					}
					*/
					switch(month){
						case 2: lastday = 28; break;
						case 4: case 6: case 9: case 11 : lastday =  30; break;
						default : lastday = 31; break;
					}
					System.out.println("말일이 "+month+"월 "+lastday+"입니다.");
					break;
					default: break;
			}
		}
	}
}