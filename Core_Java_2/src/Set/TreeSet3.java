package Set;
import java.util.TreeSet;
public class TreeSet3 {
   public static void main(String[] args) {
		
		TreeSet treeSet=new TreeSet(); //not applicable insertion order
		treeSet.add("velocity");
		treeSet.add("pune");
		
		//treeSet.add(30); //run time will get error->
		//treeSet.add(); //treeset heterogenous object is not allowed
		//treeSet.add(null); //run time will get 
		System.out.println("first set="+treeSet);  //sorting element
		
		TreeSet treeSet1= new TreeSet();
		treeSet1.add(50);
		treeSet1.add(10);
		treeSet1.add(100);
		System.out.println("second set="+treeSet1);
	}}

