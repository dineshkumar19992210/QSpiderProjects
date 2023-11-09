import java.util.Scanner;

public class input {
	
	public static void main(String []args) {
		
		Scanner scanner=new Scanner(System.in);
				System.out.println("what is your name");//
		
		String name = scanner.nextLine();
		System.out.println("hello" +name);//
		
		System.out.println("what is your number");
		
		int num=scanner.nextInt();
		System.out.println("my num"+num);
		
	}

}
