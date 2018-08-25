package messenger.test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Test {
	public static void main(String[] args){
		Map<Integer, String> map = new LinkedHashMap<>();
		map.put(1, "Oracle");
		map.put(2, "Google");
		map.put(3, "Microsoft");
		
		List<String> companies = new ArrayList<>();
		companies.add("Oracle");
		companies.add("Google");
		companies.add("Microsoft");
		
		System.out.println(companies.get(new Integer(0)));
	}
}