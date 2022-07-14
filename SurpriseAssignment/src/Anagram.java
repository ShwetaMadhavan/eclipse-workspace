import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first string : ");
		String a=sc.next();
		System.out.println("Enter the second string : ");
		String b=sc.next();
		int c=0;
		char[] s1=a.toCharArray();
		char[] s2=b.toCharArray();
		Arrays.sort(s1);
		Arrays.sort(s2);
		for(int i=0;i<s1.length;i++) {
			if(s1[i]==s2[i]) {
				c++;
			}
		}
		if(c==s1.length) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}
		
		

	}

}
