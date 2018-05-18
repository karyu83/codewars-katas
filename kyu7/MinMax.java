#https://www.codewars.com/kata/the-highest-profit-wins/train/java

class MinMax {
    public static int[] minMax(int[] arr) {
        // Your awesome code here
        int min = arr[0];
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
          if(arr[i] < min) min = arr[i];
          if(arr[i] > max) max = arr[i];
        }
        
        return new int[]{min,max};
    }
}