package Array_Data_Structure;
public class FindMissing {
    public static void printArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    } 
    public static int findMissing(int[] arr){
        int n = arr.length + 1;
        int sum = n * (n + 1)/2;
        for(int num : arr){
            sum = sum - num;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,6,8,2,4,7};
        System.out.println(findMissing(arr));
    }
}
