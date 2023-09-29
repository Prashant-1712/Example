package AssignmentPw;
import java.util.HashMap;
import java.util.Map;

public class CharOccurrence {
	public static void main(String[] args) {
		String str = "Welcome to java Programming";
		str=str.replaceAll("\\s","");
		Map<Character, Integer> map = new HashMap<>();
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (map.containsKey(c)) {
				int count = map.get(c);
				count++;
				map.put(c, count);
			} else {
				map.put(c, 1);
			}


		}

			System.out.println(map);
		}
	}

//In this program, we first define the input string str. We then create a Map called charMap that will store the count of each character in the string.
//
//We then loop through each character in the string and check if the character already exists in the map. If it does, we increment the count for that character. If it doesn't, we add it to the map with a count of 1.
//
//Finally, we loop through the entries in the map and print out each character along with its count.
//
//When we run this program, the output will be:
//
//yaml
//Copy code
//h : 1
//e : 1
//l : 3
//o : 2
//  : 1
//w : 1
//r : 1
//d : 1



