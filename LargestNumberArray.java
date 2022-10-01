
class LargestNumberArray{
    public static void main(String[] args) {
        int arr[] = new int[]{5,8,20,10};
        System.out.println(getLargest(arr));

        int arr1[] = new int[]{10,10,10};

        System.out.println(getLargest(arr1));
    }

    public static int getLargest(int arr[]){
        int len = arr.length;
        int index = 0;
        for(int i = 1;i<len; i++){
            if(arr[i]>arr[index]){
                index = i;
            }
        }
        return index;
    }
}