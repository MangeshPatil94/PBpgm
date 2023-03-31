package collections;

import java.util.HashMap;
import java.util.Set;

public class HasMap 
{

	public static void main(String[] args) {
		
		HashMap<Integer,String> mp=new HashMap<Integer,String>();
		mp.put(100,"Mangesh");
		mp.put(101, "Ramesh");
		mp.put(102, "Suresh");
		System.out.println(mp);
		System.out.println(mp.containsKey(101));
		System.out.println(mp.get(102));
		Set<Integer> hm = mp.keySet();
		for(int key:hm)
		{
			System.out.println(key +":"+mp.get(key));
		}
	}
}
