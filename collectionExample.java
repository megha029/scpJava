package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class collectionExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// class LinkedListDemo
		List<String> l1 = new LinkedList<String>();
		l1.add("100");
		l1.add("megha");
		l1.add("element");
		System.out.println(l1);

		l1.set(0, "neha");
		l1.remove(2);
		l1.set(1, "element 2");
		System.out.println(l1);
		l1.add("1");
		System.out.println(l1.size());

		

		// class ArrayList demo with iterator
		ArrayList ary = new ArrayList();
		ary.add("1");
		ary.add("2");
		ary.add("3");
		ary.add("4");
		ary.add("5");
		ary.add("6");
		System.out.println(ary);
		ary.set(0, "7");
		
		ary.remove(0);
		ary.set(1, "8");
		System.out.println(ary);

		ArrayList l = new ArrayList();
		for (int i = 0; i <= 10; i++) {
			l.add(i);

		}
		System.out.println(l);

		Iterator itr = l.iterator();
		while (itr.hasNext()) {
			Integer I = (Integer) itr.next();
			if (I % 2 == 0)
				System.out.println(I);
			else
				itr.remove();

		}
		System.out.println(l);

		// vector with enumeration and Listiterator demo
		Vector v = new Vector();
		System.out.println(v.capacity());
		for (int i = 1; i <= 10; i++) {
			v.addElement(i);
		}
		System.out.println(v);
		v.addElement("a");
		System.out.println(v.capacity());
		System.out.println(v);
		Enumeration e = v.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());

		}
		System.out.print(v);
		ListIterator litr = v.listIterator();

		System.out.println("\ntraversing forward direction");
		while (litr.hasNext()) {
			System.out.println(litr.next());
		}
		System.out.println("\nTraverse in backward direction");
		while (litr.hasPrevious()) {
			System.out.println(litr.previous());

		}

	}

}
