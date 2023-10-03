import java.util.ArrayList;

public class vars {
    public static void main(String[] args) {
       Integer count = 0;
       Integer start = 1;
       Integer end = 10;

       for(Integer i = start; i < end; i++;){
           if(i %2 == 0);
           count += i*i ;
           System.out.print("La somme des carrés des nombres entre" + start +"et" + end + "est" +count);
       }
    }



}

