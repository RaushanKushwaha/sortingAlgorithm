public class MoveAllZeroAttTheEnd {
    static void zeroAtTheEnd(int arr[]){
        int n = arr.length;
        for (int i = 0; i <n; i++) {
          boolean flag = false;
            for (int j = 0; j<n-i-1; j++) {
               if (arr[j]==0 && arr[j+1]!=0) {
                 int temp = arr[j];
                 arr[j] = arr[j+1];
                 arr[j+1] = temp;
                 flag = true;
               } 
            }
            if (flag == false) {
              return;
            }
        }
       
    }
    public static void main(String[] args) {
        int arr [] = {0,5,0,3,0,2,0,6};
        zeroAtTheEnd(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
