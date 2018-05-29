import java.util.Scanner;

public class RPSGame{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("A님 입력하세요. (가위,바위,보) : ");
		String usera = scan.next();
		System.out.print("B님 입력하세요. (가위,바위,보) : ");
		String userb = scan.next();

		if(usera.equals("바위")){
			if(userb.equals("바위")){
				System.out.print("비김");	
			} else if(userb.equals("가위")){
				System.out.print("A가 이김");
			} else {
				System.out.print("B가 이김");
			}
		} else if(usera.equals("가위")){
			if(userb.equals("바위")){
				System.out.print("B가 이김");
			} else if(userb.equals("가위")){
				System.out.print("비김");
			} else {
				System.out.print("A가 이김");
			}
		} else {
			if(userb.equals("바위")){
				System.out.print("A가 이김");
			} else if(userb.equals("가위")){
				System.out.print("B가 이김");
			} else{
				System.out.print("비김");
			}
		}
	}
}