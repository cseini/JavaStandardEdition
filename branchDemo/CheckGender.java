import java.util.Scanner;
public class CheckGender{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.print("0.���� 1.���� > ");
			int flag = scan.nextInt();
			switch(flag){
				case 0 :
					System.out.println("�����մϴ�.");
				return;
				case 1 : 
					System.out.println("�����մϴ�.");
					System.out.print("�̸��� �Է����ּ���. >");
					String name = scan.next();
					System.out.print("�ֹε�Ϲ�ȣ 13�ڸ��� �Է����ּ���.(ex: 121212-1234567) >");
					String idnum = scan.next();
					String gender = "";
					char ch = idnum.charAt(7);
					String result =  name+" : "+idnum+" : ";
					/*
					if(ch=='0'||ch=='7'||ch=='8'||ch=='9'){
						result = "�ٽ� �Է��ϼ���.";
					} else if(ch=='1'||ch=='3'){
						gender = "��";
					} else if(ch=='2'||ch=='4'){
						gender = "��";
					} else if(ch=='5'||ch=='6'){
						gender = "�ܱ���";
					}
					*/
					switch(ch){
						case '1': case '3': gender = "��"; break;
						case '2': case '4': gender = "��"; break;
						case '5': case '6': gender = "�ܱ���"; break;
						default : result = "�ٽ� �Է��ϼ���."; break;
					}
					System.out.println(result+gender);
				break;
				default : break;
			}
		}
	}
}