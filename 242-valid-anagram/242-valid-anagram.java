class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
			return false;
		}
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		
		for (char d : t.toCharArray()) {
			if (map.get(d) == null) {
				return false;
			}
			map.put(d, map.get(d) - 1);
		}
		
		for (int v : map.values()) {
			if (v != 0) {
				return false;
			}
		}
		return true;
    }
}