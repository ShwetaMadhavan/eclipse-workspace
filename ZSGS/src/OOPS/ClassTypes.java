package OOPS;

public class ClassTypes {
	static int a=5;
	int b=2;
	public static void main(String[] args) {
		ClassTypes ct = new ClassTypes()/*
										 * { public void place(){ System.out.println("Anonymous class"); } }
										 */;
		ct.place();
		Chennai c = ct.new Chennai() /*
										 * { public void marina() { System.out.println("Anonymous"); } }
										 */;
		c.marina();
		ct.sculptures();
		
		  Madurai m=new Madurai();
		  
		  m.malls();
		 	
	    ClassTypes.Madurai.temple();

		
	}
	public void place(){
		System.out.println("This is chennai");
		Chennai c=new Chennai();
		//c.marina();
	}
	//Inner class
	class Chennai {
		public void marina() {
			System.out.println("This is Nested Class");
		}	
	}
	static class Madurai{
		void display()
		{
		System.out.println(a);
		//System.out.println(b);
		}
		
		
		public static void temple(){
			System.out.println("Temples in Madurai");
		}
		public void malls() {
			System.out.println("Malls");
		}
	}
	public void sculptures(){
		System.out.println("Sculptures in chennai");
		//local class
		class Beach{
			public void ecr() {
				System.out.println("There's one in ecr");
			}
		}
		Beach b=new Beach();
		b.ecr();
		
	}

}
