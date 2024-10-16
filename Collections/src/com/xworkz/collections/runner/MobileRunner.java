package com.xworkz.collections.runner;

import java.util.LinkedList;

public class MobileRunner {

	public static void main(String[] args) {
		LinkedList<String> linkedlist = new LinkedList<String>();
		System.out.println("linked list");
		linkedlist.add("vivo");
		linkedlist.add(1,"realme");
		System.out.println("result:" +linkedlist.add("realme"));
		
		linkedlist.addFirst("result1 add first:iphone");
//		System.out.println("result 1:" +linkedlist.addFirst(null));
		
		linkedlist.addLast("result2 add last:redmi");
		
		
		
		System.out.println("clear method starts");
		linkedlist.clear();
		
		linkedlist.contains(linkedlist);
		System.out.println("result3: " +linkedlist.contains(linkedlist));
		
		linkedlist.offerFirst("vivo");
		System.out.println("result4:" +linkedlist.offerFirst(null));
		
		linkedlist.offerLast("redmi");
		System.out.println("reslut5:" +linkedlist.offerLast(null));
		
		linkedlist.element();
		System.out.println("result6:" +linkedlist.element());
		
		
		linkedlist.lastIndexOf(linkedlist);
		System.out.println("result7:" +linkedlist.lastIndexOf(linkedlist));
		
		linkedlist.offer("vivo");
		System.out.println("result8:" +linkedlist.offer(null));
		
		
		linkedlist.peek();
		System.out.println("result9:" +linkedlist.peek());
		
		
		//linkedlist.peekFirst("realme");
		//linkedlist.peekLast();
		linkedlist.poll();
		System.out.println("result10: "+linkedlist.poll());
		
		linkedlist.pollFirst();
		System.out.println("reslut11:" +linkedlist.pollFirst());
		
		linkedlist.pollLast();
		System.out.println("reslut12:" +linkedlist.pollLast());
		
		linkedlist.pop();
		System.out.println("reslut13:" +linkedlist.pop());
		
		//for each using 2nd method
		linkedlist.forEach(s -> System.out.println(s));
		
		linkedlist.toArray();
		System.out.println("reslut14:" +linkedlist.toArray());
		
		linkedlist.removeFirst();
		System.out.println("reslut15:" +linkedlist.removeFirst());
		
		linkedlist.removeLast();
		System.out.println("reslut16:" +linkedlist.removeLast());
		
		linkedlist.remove(linkedlist);
		System.out.println("reslut17:" +linkedlist.remove());
		
		linkedlist.remove(1);
		System.out.println("reslut18:" +linkedlist.remove());
		
		linkedlist.removeFirstOccurrence(linkedlist);
		System.out.println("reslut19:" +linkedlist.removeFirstOccurrence(linkedlist));
	}
}
