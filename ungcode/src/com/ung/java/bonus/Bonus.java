package com.ung.java.bonus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bonus {

	static int occur = 0;
	public void occurrence(List<String> names, Map<String, Integer> result, int occurrence) {

		for (int i = 0; i < names.size(); i++) {

			for (int j = 0; j < names.size(); j++) {

				if (names.get(i).equals(names.get(j))) {

					occurrence++;
				}
			}
			result.put(names.get(i), occurrence);
			occurrence = 0;
		}

	}
	
	public void  occurrenceRec(List<String> names, Map<String, Integer> result, int i,int j, List <Integer> a,int count) {
		
		if(i == names.size()-1 || j == names.size()-1) {
			
			return ;
		}
		
		if(names.get(i).equals(names.get(j))) {
			
			System.out.println(names.get(j));
			a.add(i, count);
			occurrenceRec(names, result, i,j+1,a, count+1);
			
		}
		result.put(names.get(i), a.get(i));	
		occurrenceRec(names, result, i+1,j,a,0);
	}

	public static void main(String[] args) {

		Map<String, Integer> result = new HashMap<String, Integer>();
		List<String> names = new ArrayList<String>();
		names.add("John");
		names.add("Lucas");
		names.add("Lucas");
		names.add("Anthony");
		names.add("John");
		names.add("Lucas");
		Bonus bonus = new Bonus();
		//bonus.occurrence(names, result, 0);
		//System.out.print(result);
		List <Integer> a = new ArrayList<Integer>();
		
		bonus.occurrenceRec(names, result, 0,0, a,0);
		System.out.println(result);
		System.out.print(a);

	}

}
