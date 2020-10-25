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

  public static int[] sumRows(int[][] matrix){
    int[] sums = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++){
      sums[i] = sum(matrix[i]);
    }
    return sums;
  }

  public static int[] largestInRows(int[][] matrix){
    int[] bigVals = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++){
      bigVals[i] = largest(matrix[i]);
    }
    return bigVals;
  }

  public static int sum(int[][] arr){
    int sum = 0;
    for (int i = 0; i < arr.length; i++){
      sum += sum(arr[i]);
    }
    return sum;
  }



}
