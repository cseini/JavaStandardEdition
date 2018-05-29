import java.util.Scanner;

public class MonthEndday{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("원하시는 월을 입력해주세요.");
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
			case 4: lastday =  30; break;
			case 6: lastday =  30; break;
			case 9: lastday =  30; break;
			case 11: lastday =  30; break;
			default : lastday = 31; break;
		}
		System.out.print("말일이 "+month+"월 "+lastday+"입니다.");
	}
}