public class break_Cont {
  public static void main(String[] args){

    //break = break out of loop (STOP)
    //continue = skip current iteration of a loop (SKIP)

    for(int i = 0; i< 10; i++){
      if(i == 5){
        break;
      }
      System.out.print(i+"");
    }

    System.out.println("\n");
    
    for(int j = 0; j< 10; j++){
      if(j == 5){
        continue;
      }
      System.out.print(j+"");
    }  
  }
}
 