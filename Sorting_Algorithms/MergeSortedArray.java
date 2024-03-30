package Sorting_Algorithms;
public class MergeSortedArray {
    public void printArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    } 
    public int[] mergeArray(int[] arr1,int[] arr2,int n,int m){
        int[] result = new int[n + m];
        int i=0,j=0,k=0;
        while(i < n && j < m){
            if(arr1[i] <= arr2[j]){
                result[k] = arr1[i];
                i++;
                k++;
            }else{
                result[k] = arr2[j];
                j++;
                k++;
            }
        }
        while(i < n){
            result[k] = arr1[i];
            i++;
            k++;
        }
        while(j < m){
            result[k] = arr2[j];
            j++;
            k++;
        }
        return result;
    }
    public static void main(String[] args) {
        MergeSortedArray msa = new MergeSortedArray();
        int[] arr1 = {0,1,8,10};
        int[] arr2 = {2,4,11,15,20};
        msa.printArray(arr1);
        msa.printArray(arr2);
        int[] ans = msa.mergeArray(arr1, arr2, arr1.length, arr2.length);
        msa.printArray(ans);
    }
}
