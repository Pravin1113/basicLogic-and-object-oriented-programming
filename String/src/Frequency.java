import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Frequency {
	public static void main(String[] args) {
		String p="pravinna chavan i am java devloper";
	String k=p.replaceAll(" ", "");
		Map<Character, Integer>map= new HashMap<>();
		char[]chars=k.toCharArray();
		for (char c : chars) {
			if(!map.containsKey(c)) {
				map.put(c, 1);
			}else {
				int value= map.get(c);
				map.put(c, value+1);
			}
			
		}
		System.out.println(map);
		
	}

}
