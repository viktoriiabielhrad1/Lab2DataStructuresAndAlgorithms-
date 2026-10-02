public class TestListReferenceBased {

	public static void main(String[] args) {
		ListReferenceBased aList = new ListReferenceBased();
		System.out.println("--Testing the reference based ADT List--");
		System.out.println("Is the list empty? " + aList.isEmpty());//test isEmpty()
		
		System.out.println("Adding items to the list...");//test adding items to the list
		aList.add(1, "Mango");
		aList.add(2, "Onion");
		aList.add(3, "Ramen");
		aList.add(3, "Potato");
		System.out.println("Longest string object is " + aList.listLongest());//test longest string obj
		
		aList.displayList();//print out the list
		
		System.out.println("List size: " + aList.size());//test size()
		
		System.out.println("Getting item 1 from the list...");
		System.out.println(aList.get(1));//test get()
		
		
		System.out.println("Remove item 2 from the list...");
		aList.remove(2);//test removing item from the list
		System.out.println("List size: " + aList.size());//test size() after removing
		
		System.out.println("Clear the list");
		aList.removeAll();
		System.out.println("Is the list empty? " + aList.isEmpty());//test if the list is clear
		

		System.out.println("Longest string object is " + aList.listLongest());
	}

}


