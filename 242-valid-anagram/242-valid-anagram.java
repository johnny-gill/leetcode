class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
			return false;
		}
		
		final int alphabetSize = 26;
		int[] alphabet = new int[alphabetSize];
		
		
		for (int i = 0; i < s.length(); i++) {
			alphabet[s.charAt(i) - 'a']++;
			alphabet[t.charAt(i) - 'a']--;
		}
		
		for (int i = 0; i < alphabetSize; i++) {
			if (alphabet[i] != 0) {
				return false;
			}
		}
		
		return true;
    }
}