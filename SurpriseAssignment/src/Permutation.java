
import java.util.Scanner;

public class Permutation {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the four numbers");
		Integer a[]=new Integer[4];
		for(int i=0;i<4;i++) {
			a[i]=sc.nextInt();
		}
		int temp[]=new int[4];
		//Arrays.sort(a,Collections.reverseOrder());
		System.out.println("Enter the key");
		int k=sc.nextInt();
		String[] operators= {"(","+","-","*","/",")"};
		
		String s="";
		String p="";
		for(int i=0;i<4;i++) {
			s+=a[i];
		}
		System.out.println(s);
		
		permute(s,p,k);
	}

	private static void permute(String s, String p,int k) {
		// TODO Auto-generated method stub
		if(s.length()==0) {
			System.out.println(p);
			check(p,k);
			//return;
		}
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			String ls=s.substring(0,i);
			String rs=s.substring(i+1);
			String rest=ls+rs;
			permute(rest,p+ch,k);
		}
		
	}
	

	private static void check(String p,int k) {
		// TODO Auto-generated method stub
		String[] operators= {"+","-","*","/"};
		for(int i=0;i<operators.length;i++) {
			String ans="";
			for(int j=0;j<p.length();j++) {
				ans+=p.charAt(j)+operators[i];
				
			}
			String temoCheck=ans.substring(0,ans.length()-1);
			System.out.println(temoCheck);
			int checkkey=Integer.valueOf(temoCheck);
			System.out.println(checkkey);
			if(checkkey==k) {
				System.out.println("found");
				System.out.println(ans.substring(0,ans.length()-1));
			}
			
		}

	}

}
