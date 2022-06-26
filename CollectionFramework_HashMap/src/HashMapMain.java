import java.util.HashMap;
import java.util.Map;

public class HashMapMain {

	public static void main(String[] args) {

		HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
		
		hashMap.put(10, "Java");
		hashMap.put(30, "Phyton"); 
		hashMap.put(50, "Php") ;
		hashMap.put(20, "Php") ;
		
		
		
		//hashMap.put(20, "C++"); C++
		
	/*	
		
		System.out.println(hashMap);
		
		System.out.println(hashMap.get(30));
		System.out.println(hashMap.get(10));
	//	System.out.println(hashMap.get(300)); null

*/
		
		for(Map.Entry<Integer,String> entry : hashMap.entrySet()) {
			
			System.out.println("Anahtar : " +entry.getKey() + " -------> Değer : " +entry.getValue());
			
			
		}
	}

}
