public class IsArraySorted {
    public static void main(String[] args) {
        int arr[] = new int[]{5,8,20,10};
        System.out.println(ifArraySorted(arr));

        int arr1[] = new int[]{10,10,10};
        System.out.println(ifArraySorted(arr1));
    }

    public static boolean ifArraySorted(int arr[]){
        int start = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[start]>arr[i]){
                return false;
            }
            start++;
        }
        return true;
    }
}
