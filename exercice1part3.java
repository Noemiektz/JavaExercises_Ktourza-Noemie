import java.util.ArrayList;

public class vars {
    public static void main(String[] args) {
       for(Integer i = 1; i < 101; i++;){
           
           if (i %3 == 0){
            System.out.print("Fizz");
        } else if (i %5 == 0){
    System.out.print("Buzz");
        }else if (i %5 == 0 && i %3 == 0){
    System.out.print("FizzBuzz");
        } else{
            System.out.print(i);
        }
       
       System.out.print(" ");
       
       }
    }



}


