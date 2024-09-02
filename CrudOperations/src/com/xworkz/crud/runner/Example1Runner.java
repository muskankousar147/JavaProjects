package com.xworkz.crud.runner;

import com.xworkz.crud.services.Example1;

public class Example1Runner {

	public static void main(String[] args) {
			Example1 example1=new Example1();

			example1.getArrayLength();

			System.out.println("=============save operation===========");

			String name=example1.save("cotton");
			System.out.println(name);
//			String name1=example1.save("thin");
//			System.out.println(name1);
//			String name2=example1.save("ullan");
//			System.out.println(name2);
//			String name3=example1.save("normal");
//			System.out.println(name3);

			System.out.println("=============read operation===========");
			String name4=example1.read();
			System.out.println(name4);

			System.out.println("=============update operation===========");

			String name5=example1.update("cotton","polyester");
			example1.read();
			System.out.println(name5);

			System.out.println("=============delete operation===========");
			String name6=example1.delete("thin");
			example1.read();
			System.out.println(name6);

			System.out.println("=============search operation===========");
			String name7=example1.search("thin");
			example1.read();
			System.out.println(name7);

			}
			

	}


