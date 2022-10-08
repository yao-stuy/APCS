public class oct6cw{
  public static int[] returnCopy(int[]ary){
    int[] newArray = new int[ary.length];
    for (int x = 0; x < ary.length; x++){
      newArray[x] = ary[x];
    }
    return newArray;
  }

  public static int[] concatArray(int[]ary1, int[]ary2){
      return ary1;
  }


}
