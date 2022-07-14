import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string : ");
		String a = sc.next();
		System.out.println("Enter the second string : ");
		String b = sc.next();
		int c = 0;
		if (a.length() != b.length()) {
			System.out.println("Not anagram");
		} else {
			char[] s1 = a.toCharArray();
			char[] s2 = b.toCharArray();
			sortArray(s1);
			sortArray(s2);
			//Arrays.sort(s1);
			//Arrays.sort(s2);
			for (int i = 0; i < s1.length; i++) {
				if (s1[i] == s2[i]) {
					c++;
				}
			}
			if (c == s1.length) {
				System.out.println("Anagram");
			} else {
				System.out.println("Not Anagram");
			}
		}

	}

	private static void sortArray(char[] s1) {
		// TODO Auto-generated method stub
		for(int i=0;i<s1.length-1;i++) {
			for(int j=i+1;j<s1.length;j++) {
				if(s1[i]>s1[j]) {
				char temp=s1[i];
				s1[i]=s1[j];
				s1[j]=temp;
				}
			}
		}
	}
	
	

}
