package OOPS;

interface J{
	public void run();
}
interface I{
	public void run();
}


class A implements I,J{
	public void run() {
		System.out.println("Running..");
	}
}

public class Demo extends A  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	A a=new A();
	a.run();

	}

}
