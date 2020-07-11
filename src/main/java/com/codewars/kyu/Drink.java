package com.codewars.kyu;

import java.util.regex.*;


public class Drink {
	
	public static String hydrate(String drinkString) {
		System.out.println("Remote");
		Pattern pattern = Pattern.compile("(\\d+)");
		Matcher matcher = null;
		int sum = 0;
		String[] drinks = drinkString.split(",");
		for (int i = 0; i < drinks.length; i++) {
			matcher = pattern.matcher(drinks[i].trim());
			while(matcher.find()) {
				sum += Integer.valueOf(matcher.group(1));
			}
		}
		return sum > 1 ? String.format("%d glasses of water", sum) : String.format("%d glass of water", sum);
	}

}
