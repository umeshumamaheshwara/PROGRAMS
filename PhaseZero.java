package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class PhaseZero {
	public static void main(String[] args) {
		List<String> parts = Arrays.asList("PhaseZero","JavaPart","javaPart","phaseZero","CodePart");
		
		List<String> unique = parts.stream().map(e->e.toLowerCase()).toList();
		System.out.println(unique);
		
		List<String> Duplicate = unique.stream().distinct().toList();
		System.out.println(Duplicate);
		
		List<String> SortedPart = Duplicate.stream().sorted().toList();
		System.out.println(SortedPart);
		
		
		
		
	
		
//		List<String> lowerCasePart = new ArrayList<String>();
//		
//		for(String part : parts)
//		{
//			lowerCasePart.add(part.toLowerCase());
//		}
//		System.out.println(lowerCasePart);
//		
//		HashSet<String> DuplicatePart = new HashSet<String>();
//		for(String part : lowerCasePart)
//		{
//			DuplicatePart.add(part);
//		}
//		System.out.println(DuplicatePart);
//		
//		List<String> SortedPart = new ArrayList<String>(DuplicatePart);
//		Collections.sort(SortedPart);
//		System.out.println(SortedPart);
		
		
	}

}
