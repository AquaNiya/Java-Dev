public class string_methods {
  public static void main(String[] args){

    //String Methods in Java
    String name = "  Aquaniya  ";

    int length = name.length(); //returns the total length of string
    System.out.println("Print length of the string: " + length);

    char letter = name.charAt(0); //returns a character at a given index
    System.out.println("Print letter of the string: " + letter);
    
    int index = name.indexOf("ya"); //returns index of the first occuring character 
    System.out.println("Print index of the string: " + index);
    
    int lastIndex = name.lastIndexOf("a"); //returns the last occuring of the index
    System.out.println("Print last index of the string: " + lastIndex);

    name = name.trim(); //removes all the white spaces
    System.out.println("Removed spaces string: " + name);


    /*name = name.toUpperCase(); -changes name to upper case *AQUANIYA*
    name = name.toLowerCase(); -changes name to lower case *aquaniya*
    System.out.println("name change with case: " + name);*/
    
    //Step-1 declare a string first as String variable = "inside quotes"

    String name1 ="Aquaniya" ;
    name1 = name1.replace("n" , "N");
    System.out.println("Replaced string: "+ name1);

    System.out.println("String is empty or not: " + name1.isEmpty());
    //using if else statements
    if(name1.isEmpty()){
      System.out.println("Your name is empty: ");
    }else{
      System.out.println("Hello " + name1);
    }

    //check if our string contains character returns a boolean method
    if(name.contains(" ")){
      System.out.println("Your name contains a space");
    }else{
      System.out.println("Your name DOESN'T contian any spaces"); //typically usernames
    }

    //check if two strings are equal
    //equals method doesn't account for case sensitivity

    if(name.equals("aquaniya")){
      System.out.println("Your name can't be passwrod");
    }else{
      System.out.println("Hello, " + name);
    }

    


  }
}
