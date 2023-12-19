package collection;

import java.util.HashSet;

public class ExHashset {

	public static void main(String[] args) {
		
		HashSet<Integer>  hs = new HashSet<>();
		hs.add(5);
		hs.add(2);
		hs.add(3);
		hs.add(2);
		hs.add(1);
		System.out.println("Hashset :"+ hs.hashCode());
		
		HashSet<Integer> number = new HashSet<>();
		number.add(6);
		number.add(3);
		number.add(1);
		System.out.println("Hashset :"+ number);
		
//		Union of Two set
		number.addAll(hs);
		System.out.println("Union is :"+ number);
//		Insertion
		number.retainAll(hs);
		System.out.println("INSERTION IS :"+ number);
		number.removeAll(hs);
		System.out.println("Diffrence : " + number);
		
		}

}
//HashSet<Integer> even = new HashSet<>();
//even.add(null);
//even.add(2);
//even.add(4);
//even.add(2);
//even.add(8);
//even.add(null);
//System.out.println("HashSet1: " + even);
//
//HashSet<Integer> numbers = new HashSet<>();
//numbers.add(1);
//numbers.add(3);
//numbers.add(2);
//System.out.println("HashSet2: " + numbers);
////
////// Union of two set
////numbers.addAll(even);
////System.out.println("Union is: " + numbers);
////numbers.retainAll(even);
////System.out.println("Intersection is: " + numbers);
//numbers.removeAll(even);
//System.out.println("Diffrence : " + numbers);

//HashTable<Integer,String> ht=new HashTable<>();
//ht.put(1,"c++");
//ht.put(2,"vstudio");
//sout("Hashtable :"+ht);

//https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html