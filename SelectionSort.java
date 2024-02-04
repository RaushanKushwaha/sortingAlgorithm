public class SelectionSort {
    static void selectionSort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j<n; j++) {
                if (arr[j]<arr[minIndex]) {
                     minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
            
        }
    }
   public static void main(String[] args) {
    int arr[] = {3,9,2,8,1};
    selectionSort(arr);
    for (int i : arr) {
        System.out.println(i);
    }
   } 
}
