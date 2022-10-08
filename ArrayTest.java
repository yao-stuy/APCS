public class ArrayTest{
   public static void main(String[]args){
     int [] anArray = new int[11];
     for (int x = 0; x < anArray.length; x++){
       anArray[x] = 100 + x * 10;
     }
     //int[] anArray = ???
     //Write the loop to initialize it
     System.out.println("part 1: " + anArray);
     //print the array variable\
     System.out.print("part 2: ");
     for (int x = 0; x < anArray.length; x+=5){
       if (x==10){
          System.out.println(anArray[x] + " ");
       }
      else{
     System.out.print(anArray[x] + " ");
   }
   }
     System.out.println("part 3: ");
     for (int x = 0; x < anArray.length; x++){
     System.out.print(anArray[x] + " ");
   }
     //Write a loop to print it out (on one line)
   }
 }
