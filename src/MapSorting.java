import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapSorting {

	public static void main(String[] args) {
		
		Map<String,Integer> map= new HashMap<String,Integer>();
		
		map.put("java", 20);
		map.put("c++",45);
		map.put("unix",54);
		map.put("Mac", 26);
		map.put("why this kolavari", 93);
		
		Set<Entry<String, Integer>> set= map.entrySet(){
		
		List<Entry<String,Integer>> list= new ArrayList<Entry<String,Integer>>(Set);
		
	Collections.sort(list, new Comparator<Map.Entry<String, Integer>>(){

	public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
		return (o2.getValue()).compareTo(o1.getValue());

	

	for(Map.Entry<String, Integer> entry:list)	{
		System.out.println(entry.getKey()+"==="+entry.getValue());
	}
	}
	}
}
}