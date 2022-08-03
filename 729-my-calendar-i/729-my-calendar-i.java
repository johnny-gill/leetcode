class MyCalendar {

    private final List<Map<String, Integer>> list;
	public MyCalendar() {
		list = new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
    	boolean result = true;
    	for (Map<String, Integer> m : list) {
    		if(!(end <= m.get("s") || m.get("e") <= start)) {
    			result = false;
    			break;
    		}
		}

    	if (result) {
    		Map<String, Integer> map = new HashMap<>();
        	map.put("s", start);
        	map.put("e", end);
        	list.add(map);
    	}
    	
    	return result;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */