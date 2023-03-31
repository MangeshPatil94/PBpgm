package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Generic
{
public static void main(String[] args) {
	TreeSet<Integer> hs=new TreeSet<Integer>();
//	hs.add("ram");
	hs.add(200);
//	hs.add(null);
	hs.add(100);
	hs.add(50);
	hs.add(200);
	hs.add(200);
	System.out.println(hs);
	ArrayList <String> al=new ArrayList<String>();
	al.add("ram");
	al.add("shyam");
	//al.add(20);
System.out.println(al);
}
}
