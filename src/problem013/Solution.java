package problem013;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {

	public int romanToInt(String s) {

		Set<String> setOfValues = new HashSet<>(Arrays.asList("IV", "IX", "XL", "XC", "CD", "CM"));

		int convertedValue = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'I' || s.charAt(i) == 'X' || s.charAt(i) == 'C') {
				if (i < s.length() - 1) {
					if (setOfValues.contains(s.substring(i, i + 2))) {
						convertedValue += getIntValue(s.substring(i, i + 2));
						i++;
					} else {
						convertedValue += getIntValue(s.substring(i, i + 1));
					}
				} else {
					convertedValue += getIntValue(s.substring(i, i + 1));
				}
			} else {
				convertedValue += getIntValue(s.substring(i, i + 1));
			}
		}
		return convertedValue;
	}

	private int getIntValue(String s) {
		if (s.equals("I")) {
			return 1;
		} else if (s.equals("IV")) {
			return 4;
		} else if (s.equals("V")) {
			return 5;
		} else if (s.equals("IX")) {
			return 9;
		} else if (s.equals("X")) {
			return 10;
		} else if (s.equals("XL")) {
			return 40;
		} else if (s.equals("L")) {
			return 50;
		} else if (s.equals("XC")) {
			return 90;
		} else if (s.equals("C")) {
			return 100;
		} else if (s.equals("CD")) {
			return 400;
		} else if (s.equals("D")) {
			return 500;
		} else if (s.equals("CM")) {
			return 900;
		} else if (s.equals("M")) {
			return 1000;
		}
		return 0;
	}

}
