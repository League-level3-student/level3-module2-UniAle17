package _02_More_Algorithms;

import java.util.Collections;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		
		for (int i = 0; i <eggs.size(); i++) {
			
			if(eggs.get(i).equals("cracked")) {
			
			
				return i;
				
		}
		
		
	}
		return -1;
}

	
	public static int countPearls(List<Boolean> oysters) {
		
		int totalPearls=0;
		
		for (int i = 0; i < oysters.size(); i++) {
			
			if(oysters.get(i)==true) {
				
				totalPearls=totalPearls+1;
				
			
				
			}
			
			
		}
		
		return totalPearls;
		
	}
	
	public static double findTallest(List<Double> peeps) {
		
		double tallest = peeps.get(0);
		
		for (int i = 1; i < peeps.size(); i++) {
			
			
			if(peeps.get(i)>tallest)
			
				tallest=peeps.get(i);
				
		}
		
		
		return tallest;
		
	}
	
	
	public static String findLongestWord(List<String> words) {
		
		String longestWord = words.get(0);
		
		
		for (int i = 0; i < words.size(); i++) {
			
			if(words.get(i).length()>longestWord.length()) {
				
				longestWord = words.get(i);
				
			}
			
		}
		
		return longestWord;
		
	}
	
	
	public static boolean containsSOS(List<String>example) {
	
		
		for (int i = 0; i < example.size(); i++) {
			
			if(example.get(i).contains("... --- ...")) {
				
				return true;
			}
			
		}
			
		return false;
		
	}
		
		
		public static List<Double> sortScores(List<Double>results) {
			
			Collections.sort(results);
			
			
			return results;
		
	}
	
		public static List<String> sortDNA(List<String>example){
			
			
			for (int i = 0; i < example.size()-1; i++) {
				
				for (int j = i+1; j < example.size(); j++) {
					
					if(example.get(i).length()>example.get(j).length()) {
						
						String temp = example.get(i);
						
						example.set(i, example.get(j));
						
						example.set(j, temp);
						
					}
					
				}
				
			}
		
		return example;

		}
		
		public static List<String> sortWords(List<String>words){
			
			
			Collections.sort(words);
			
			return words;
			
		}
		
		
}

