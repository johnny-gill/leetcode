class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
			return false;
		}
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		
		for(int i = 0; i < t.length(); i++) {
			if (map.get(t.charAt(i)) == null) {
				return false;
			}
			map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
		}
		
		for (int v : map.values()) {
			if (v != 0) {
				return false;
			}
		}
		return true;
    }
}