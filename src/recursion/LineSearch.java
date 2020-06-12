package recursion;

public class LineSearch {
    public static void main(String[] args) {
      /*  int[] arr = {2,5,6,4,1,3};
        int search = 6;*/
       /* for (int i = 0; i < arr.length; i++){
            if(arr[i] == search){
                System.out.println("found" + i);
                return;
            }
        }*/


        int[] arr2 = {5,7,10,15,20,25,27,31};

        int[] arr = {2,5,6,8,3,4,1,20,15,13};
        ///bubbleSort(arr);
        System.out.println(RecursiveBinarySearch(arr2, arr2.length-1 , 0, 4));


       /// bubbleSort(arr);
      /* for (int i = 0; i < arr.length; i++){
           System.out.println(arr[i]);
       }*/

        int search = 5;
        int start = 0;
        boolean toggle = true;
        int end = arr2.length - 1;
       /* while (toggle){
            int mid = (start + end) / 2;
            System.out.println(mid);
            if(arr2[mid] == search){
                System.out.println(mid);
                toggle = false;
            }else {
                if(arr2[mid] < search){
                    start = mid + 1;
                }else {
                    end = mid - 1;
                }

            }
        }*/




    }

    public static  void bubbleSort(int[] arr){
        boolean toggle = false;
        while (!toggle){
            toggle = true;
            for (int i = 1; i < arr.length; i++){
                if(arr[i-1] > arr[i]){
                    int tmp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = tmp;
                    toggle = false;
                }
            }
        }
    }


    public static int RecursiveBinarySearch(int[] arr, int endIndex, int startIndex, int ElementToFind){
        if(endIndex >= startIndex){
            int middleIndex = startIndex + (endIndex - startIndex) / 2;
            if(arr[middleIndex] == ElementToFind){
                return middleIndex;
            }
            if(arr[middleIndex] > ElementToFind){
                return  RecursiveBinarySearch(arr, middleIndex - 1, startIndex, ElementToFind);
            }else {
                return  RecursiveBinarySearch(arr, middleIndex, middleIndex + 1, ElementToFind);
            }
        }
        return -1;

    }


}
