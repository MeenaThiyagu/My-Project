package collection;

import java.util.*;

public class ArrayListInsights {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> colorList=new ArrayList<>();
		colorList.add("Lemon");
		colorList.add("Orange");
		colorList.add("Purple");
		colorList.add("Grey");
			
		Iterator it=colorList.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");			
		}
		
		colorList.add(3,"Magenta");//adding in the beginning
		System.out.println(colorList);
		colorList.get(2);//retrieve at an index
		colorList.set(1, "Blue");//Updating the value of index 1
		System.out.println(colorList);
		colorList.remove(3);
		System.out.println("After removing third index element, the final result set is "+colorList);
		
		//Element search
		boolean elementSearch=colorList.contains("Lemon");
		if(elementSearch)
			System.out.println("It contains lemon");
		else
		System.out.println("it does not given element ");
		
		Collections.sort(colorList);
		System.out.println("The sorted list is "+colorList);
		
		List<String> copiedList=new ArrayList<>();
		copiedList.addAll(colorList);
		System.out.println("The list items copied in new list are "+copiedList);
		
		Collections.shuffle(copiedList);
		System.out.println("The list items shuffled in new list are "+copiedList);
	
		Collections.reverse(copiedList);
		System.out.println("The list items reversed in new list are "+copiedList);
		
		//Extract portion of arrayList
		List<String> sub=copiedList.subList(1, 3);
		System.out.println("The extracted items  in list are "+sub);
		
		Collections.swap(copiedList, 1,2);
		System.out.println("The list items once swapping 1 and 2  in list are "+copiedList);
	}

}
