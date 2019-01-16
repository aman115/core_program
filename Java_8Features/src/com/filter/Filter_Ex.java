package com.filter;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Filter_Ex {
	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
		map.put(1, "Aman");
		map.put(2, "Dhruv");
		String result="";
		 result=map.entrySet().stream()
				.filter(x->"Aman".equals(x.getValue()))
				.map(x->x.getValue())
				.collect(Collectors.joining());
		System.out.println(result);
		
		String result1=map.entrySet().stream()
				.filter(x->{
					if(!x.getValue().contains("Bhavin") && !x.getValue().contains("Parth")){
						return true;
					}
					return false;
				})
				.map(m->m.getValue())
				.collect(Collectors.joining(","));
		System.out.println(result1);
	}
}
