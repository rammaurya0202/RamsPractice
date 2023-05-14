//import java.util.*;
public class Practice5 {
  public static void PrintTraingle(int n){
      for(int i=1;i<=n;i++){
          for(int j=1;j<=i;j++){
              System.out.print("*" + " ");
          }
          System.out.println();
      }

  }
  public static void PrintRec(int row,int col){
      for(int i=1;i<=row;i++){
          for(int j=1;j<=col;j++){
              System.out.print("*" + " ");
          }
          System.out.println();
      }
  }

  public static void PrintOppositeTraingle(int n){
      for(int i=1;i<=n;i++){
          for(int j=1;j<=n-i+1;j++){
              System.out.print("*" + " ");
          }
          System.out.println();
      }
  }
  public static void FullPyramid(int n){
      for(int i=1;i<=n; i++){
          for(int j=1; j<=n-i; j++){
              System.out.print( " ");

          }
          for(int j=1;j<=i;j++){
              System.out.print("*"+" ");
          }
          System.out.println();
      }

  }

    public static void main(String[] args) {
       //PrintTraingle(5);
       // PrintRec(5,5);
        //PrintOppositeTraingle(5);
        FullPyramid(10);


    }




}
