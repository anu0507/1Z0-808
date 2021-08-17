package lambdaExpression;

// Q difference b/w ArrayList and vector?
// Q write hierarchy of the collection?
import java.util.List;
/* int size();
 * boolean isEmpty();
 * boolean contains(Object o);
 * Iterator <E> iterator();
 * Object[] toArray();
 * <T> T[] toArray(T[] a);
 * boolean add(E e);
 * boolean remove(Object o);
 * boolean containsAll(Collection<?> c);
 *   boolean addAll(Collection<? extends E> c);
 *   boolean addAll(int index, Collection<? extends E> c);
 *   boolean removeAll(Collection<?> c);
 *   boolean retainAll(Collection<?> c);
 *   default void replaceAll(UnaryOperator<E> operator) {
        Objects.requireNonNull(operator);
        final ListIterator<E> li = this.listIterator();
        while (li.hasNext()) {
            li.set(operator.apply(li.next()));
        }
    }
 *  default void sort(Comparator<? super E> c) {
        Object[] a = this.toArray();
        Arrays.sort(a, (Comparator) c);
        ListIterator<E> i = this.listIterator();
        for (Object e : a) {
            i.next();
            i.set((E) e);
        }
    }  
 * void clear();
 * boolean equals(Object o);
 * int hashCode();
 * E get(int index);
 * E set(int index, E element);
 * void add(int index, E element);
 * E remove(int index);
 * int indexOf(Object o);
 * int lastIndexOf(Object o);
 * ListIterator<E> listIterator();
 * ListIterator<E> listIterator(int index);
 * List<E> subList(int fromIndex, int toIndex);
 * default Spliterator<E> spliterator() {
        return Spliterators.spliterator(this, Spliterator.ORDERED);
    }
 * */
import java.util.ListIterator;
import java.util.Objects;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.UnaryOperator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;

public class LambdaExample {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		l1.add(60);
		l1.add(70);
		l1.add(80);
		l1.add(90);
		l1.add(100);
		// Q how many ways you can iterate/fetch the record from list?
		// way no.1, using for loop
		for (int i = 0; i < l1.size(); i++) {
			Integer value = l1.get(i);
			//System.out.println(value);

		}
		// way no.2, using while loop
		int i = 0;
		while(i<l1.size()) {
			//int value  = l1.get(i);
			//System.out.println(value);
			//i++;
			//System.out.println(l1.get(i++));
		}
		// way no.3, using enhance for loop
		
		for(int j: l1) {
			System.out.println(j);
			
			
			
		}
		// way no.4 , using iterator
		Iterator<Integer> it = l1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
			
		}
		// way no.5,using list iterator
		ListIterator<Integer> lt = l1.listIterator();
		while(lt.hasNext()) {
			System.out.println(lt.next());
			
			
		}
		// way no.6, using ennumeration
		Enumeration<Integer> eit = Collections.enumeration(l1);
		while(eit.hasMoreElements()) {
			System.out.println(eit.nextElement());
		// Q difference b/w iterator and listIterator?
		// Q difference b/w iterator and enumeration?
			
		}
		// way no.7, using forEach method
		l1.forEach(System.out::println);
		l1.forEach(k->System.out.println(k));
		l1.stream().forEach(System.out::println);
		//l1.stream().forEach(<->System.out.println(k));
		
		
		
		
		

	}

}
