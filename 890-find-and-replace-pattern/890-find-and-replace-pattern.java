class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
		List<String> result = new ArrayList<>();
		
		if (pattern.length() == 1) {
			result = Arrays.asList(words);
			return result;
		}

		for (String word : words) {
			if (isSameArray(word, pattern)) {
				result.add(word);
			}
		}
		
        return result;
    }
	
	private boolean isSameArray(String word, String pattern) {
		for (int i = 0; i < word.length(); i++) {
			if (word.indexOf(word.charAt(i)) != pattern.indexOf(pattern.charAt(i))) {
				return false;
			}
		}
		return true;
	}
}