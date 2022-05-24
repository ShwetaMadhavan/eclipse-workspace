package Collections;

import java.util.ArrayList;

public class ArrayListOfArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<String>> list=new ArrayList<ArrayList<String>>(5);
		
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Ria");
		a1.add("Pia");
		list.add(a1);

		ArrayList<String> a2=new ArrayList<String>();
		a2.add("Tia");
		a2.add("Dia");
		list.add(a2);

		ArrayList<String> a3=new ArrayList<String>();
		a3.add("Priya");
		a3.add("Pia");
		list.add(a3);
		
		for(int i=0;i<list.size();i++) {
			for(int j=0;j<list.get(i).size();j++) {
				System.out.println(list.get(i).get(j));
			}
		}
		
		

	}

}
