
import java.util.Scanner;

public class FourteGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the four numbers");
		Integer a[] = new Integer[4];
		for (int i = 0; i < 4; i++) {
			a[i] = sc.nextInt();
		}
		// int temp[]=new int[4];
		System.out.println("Enter the key");
		int k = sc.nextInt();
		int flag = 0;
		int ans = 0;
		int selectedNoCount=0;
		String selectedOperator="";
		while (flag==0 && selectedNoCount<=4) {
			
			++selectedNoCount;

			System.out.println("Select the numbers");
			int selectedNo = sc.nextInt();
		//	if(selectedNoCount<=3) {
			System.out.println("Select the operators");
			selectedOperator = sc.next();
		//	}
			
			

			if (selectedOperator.equals("+")) {
				ans += selectedNo;
				System.out.println(ans);
			} else if (selectedOperator.equals("-")) {
				ans -= selectedNo;
				System.out.println(ans);
			} else if (selectedOperator.equals("*")) {
				ans *= selectedNo;
			} else if (selectedOperator.equals("/")) {
				ans /= selectedNo;
			}
		
		
		if(ans==k && selectedNoCount==4) {
			System.out.println("Found");
			flag=1;
		}
		if(selectedNoCount==4 && flag==0) {
			System.out.println(ans);
			System.out.println("Wrong combination.. Try again");
			break;
		}
		}

	}

}
