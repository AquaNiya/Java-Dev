import java.util.Collections;

public class ArrayList {
  public static void main (String[] args){

    //ArrayList = a resizable array that stores objects (autoboxing).
    //Arrays are fixed in size , but ArrayLists can change.

    java.util.ArrayList<Double> list = new java.util.ArrayList<>();
    list.add(3.14);
    list.add(1.99);
    list.add(2.01);

    System.out.println(list);

    java.util.ArrayList<String> fruits = new java.util.ArrayList<>();
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Orange");

    fruits.remove(1); //removes Banana
    fruits.set(0, "Pineapple");
    System.out.println(fruits.get(0));
    System.out.println(fruits.size());

    Collections.sort(fruits);
    
    for(String fruit : fruits){
      System.out.println(fruit);
    }

  }
}
