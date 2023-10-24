import java.util.Scanner;
import java.util.Arrays;

class index {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int[] tod = new int[3];
     
      for( int i=0;i<tod.length;++i)
      {
          System.out.print("entre le entiers :");
          tod[i]= sc.nextInt();
      }
      System.out.print("les entiers entrer sont : " );
      for( int i=0;i<tod.length;++i)
      {
          System.out.println(tod[i] + " " );
         
      }
     
      int min = tod[0];
      int minIndex = 0;
     
      for( int i=0;i<tod.length;++i)
      {
         if( tod[i] < min)
         {
             min = tod[i];
             minIndex= i;
         }
         
      }
      System.out.println("min est:" + min + " minIndex est " + minIndex);
     
      int max = tod[0];
      int maxIndex = 0;
     
      for( int i=0;i<tod.length;++i)
      {
         if( tod[i] > max)
         {
             max = tod[i];
             maxIndex= i;
         }
         
      }
      System.out.println("max est:" + max + " maxIndex est " + maxIndex);
     
      /* tri dans ordre croissant*/
     
      Arrays.sort(tod);
      System.out.println("tri dans ordre croissant est :" + Arrays.toString(tod));
     
      /* tri dans ordre Decroissant*/
     
      int[] Decroissant = new int [tod.length];
      for(int i=0; i< tod.length;i++)
      {
         Decroissant[i] = tod[tod.length - 1 -i];
      }
        System.out.println("tri dans ordre Decroissant est :" + Arrays.toString(tod));
    }
}
