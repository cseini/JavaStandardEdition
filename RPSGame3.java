import java.util.Scanner;
public class RPSGame3{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("A�� �Է��ϼ���. (����=1,����=2,��=3) : ");
		int usera = scan.nextInt();
		System.out.print("B�� �Է��ϼ���. (����=1,����=2,��=3) : ");
		int userb = scan.nextInt();
		int amb = usera-userb;
		String result = "A�� �̱�";

		if(amb==0){
			result = "���";
		}else if(amb==-1||amb==2){
			result = "B�� �̱�";
		}
		System.out.print(result);
	}
}