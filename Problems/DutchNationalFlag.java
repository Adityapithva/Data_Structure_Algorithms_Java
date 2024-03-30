package Problems;
public class DutchNationalFlag {
    public int[] count(int[] arr){
        int zero=0,one=0,two=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zero++;
            }
            else if(arr[i]==1){
                one++;
            }
            else if(arr[i]==2){
                two++;
            }
        }
        int[] z = new int[zero];
        int[] o = new int[one];
        int[] t = new int[two];
        int x=0,y=0,e=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                z[x] = arr[i];
                x++;
            }
            else if(arr[i]==1){
                o[y] = arr[i];
                y++;
            }
            else if(arr[i]==2){
                t[e] = arr[i];
                e++;
            }
        }
        int[] result = new int[z.length + o.length + t.length]; 
        int a = 0;
        for(int i = 0; i < z.length; i++){
            result[a] = z[i];
            a++;
        }

        // a++;
        for(int i = 0; i < o.length; i++){
            result[a] = o[i];
            a++;
        }
        // a++;
        for(int i = 0; i < t.length; i++){
            result[a] = t[i];
            a++;
        }
        return result;
    }
    public void printArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    } 
    public static void main(String[] args) {
        int[] arr = {1,0,2,2,0,1,2};
        DutchNationalFlag obj = new DutchNationalFlag();
        int[] result = obj.count(arr);
        obj.printArray(result);
    }
}
