package faang.amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* Given an array of strings, group anagrams together.
 * 
 * For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"], 
 * Return:
 * 
 * [
 *   ["ate", "eat","tea"],
 *   ["nat","tan"],
 *   ["bat"]
 * ]
 * 
 * Note: All inputs will be in lower-case.
 */

public class GroupAnagrams {

	public static void main(String[] args) {
		GroupAnagrams g = new GroupAnagrams();
		
		printArray(g.groupAnagrams(new String[] {"eat", "tea", "tan", "ate", "nat", "bat"}));
	}

	public List<List<String>> groupAnagrams(String[] strs) {
		if(strs == null || strs.length == 0) {
			return new ArrayList<List<String>>();
		}
		
		HashMap<String, ArrayList<String>> map = new HashMap<>();
		
		Arrays.sort(strs);
		
		for(String s : strs) {
			char[] characters = s.toCharArray();
			Arrays.sort(characters);
			
			String key = String.copyValueOf(characters);
			
			if(!map.containsKey(key)) {
				map.put(key, new ArrayList<String>());
			}
			
			map.get(key).add(s);
		}
		
		return new ArrayList<List<String>>(map.values());
	}
	
	public static void printArray(List<List<String>> list) {
		System.out.println("[ ");
		
		for(int j = 0; j < list.size(); j++) {
			
			System.out.print("  [");
			for(int i = 0; i < list.get(j).size(); i++) {
				if(i != list.get(j).size()-1) {
					System.out.print(list.get(j).get(i) + ", ");
				} else {
					System.out.print(list.get(j).get(i));
				}	
			}
			
			if(j != list.size() - 1) {
				System.out.println("],");
			} else {
				System.out.println("]");
			}
		}
		
		System.out.println("]");
	}
}
