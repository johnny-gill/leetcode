class Solution {
    public List<String> removeAnagrams(String[] words) {
		Stack<String> stack = new Stack<>();
		stack.push(words[0]);
		
		for (int i = 1; i < words.length; i++) {
			if (!chkAnagrams(stack.peek(), words[i])) {
				stack.push(words[i]);
			}
		}
		
		List<String> result = new ArrayList<>();
		result.addAll(stack);
		
		return result;
    }

	private boolean chkAnagrams(String left, String right) {
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