package com.xworkz.collections.runner;

import java.util.ArrayList;

public class MobilePhoneRunner {

	public static void main(String[] args) {
		ArrayList<String> arraylist = new ArrayList<String>();
		System.out.println("array list");
		arraylist.add("apple");
		arraylist.add("samsung");
		arraylist.add("oppo");
		arraylist.add(2, "android");
		System.out.println("result:" +arraylist.add("apple"));

		arraylist.clone();
		System.out.println("result2:" +arraylist.clone());
		
		
		arraylist.contains(arraylist);
		System.out.println("result3:" +arraylist.contains(arraylist));
		
		arraylist.containsAll(arraylist);
		System.out.println("result4:" +arraylist.containsAll(arraylist));
		
		arraylist.ensureCapacity(1);
		//System.out.println("result5:" +arraylist.ensureCapacity(1));
		
		arraylist.get(0);
		System.out.println("result6:" +arraylist.get(0));
		
		
		arraylist.hashCode();
		System.out.println("result7:" +arraylist.hashCode());
		
		
		arraylist.set(1, "vivo");
		System.out.println("result8:" +arraylist.set(1, "vivo"));
		
//		arraylist.iterator();
//		System.out.println("result9:" +arraylist.iterator());
		
//		arraylist.listIterator(2);
//		System.out.println("result10:" +arraylist.listIterator());
//		
		arraylist.remove(0);
		System.out.println("result11:" +arraylist.remove(0));
		
		arraylist.remove(arraylist);
		System.out.println("result 12:" +arraylist.remove(arraylist));
		
		arraylist.clear();
		//System.out.println("result 13:" +arraylist.clear());
		
		arraylist.clone();
		System.out.println("result 14:" +arraylist.clone());
		
		
		arraylist.trimToSize();
		//System.out.println("result 15:" +arraylist.trimToSize());
		
		arraylist.size();
		System.out.println("result 16:" +arraylist.size());
		
	}

}
