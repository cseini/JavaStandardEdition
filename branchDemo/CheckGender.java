import java.util.Scanner;
public class CheckGender{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.print("0.종료 1.실행 > ");
			switch(scan.nextInt()){
				case 0 :
					System.out.println("종료합니다.");
				return;
				case 1 : 
					System.out.println("실행합니다.");
					System.out.print("이름을 입력해주세요. >");
					String name = scan.next();
					System.out.print("주민등록번호 13자리를 입력해주세요.(ex: 121212-1234567) >");
					String idnum = scan.next();
					String gender = "";
					char ch = idnum.charAt(7);
					String result =  name+" : "+idnum+" : ";
					switch(ch){
						case '1': case '3': gender = "남"; break;
						case '2': case '4': gender = "여"; break;
						case '5': case '6': gender = "외국인"; break;
						default : result = "다시 입력하세요."; break;
					}
					System.out.println(result+gender);
				break;
				default : break;
			}
		}
	}
}