class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
			return false;
		}
		
		Map<Character, Integer> mapS = new HashMap<Character, Integer>();
		for (char c : s.toCharArray()) {
			mapS.put(c, mapS.getOrDefault(c, 0) + 1);
		}
		
		Map<Character, Integer> mapD = new HashMap<Character, Integer>();
		for (char d : t.toCharArray()) {
			mapD.put(d, mapD.getOrDefault(d, 0) + 1);
		}
		
		return mapS.equals(mapD);
    }
}