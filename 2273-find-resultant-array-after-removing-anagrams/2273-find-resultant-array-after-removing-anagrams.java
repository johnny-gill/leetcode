class Solution {
    public static List<String> removeAnagrams(String[] words) {
		List<String> result = new ArrayList<>();
		
		result.add(words[0]);
		for (int i = 1; i < words.length; i++) {
			
			if (!chkAnagrams(result.get(result.size() - 1), words[i])) {
				result.add(words[i]);
			}
		}
		
		return result;
    }

	private static boolean chkAnagrams(String left, String right) {
		if (left.length() != right.length()) {
			return false;
		}
		
		int[] alphabet = new int[26];
		for (int i = 0; i < left.length(); i++) {
			alphabet[left.charAt(i) - 'a']++;
			alphabet[right.charAt(i) - 'a']--;
		}
		
		for (int i = 0; i < alphabet.length; i++) {
			if (alphabet[i] != 0) {
				return false;
			}
		}
		
		return true;
	}
}