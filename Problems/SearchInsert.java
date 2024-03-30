package Problems;
public class SearchInsert {
    public static int searchInser(int[] arr,int target){
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] arr = {1,10,20,47,59,65,75,88,99};
        System.out.println(searchInser(arr, 2));
    }
}
