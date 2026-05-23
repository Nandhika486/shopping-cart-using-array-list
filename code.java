import java.util.*;
public class Main{
  public static void main(String arg[]){
    ArrayList<String> cart= new ArrayList<>();
    cart.add("flour");
    cart.add("milk");
    cart.add("lentils");
    cart.add("soaps");
    cart.add("shampoo");
    cart.add("chocolates");
    System.out.println(cart);

    //then ur mom said no to chocolates
    System.out.println(cart.remove("chocolates"));
    System.out.println(cart);

    if(cart.isEmpty()){
      System.out.println("NO need to go to the billing point");
    }
    else{
      System.out.println("Go to checking point");
    }

  }
}
