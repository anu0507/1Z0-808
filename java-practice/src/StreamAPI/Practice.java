package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice {

	public static void main(String[] args) {
		Stream<String> stream1 = Stream.of("123","234","345");
		Stream<String> out = stream1.map((String s)->s.substring(0,1));
		out.forEach(System.out::print);
		List<String> list = Arrays.asList("1Z0-809","1Z0-810","1Z1-811","1Z1-803");
		List<String>list1 = list.stream().flatMap(e->Stream.of(e.split("-"))).distinct().sorted().collect(Collectors.toList());
		System.out.println(list1);
		
/*//Q.
		String [] s = {"hello","world","java","servlet","jsp"};
		Stream<String> stream = Arrays.stream(s);
		/*stream.map(d->d.length()).collect(Collectors.toList()).forEach(System.out::println);*/
		/*stream.map(String::length).collect(Collectors.toList()).forEach(System.out::println);*/
		
		//Q.
		String [] arr = {"hello","world"};
		Stream<String> stream2 = Arrays.stream(arr);
		Stream<String[]> map = stream2.map(w->w.split(""));
		//List<Stream<String>> collect = map.map(Arrays::stream).distinct().collect(Collectors.toList());
		List<String> collect1 = map.flatMap(Arrays::stream).distinct().collect(Collectors.toList());
		//System.out.println(collect1);
		/*
		 * diff b/w map and flatmap?
		 * map: it transforms into a seprate stream everytime but flatmap transforms into single stream.
		 */
		//Q.
		int [] ar = {1,2,3,4,5};//output: 1 4 9 16 25
		List<Integer> asList = Arrays.asList(1,2,3,4,5);
		List<Integer> collect2 = asList.stream().map(i->i*i).collect(Collectors.toList());
		//System.out.println(collect2);
		/*Q.  you have two list,list1 contains 1,2,3 and list2 contain 3,4.
		 *  you should return pairs of number like extract those pairs whose sum is divisible by 3.
		 */
		List<Integer> asList2 = Arrays.asList(1,2,3);
		List<Integer> asList3 = Arrays.asList(3,4);
		List<int[]> collect3 = asList2.stream().flatMap(i->asList3.stream().map(j->new int [] {i,j})).collect(Collectors.toList());
		collect3.stream().forEach(k->System.out.print("("+k[0]+","+k[1]+")"));
		List<int[]> collect4 = asList2.stream().flatMap(i->asList3.stream().filter(j->(i+j)%3==0).map(j-> new int[] {i,j}))
		.collect(Collectors.toList());
		System.out.println();
		collect4.stream().forEach(k->System.out.print("("+k[0]+","+k[1]+")"));
		// <R> Stream<R> map(Function<? super T,? extends R> mapper);
		// <R> Stream<R> flatMap(Function<? super T,? extends Stream<? extends R>> mapper);*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
