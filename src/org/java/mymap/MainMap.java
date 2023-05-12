package org.java.mymap;

import java.util.HashMap;
import java.util.Map;

public class MainMap {
	public static void main(String[] args) {
		String str = "Lorem ipsum dolor, sit amet consectetur adipisicing elit. Totam - repudiandae est, alias in ullam excepturi ipsam modi odio Lorem ipsum dolor asperiores voluptatum, # quam distinctio ! Lorem ipsum dolor, sit amet consectetur adipisicing elit. Totam repudiandae Totam repudiandae est ; accusantium voluptatum, quam distinctio aut magnam quod veniam esse nesciunt debitis.";
		String[] words = str.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
		
		
		Map<String, Integer> f = new HashMap<>();

		for (String word : words) {
		    if (f.containsKey(word)) {
		        int count = f.get(word);
		        f.put(word, count + 1);
		    } else {
		        f.put(word, 1);
		    }
		}

		System.out.println(f);
	}
}
