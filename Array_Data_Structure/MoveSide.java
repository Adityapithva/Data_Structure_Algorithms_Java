package Array_Data_Structure;
public class MoveSide {
    public static void printArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    } 
    public void moveZeros(int[] arr,int n){
        int j  = 0; // focus on zeroth elements
        for(int i = 0; i < n; i++){ // focus on non zero elements
            if(arr[i] != 0 && arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[j] != 0){
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {8,1,0,2,0,3};
        printArray(arr);
        MoveSide obj = new MoveSide();
        obj.moveZeros(arr, arr.length);
        printArray(arr);
    }
}
