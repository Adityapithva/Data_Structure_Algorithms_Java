package Sorting_Algorithms;
public class InsertionSort {
    public void printArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    } 
    public void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args) {
        InsertionSort is = new InsertionSort();
        int[] arr = {5,1,2,9,10};
        is.printArray(arr);
        is.insertionSort(arr);
        is.printArray(arr);
    }
}
