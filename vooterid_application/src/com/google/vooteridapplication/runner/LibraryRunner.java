package com.google.vooteridapplication.runner;
import com.google.vooteridapplication.things.Library;
public class LibraryRunner {

	public static void main(String[] args) {
		
		Library library = new Library();
			System.out.println(library);

			Library library1 = new Library(23451);
			System.out.println(library1);

			Library library2 = new Library(23451, "general");
			System.out.println(library2);

			Library library3 = new Library(23451, "general", "bangalore");
			System.out.println(library3);

	}

}
