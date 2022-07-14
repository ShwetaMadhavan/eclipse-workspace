
public class FibonacciPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1,c=0;
		int n=0;
		//System.out.println(a);
		//System.out.println(b);
		while(n<10) {
			int count=0;
			c=a+b;
			a=b;
			b=c;
			for(int i=1;i<=c;i++) {
				if(c%i==0) {
				count++;
				}
			}
			if(count==2) {
				n++;
				System.out.println(c);
			}
		}
		

	}

}
