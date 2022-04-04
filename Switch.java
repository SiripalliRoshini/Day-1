package Example;
import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner s=new Scanner(System.in);
		   int a=s.nextInt();
		
			  switch(a) {
			  case 1:
			   System.out.println("good");
			   break;
			  case 2:
			   System.out.println("better");
			   break;
			  case 3:
			   System.out.println("best");
			   break;
			  default:
			   System.out.println("invalid");
			   break;
			  }
	}
}
