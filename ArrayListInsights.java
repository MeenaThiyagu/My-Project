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
		
		
		colorList.addAll(copiedList);//Join the array list=> List 2 is added to lis1
		System.out.println("After joining, list1 details are"+colorList);
		System.out.println("After joining, list2 details are"+copiedList);
		
		copiedList.clear();
		//remove();
		System.out.println("The second list, copiedList contents after removing it all are, "+copiedList);
		
		//Is empty or not
		
		if(copiedList.isEmpty())
			System.out.println("The arraylist is empty :(");
		else
		System.out.println("The arraylist is not empty :)");
		
		System.out.println("The size of array list before trimming is "+colorList.size());//Find the capacity of array
		
		colorList.trimToSize();
		System.out.println("The size of array list after trimming is "+colorList.size());
	
		
		System.out.println("The size of array list before trimming is ");
		colorList.ensureCapacity(14);//Increase the capacity of array-it can surely store 14 elements
		
		colorList.trimToSize();
		System.out.println("The size of array list after trimming is "+colorList.size());
	}

}
