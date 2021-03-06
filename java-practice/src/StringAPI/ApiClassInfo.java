package StringAPI;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ApiClassInfo {

	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> forName = Class.forName("java.util.Set");
		Method[] methods = forName.getMethods();
		List<String> collect = Arrays.stream(methods).map(s->s.getName()).collect(Collectors.toList());
		collect.forEach(System.out::println);
		System.out.println(collect.size());

	}

}
