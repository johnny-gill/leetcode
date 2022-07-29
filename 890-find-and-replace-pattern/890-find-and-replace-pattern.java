class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
		List<String> result = new ArrayList<>();
		
		if (pattern.length() == 1) {
			result = Arrays.asList(words);
			return result;
		}

		int[] patternArr = getPattern(pattern);
		for (String word : words) {
			int[] wordArr = getPattern(word);
			if (Arrays.equals(patternArr, wordArr)) {
				result.add(word);
			}
		}
		
        return result;
    }
	
	public int[] getPattern(String word) {
		int[] wordArr = new int[word.length()];
		Map<Character, Integer> alphaMap = new HashMap<>();
		
		for (int i = 0; i < wordArr.length; i++) {
			char c = word.charAt(i);
			alphaMap.putIfAbsent(c, i);
			wordArr[i] = alphaMap.get(c);
		}
		
		return wordArr;
	}
}