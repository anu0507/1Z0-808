package StreamAPI;

import java.util.Arrays;

import java.util.Comparator;

import static java.util.stream.Collectors.toList;

import java.util.ArrayList;

import static java.util.Comparator.comparing;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import StreamAPI.Dish.Type;

/*
 Q1. select vegetarians menu?
 Q2. select all non vegetarians menu?
 Q3. sort menu by calories?
 Q4. group menu by type?
 Q5. select highest calories meal?
 Q6. select lowest calories meal?
 Q7. select highest calories vegetarian meal?
 Q8. select highest calories non vegetarian meal?
 Q9. select first three dishes that have more than 300 calories?
 Q10. find out whether the menu is healthy (all dishes are below 100 calories)?
 Q11. find out whether the menu is not healthy(calories>=100)?
 Q12. find a dish that is vegetarian?
 */

public class StreamDishPractice {
	public static List<Dish> getMenu() {

		List<Dish> menu = Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT),
				new Dish("beef", false, 700, Dish.Type.MEAT), new Dish("chicken", false, 400, Dish.Type.MEAT),
				new Dish("french fries", true, 530, Dish.Type.OTHER), new Dish("rice", true, 350, Dish.Type.OTHER),
				new Dish("season fruit", true, 120, Dish.Type.OTHER), new Dish("pizza", true, 550, Dish.Type.OTHER),
				new Dish("prawns", false, 300, Dish.Type.FISH), new Dish("salmon", false, 450, Dish.Type.FISH));
		return menu;
	}

	public static void main(String[] args) {

		// Q1. select vegetarians menu?
		/*
		 * getMenu().stream().filter(d -> { return d.isVegetarian();
		 * }).collect(Collectors.toList()).forEach(System.out::println);
		 */
		// Q2. select all non vegetarians menu?
		/*
		 * getMenu().stream().filter(d->{ return d.isVegetarian()==
		 * false;}).collect(Collectors.toList()).forEach(System.out::println);
		 */
		// Q3. sort menu by calories?
		/*
		 * List<Dish> collect =
		 * getMenu().stream().sorted(Comparator.comparing(Dish::getCalories))
		 * .collect(Collectors.toList()); System.out.println(collect);
		 */
		// Q4. group menu by type?
		/*
		 * Map<Type, List<Dish>> map =
		 * getMenu().stream().collect(Collectors.groupingBy(Dish::getType));
		 * System.out.println(map);
		 */
		// Q5. select highest calories meal?
		/*
		 * Dish dish =
		 * getMenu().stream().max(Comparator.comparing(Dish::getCalories)).get();
		 * System.out.println(dish);
		 */
		// Q6. select lowest calories meal?
		/*
		 * Dish collect1 =
		 * getMenu().stream().min(Comparator.comparing(Dish::getCalories)).get();
		 * System.out.println(collect1);
		 */
		// Q7. select highest calories vegetarian meal?
		/*
		 * Dish collect2 = getMenu().stream().filter(d->{ return d.isVegetarian();})
		 * .max(Comparator.comparing(Dish::getCalories)).get();
		 * System.out.println(collect2);
		 */
		// Q8. select highest calories non vegetarian meal?
		/*
		 * Dish collect3 = getMenu().stream().filter(d->{ return d.isVegetarian() ==
		 * false;}) .max(Comparator.comparing(Dish::getCalories)).get();
		 * System.out.println(collect3);
		 */

		// Q9. select first three dishes that have more than 300 calories?
		/*
		 * getMenu().stream().filter(d->{return d.getCalories()> 300;})
		 * .limit(3).collect(Collectors.toList()).forEach(System.out::println);
		 */
		/*
		 * Q10. find out whether the menu is healthy (all dishes are below 100
		 * calories)? Q11. find out whether the menu is not healthy(calories>=100)?
		 */
		/*
		 * List<Dish> collect4 = getMenu().stream().filter(d->{ return d.getCalories()
		 * <100;}) .collect(Collectors.toList()); boolean empty = collect4.isEmpty();
		 * if(empty==true) { System.out.println("Not Healthy Menu"); } else
		 * System.out.println("Healthy Menu");
		 */

		// Q12. find a dish that is vegetarian?
		/*
		 * getMenu().stream().filter(d -> { return d.isVegetarian();
		 * }).collect(Collectors.toList()).forEach(System.out::println);
		 */

//Q13. group the menu by type having more than 500 calories?
		/*
		 * getMenu().stream().filter(d->{ return
		 * d.getCalories()>500;}).collect(Collectors.toList())
		 * .forEach(System.out::println);
		 */
		//// getMenu().stream().collect(groupingBy(Dish::getType,filtering(d->{ return
		//// d.getCalories()>500;}),toList()));
		// Q14.
		/*
		 * Map<Type, Map<Boolean, List<Dish>>> collect2 = getMenu().stream()
		 * .collect(groupingBy(Dish::getType, groupingBy(Dish::isVegetarian))); for
		 * (Map.Entry<Type, Map<Boolean, List<Dish>>> e : collect2.entrySet()) { for
		 * (Map.Entry<Boolean, List<Dish>> e1 : e.getValue().entrySet()) {
		 * System.out.println("Type : " + e.getKey() + "isVegetarian :" + e1.getKey() +
		 * "Menu :" + e1.getValue()); }
		 * 
		 * } collect2.forEach((k1,v1)->v1.forEach((k2,v2)->System.out.println(k1+" "
		 * +k2+" "+v2)));
		 *////////
			// Q. by using partitioning.
		/*
		 * Map<Boolean, List<Dish>> collect =
		 * getMenu().stream().collect(Collectors.partitioningBy(Dish::isVegetarian));
		 * collect.forEach((k,v)->System.out.println(k+" "+v)); for(Map.Entry<Boolean,
		 * List<Dish>> a: collect.entrySet()) {
		 * System.out.println(a.getKey()+" "+a.getValue());
		 * 
		 * }
		 */
		Map<Boolean, List<Dish>> collect1 = getMenu().stream()
				.collect(Collectors.partitioningBy(d -> d.getCalories() > 500));
		collect1.forEach((k, v) -> System.out.println(k + " " + v));
		for (Map.Entry<Boolean, List<Dish>> a : collect1.entrySet()) {
			System.out.println(a.getKey() + " " + a.getValue());

		}
		getMenu().stream().filter(d -> d.getCalories() > 500).peek(System.out::println).collect(Collectors.toList());

		// Q. check all dishes having calories< 1000?
		boolean allMatch = getMenu().stream().allMatch(i -> i.getCalories() < 1000);
		System.out.println(allMatch);

		// Q. check none of the dish having calories having >= 1000
		boolean noneMatch = getMenu().stream().noneMatch(d -> d.getCalories() >= 1000);
		System.out.println(noneMatch);
		// Q. any dish having calories <500
		Predicate<Dish> amit = (t) -> {
			return t.getCalories() < 500;
		};
		// boolean test(T,t);
		boolean anyMatch = getMenu().stream().anyMatch(amit);
		System.out.println(anyMatch);
		// Q. find vegetarian dish?
		Dish dish = getMenu().stream().filter(d -> d.isVegetarian()).findAny().get();
		System.out.println(dish);
		// Optional<Dish> findAny =
		// getMenu().stream().filter(d->d.isVegetarian()).findAny();
		// Q. sum of the calories of the dishes?
		// unary
		Integer reduce = getMenu().stream().map(Dish::getCalories).reduce(0, (a, b) -> a + b);
		System.out.println(reduce);
		Optional<Integer> reduce2 = getMenu().stream().map(Dish::getCalories).reduce(Integer::min);
		System.out.println(reduce2.get());
		// T reduce(T identity,BinaryOperator<T> accumulator);
		// Numeric Stream api
		int sum = getMenu().stream().mapToInt(Dish::getCalories).sum();

		System.out.println(sum);

	}

}
