package OOPS;

interface I{
	public void run();
	public void print();
	public void play();
	
	default void show() {
		System.out.println("Show I");
	}
	
	static void dance() {
		System.out.println("Dance I");
	}
}

interface J extends I{
	public void run();
	public void print();
}

class B {
	public void play() {
		System.out.println("Play B");
	}
	/*
	 * public void show() { System.out.println("Show B"); }
	 */
}

class A extends B implements I{
	public void run() {
		System.out.println("run");
	}
	public void print() {
		System.out.println("print");
	}
	public void play() {
		System.out.println("play I");
	}
}

public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A an=new A();
		/*
		 * I i=new I(){ public void run() { System.out.println("run interface"); }
		 * public void print() { System.out.println("print interface"); }
		 * 
		 * @Override public void play() { // TODO Auto-generated method stub
		 * 
		 * } };
		 */
		an.run();
		an.play();
		an.show();
		//i.run();
		I.dance();
		

	}

}
