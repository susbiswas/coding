public class SecondLargestArray {
    public static void main(String[] args) {
        int arr[] = new int[]{5,8,20,10};
        System.out.println(getSecondLargest(arr));

        int arr1[] = new int[]{10,10,10};
        System.out.println(getSecondLargest(arr1));


        System.out.println(getSecondLargestEfficient(arr));

        System.out.println(getSecondLargestEfficient(arr1));
    }

    public static int getSecondLargest(int arr[]){
        int largest = getLargest(arr);
        int res = -1;
        for(int i = 0; i < arr.length ; i++){
            if(arr[i] != arr[largest]){
                if(res == -1)
                    res = i;
                else if(arr[i] > arr[res]){
                    res = i;
                }
            }

        }
        return res;
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

    /**
     *  
     * Efficient approach 
     * a[i] > a[largest] => res = largest and largest = i
     * a[i] == a[largest] => ignore
     * a[i] < a[largest] =>
     *  a[res]<a[i] => res = i
     *  a[res] = a[i]=> ignore
     *  res == -1 => res = i
     * 
     * */ 

    public static int getSecondLargestEfficient(int arr[]){
        int res = -1;
        int largest = 0;
        for(int i = 0; i < arr.length;i++){
            if(arr[i] > arr[largest]){
                res = largest;
                largest = i;
            }else if(arr[i] != arr[largest]){
                if(res == -1 || arr[res]< arr[i]){
                    res = i;
                }
            }
        }
        return res;
    }
}
