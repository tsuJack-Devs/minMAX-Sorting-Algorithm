package JEnghog.BlackBeans.Utility;

public class minMAX {
   public static void sort(int[] array) {
      int n = array.length;
      for(int i = 0; i < n / 2; ++i) {
         int min = i;
         int max = n - 1 - i;
         for(int j = i; j < n - i; ++j) {
            if (array[min] > array[j]) {
               min = j;
            }
            if (array[max] < array[j]) {
               max = j;
            }
         }
         int swapMin = array[min];
         int swapMax = array[max];
         array[max] = array[n - i - 1];
         array[min] = array[i];
         array[n - i - 1] = swapMax;
         array[i] = swapMin;
      }

   }

   public static void reverseSort(int[] array) {
      int n = array.length;
      for(int i = 0; i < n / 2; ++i) {
         int max = i;
         int min = n - 1 - i;
         for(int j = i; j < n - i; ++j) {
            if (array[max] < array[j]) {
               max = j;
            }
            if (array[min] > array[j]) {
               min = j;
            }
         }
         int swapMax = array[max];
         int swapMin = array[min];
         array[min] = array[n - i - 1];
         array[max] = array[i];
         array[n - i - 1] = swapMin;
         array[i] = swapMax;
      }
   }

   public static String getVersion() {
      return "BlackBeans minMAX Sort 1.12j (2025) Stable\n\nGPL 3.0 License\nJod Enghog\n";
   }
}
