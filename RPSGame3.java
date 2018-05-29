import java.util.Scanner;
public class RPSGame3{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("A님 입력하세요. (가위=1,바위=2,보=3) : ");
		int usera = scan.nextInt();
		System.out.print("B님 입력하세요. (가위=1,바위=2,보=3) : ");
		int userb = scan.nextInt();
		int amb = usera-userb;
		String result = "A가 이김";

		if(amb==0){
			result = "비김";
		}else if(amb==-1||amb==2){
			result = "B가 이김";
		}
		System.out.print(result);
	}
}