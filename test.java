1)Difference between checked and unchecked exception
checked exception                                                uncheckedException
1>exception checked during the compile time only                 1>not checked during the compile time.it is runtime exceptions.
ex:IoException                                                         ex:NullPointerException

2)try catch bloack is used to handel the exception try contains the code which might give the exception and catch block used tom handel the exception.
yes try bloack exist without the catch block instead of using try with the catch we can use finally block with the try block

public class Demo{
public static void main(String args[]){
try{
System.out.println("demo class is started");
System.out.println("demo class is going on");
}
finally{
System.out.println("demo class ended"):
}
}
}

3)


4)polymorphism is oops concept in which the object can perform the multiple task. for example human.
1)compiletime polymorphism     2)runtime polymorphism
example: method overloading      example:method Overriding   

5)Abstraction is a oops concept in which main implementation is hiding from the user and displaying only the required information or details to the user is known as abstraction.
abstraction can be achieved by using the keyword Abstract...
writing all the unimplemented methods into the interface by using the keyword abstract and implementing those methods into the class....

7)difference between the arraylist and linkedlist
ArrayLst                                                     LinkedList
it is better to stroing and accessing the data              it is better for data manipulation
it is act as a list                                         it wont
manipulation in arraylist is slow                           manipulation in linked list is faster

6)NOPE

8)significance of hashmap class in java 
hashmap stores the data in to the key value pairs
accessing the data is fast by using the hashmap
it also stores the null keys and values.

collision can be handel by using the separate chaining.when the load factor exceed it automatically resizes.

10)purpose of the stream api
>it is used filtering elements it remove the unwanted elements from the list
>converting data in to elements or sorting the data elements
>mapping the elements
>educing elements into single result
 




     