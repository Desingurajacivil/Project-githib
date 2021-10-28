package org.pack;

import java.util.*;
import java.util.Map.Entry;

public class ProjectDemo {
	public static void main(String[] args) {
		String s="Desingu Raja";
		Map<Character,Integer> m =new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='O'||c=='I'||c=='U') {
			if(!m.containsKey(c)) {
				m.put(c, 1);
			}else {
				Integer in = m.get(c);
				m.put(c, in+1);
			}
		}
		}
	System.out.println(m);
	Set<Entry<Character, Integer>> es = m.entrySet();
	for (Entry<Character, Integer> entry : es) {
		Integer value = entry.getValue();
		if (value>1) {
			System.out.println(entry);
		}
	}
   }

}
