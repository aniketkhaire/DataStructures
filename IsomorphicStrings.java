import java.util.HashMap;
import java.util.Map;

/***
 * 
 * @author Aniket Khaire
 * Given two strings s and t, determine if they are isomorphic. 
 * Two strings are isomorphic if the characters in s can be replaced to get t. 
 * For example,"egg" and "add" are isomorphic, "foo" and "bar" are not.
 */
public class IsomorphicStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The strings foo and add are isomorphic? "+ isIsomorphic("foo", "bar"));
	}
	
	public static boolean isIsomorphic(String a, String b){
		if(a == null || b == null)
			return false;
		
		if(a.length() != b.length())
			return false;
		
		HashMap<Character, Character> hm = new HashMap<Character, Character>();
		for(int i =0; i<a.length(); i++){
			char char_a = a.charAt(i);
			char char_b = b.charAt(i);
			
			Character temp = getKey(hm, char_b);
			
			if(temp == null)
				hm.put(char_a, char_b);
			else if (temp == char_a){
				if(char_b != hm.get(char_a))
					return false;
			}
			else
				return false;
		}
		return true;
	}
	
	public static Character getKey(HashMap<Character, Character> hm, Character c){
		for(Map.Entry<Character, Character> entry : hm.entrySet()){
			if(entry.getValue().equals(c))
				return entry.getKey();
		}
		return null;
	}
	
}
