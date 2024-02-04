public class InsertionSort {
    static void insertionSort(int arr[]){
        int n =arr.length;
        for (int i = 1; i <n; i++) {
            int j = i;
            while (j>0 && arr[j] < arr[j-1]) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;

                j--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]  = {3,2,5,1,10};
        insertionSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
