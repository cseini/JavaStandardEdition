import java.util.Scanner;
public class RPSGame2{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("A님 입력하세요. (가위,바위,보) : ");
		String usera = scan.next();
		System.out.print("B님 입력하세요. (가위,바위,보) : ");
		String userb = scan.next();
		String result = "B가 이김";
		if(usera.equals(userb)){
			result = "비김";
		} else if(
			(usera.equals("바위")&&userb.equals("가위"))||
			(usera.equals("가위")&&userb.equals("보"))||
			(usera.equals("보")&&userb.equals("바위"))
			){
			result = "A가 이김";
		}
		System.out.print(result);
	}
}