public class JavaBasics { 

    public static void main(String[] args) {  
      int line ;
      int numLine = 4;
      int numCol = 4;

    for(line=1;line<=numLine;line++){
        
        if(line==1||line==numLine){
           for(int j=1; j<= numCol;j++){
            System.out.print("*");
           }
        }else{
            System.out.println("\n");
            for(int k=1;k<=numCol;k++){
               if(k==1||k==numCol){
                System.out.print("*");
               }else{
                System.out.print("a");
               }
            }
        }

    }
        
    }
    }