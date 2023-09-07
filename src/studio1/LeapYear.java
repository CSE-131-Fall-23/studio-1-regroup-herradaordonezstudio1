package studio1;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Value for x?");
		int x = in.nextInt();
		int four = x%4;
		int hundred = x%100;
		int fourhundred = x%400;
		boolean leap = (four==0 && hundred!=0 || fourhundred==0);
		System.out.println(leap);

	}

}
