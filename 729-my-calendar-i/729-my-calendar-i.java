import java.util.Map.Entry;
class MyCalendar {

   private final Map<Integer, Integer> map;
	public MyCalendar() {
		map = new HashMap<>();
    }
    
    public boolean book(int start, int end) {
    	boolean result = true;
    	for (Entry<Integer, Integer> entry : map.entrySet()) {
    		if(!(end <= entry.getKey() || entry.getValue() <= start)) {
    			result = false;
    			break;
    		}
		}
    		
    	if (result) {
        	map.put(start, end);
    	}
    	
    	return result;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */