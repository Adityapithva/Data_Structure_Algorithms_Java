package Array_Data_Structure;
public class FindMin {
    public int findMinimum(int[] arr){
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {5,9,3,15,1,2};
        FindMin obj = new FindMin();
        System.out.print(obj.findMinimum(arr));
    }
}
