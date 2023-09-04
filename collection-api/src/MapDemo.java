import java.util.HashMap;

public class MapDemo {
	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<>();
		map.put("scott", "tiger");
		map.put("jack", "jilli");
		map.put("polo", "lili");
		map.put("jack", "rose");
		
		System.out.println("Scott: "+map.get("scott"));
		System.out.println("Polo: "+map.get("polo"));
		System.out.println("jack: "+map.get("jack"));
		
		//Print all keys and values without manually feeding keys
		for(String key:map.keySet())
			System.out.println(key + ": "+map.get(key));		
	}

}
