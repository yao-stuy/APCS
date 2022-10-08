public class oct6cw{
  public static int[] returnCopy(int[]ary){
    int[] newArray = new int[ary.length];
    for (int x = 0; x < ary.length; x++){
      newArray[x] = ary[x];
    }
    return newArray;
  }

  public static int[] concatArray(int[]ary1, int[]ary2){
    int[] nArray;
    if (ary1.length>ary2.length){
      nArray = new int[ary1.length];
      for (int x = 0; x < ary2.length; x++){
        nArray[x] = ary1[x] + ary2[x];
      }
      for (int x = ary2.length; x < ary1.length; x++){
        nArray[x] = ary1[x];
      }
    }
    else{
      nArray = new int[ary2.length];
      for (int x = 0; x < ary1.length; x++){
        nArray[x] = ary1[x] + ary2[x];
      }
    for (int x = ary1.length; x < ary2.length; x++){
      nArray[x] = ary2[x];
    }
  }
    return nArray;
  }


}
