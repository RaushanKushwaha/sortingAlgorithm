public class BubbleSort {
    static void bubble(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (flag == false) {
                return;
            }

        }

    }

    public static void main(String[] args) {
        int arr[] = { 4, 9, 3, 2, 1, 5 };
        bubble(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}