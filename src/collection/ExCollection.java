package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ExCollection {

	public static void main(String[] args) {
		ArrayList<Integer> aar = new ArrayList<>();
		aar.add(10);
		aar.add(5);
		aar.add(50);
		aar.add(30);
		aar.add(60);
		aar.add(10);
//		aar.add(null);
		aar.add(2,35);
//		aar.remove(1);
		Collections.sort(aar);
		System.out.println("is Empty():"+aar.isEmpty());
		System.out.println(" contains():"+aar.contains(50));
		System.out.println("intex of():"+aar.indexOf(10));
		System.out.println("last index of():"+aar.lastIndexOf(50));
		for(int i:aar) {
			System.out.println(i);
		}
		System.out.println(" ArraList is :"+ aar);
		System.out.println();
		ArrayList<String> arr = new ArrayList<>();
		arr.add("anu");
		arr.add("jeni");
		arr.add(" agu");
		arr.add("appu");
		arr.add("aro");
		System.out.println("ArrayList String is :"+ arr);

	}

}
//
//LinkedList<Integer> ll=new LinkedList<>();
//ll.add(10);
//ll.addFirst(23);
//ll.add(6);
//ll.offerLast(50);
////ll.addLast(40);
//System.out.println("Element in Lined List : "+ll);
//System.out.println("Element in pullfirst : "+ll.pollFirst());
//System.out.println("Element in Lined List : "+ll);
////System.out.println("Element in Lined List : "+ll.getFirst());
////System.out.println("Element in peekfirst Linked List : "+ll.peekFirst());

//
//System.out.println("Element in Linked List using Iterator :");
//Iterator<Integer> iter = ll.descendingIterator();
//while (iter.hasNext()) {
//  int i = iter.next();
//   System.out.println(i);
//}

//Stack<Integer> s=new Stack<>();
//s.push(10);
//s.push(12);
//s.push(14);
//System.out.println("My elements:"+s);
//s.pop();
//System.out.println("After Pop my elements:"+s);
//System.out.println("Top of the elment:"+s.peek());//top of elemnt
//System.out.println(s.isEmpty());