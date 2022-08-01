import java.util.Map.Entry; 
class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
		List<String> result = new ArrayList<>();
		
		int[] countB = new int[26];
		for (String b : words2) {
			int tmp[] = counter(b);
			for (int i = 0; i < 26; i++) {
				countB[i] = Integer.max(countB[i], tmp[i]);
			}
		}
		
		for (String a : words1) {
			int[] countA = counter(a);
			boolean chk = true;
			for (int i = 0; i < 26; i++) {
				if (countA[i] < countB[i]) {
					chk = false;
					break;
				}
			}
			
			if(chk) {
				result.add(a);
			}
		}
		return result;
	}

	private int[] counter(String s) {
		int[] res = new int[26];
		for (char c : s.toCharArray()) {
			res[c - 'a']++;
		}
		return res;
	}
}