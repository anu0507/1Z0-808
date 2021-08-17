package ArrayList;

import java.util.*;
import java.util.stream.*;
//import java.util.Iterator;

public class ArrayListExample {

	private static final String Student = null;
	private static char[] s;
	private static int isEmpty;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
//		public java.util.ArrayList(int);
//		  public java.util.ArrayList();
//		  public java.util.ArrayList(java.util.Collection<? extends E>);
//		  public void trimToSize();
//		  public void ensureCapacity(int);
//		  public int size();
//		  public boolean isEmpty();
//		  public boolean contains(java.lang.Object);
//		  public int indexOf(java.lang.Object);
//		  public int lastIndexOf(java.lang.Object);
//		  public java.lang.Object clone();
//		  public java.lang.Object[] toArray();
//		  public <T> T[] toArray(T[]);
//		  E elementData(int);
//		  public E get(int);
//		  public E set(int, E);
//		  public boolean add(E);
//		  public void add(int, E);
//		  public E remove(int);
//		  public boolean remove(java.lang.Object);
//		  public void clear();
//		  public boolean addAll(java.util.Collection<? extends E>);
//		  public boolean addAll(int, java.util.Collection<? extends E>);
//		  protected void removeRange(int, int);
//		  public boolean removeAll(java.util.Collection<?>);
//		  public boolean retainAll(java.util.Collection<?>);
//		  public java.util.ListIterator<E> listIterator(int);
//		  public java.util.ListIterator<E> listIterator();
//		  public java.util.Iterator<E> iterator();
//		  public java.util.List<E> subList(int, int);
//		  static void subListRangeCheck(int, int, int);
//		  public void forEach(java.util.function.Consumer<? super E>);
//		  public java.util.Spliterator<E> spliterator();
//		  public boolean removeIf(java.util.function.Predicate<? super E>);
//		  public void replaceAll(java.util.function.UnaryOperator<E>);
//		  public void sort(java.util.Comparator<? super E>);
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(" anu");
		al.add("kalawati");
		al.add('a');
		al.add(5);
		al.add("car");
		// ways to fetch or iterate of an ArrayList Elements.
		System.out.println(al.size());
		System.out.println("------way 1--------");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));

		}
		System.out.println("------way 2--------");
		int i = 0;
		while (i < al.size()) {
			System.out.println(al.get(i));
			i++;
		}
		System.out.println("------way 3--------");
		Iterator iterator = al.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("------way 4--------");
		for (Object obj : al) {
			System.out.println(obj);
		}
		System.out.println("------way 5--------");
		Enumeration enumeration = Collections.enumeration(al);
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());

		}
		System.out.println("------way 6--------");
		// al.forEach(k->System.out.println(k));
		al.forEach(System.out::println);
		System.out.println("------way 7--------");
		al.stream().forEach(System.out::println);

	}

}
