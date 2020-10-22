public class ArrayOps{
  public static int sum(int[] arr){
    int sum = 0;
    for (int i = 0; i< arr.length; i++) {
      sum += arr[i];
    }
    return sum;
  }

  public static int largest(int[] arr){
    int maxValue = 0;
    for (int i = 0; i < arr.length; i++){
      if (arr[i] > maxValue) maxValue = arr[i];
    }
    return maxValue;
  }

}
