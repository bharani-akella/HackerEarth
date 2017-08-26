import java.util.Scanner;
public class ToggleChanger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String name=s.next();
for(int i=0;i<name.length();i++){
	if((int)name.charAt(i)>=97 && (int)name.charAt(i)<=122){
		System.out.print((char)((int)name.charAt(i)-32));
	}else if((int)name.charAt(i)>=65 && (int)name.charAt(i)<=90){
		System.out.print((char)((int)name.charAt(i)+32));
	}
}


	}

}
