package OOPS;

public class AbDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iphone obj=new Iphone();
		Samsung obj1=new Samsung();
		show(obj);
		show(obj1);
		
		

	}
	
	public static void show(Phone obj) {
		obj.showConfig();
	}
	/*
	 * public static void show(Iphone obj) { obj.showConfig(); } public static void
	 * show(Samsung obj) { obj.showConfig(); }
	 */

}

abstract class Phone{
	
	
	
	
	
	public abstract void showConfig();
}

 class Iphone extends Phone{
	public void showConfig() {
		System.out.println("Iphone..");
	}
}

 class Samsung extends Phone{
	public void showConfig() {
		System.out.println("Samsung...");
	}
}
