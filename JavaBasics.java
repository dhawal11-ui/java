import java.util.*;

public class JavaBasics {
    public static void update(int game[]) {
        for(int i=0;i<=game.length-1;i++){
         game[i]++;    
        }
        
    }
    public static void main(String args[]){
      int marks[] = {97,98,99};
      update(marks);

      for(int i=0;i<=marks.length;i++){
         System.out.println(marks[i]);    
        }

    }
} 