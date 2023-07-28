package firstweekassignments;


import java.util.*;
import java.util.Map.Entry;

public class Q33LongestTower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner S = new Scanner(System.in);
		S.close();
		TreeMap<Integer, Integer>  TM= new TreeMap<Integer, Integer>();
		TM.put(65, 100); TM.put(70, 150); TM.put(56, 90); TM.put(75, 190); TM.put(60, 95); TM.put(68, 110);
		int high = TM.lastEntry().getKey();
		System.out.println("The longest tower is length "+TM.size()+" at height "+high+" and includes from top to bottom:");
		for(Map.Entry ME : TM.entrySet())
		{
			System.out.println(ME.getKey()+":" +ME.getValue());
		}
	}

}
