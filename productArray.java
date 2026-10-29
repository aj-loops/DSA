public class productArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        int ans[] = new int[arr.length];
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = 1;
            for (int j = 0; j < arr.length; j++) {

                if (i != cnt) {
                    temp *= arr[j];

                }
            }
            ans[i] = temp;
            cnt++;
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
