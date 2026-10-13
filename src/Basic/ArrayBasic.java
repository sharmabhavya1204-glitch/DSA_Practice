package Basic;
import java.util.Scanner;

public class ArrayBasic {
    public static void main(StringBasic args[]) {
        int sum=0;
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        /*Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));*/

        /*for(int i=n;i<=arr.length;i++){
            System.out.println(arr.length);
        }
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);

        int count=0;

        for(int i=0;i<arr.length;i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }

        }
        System.out.println(count);
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);

        int target=20;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("Found");
            }
        }

        //reverse an array
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }*/
        // two pointers
        /*int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            i++;
            j--;
        }
        for(int k = 0; k < arr.length; k++){
            System.out.println(arr[k]);
        }*/
       /* for(int i=0;i<arr.length;i++){
            sum =sum+arr[i];

        }
        double avg = sum/(double)arr.length;
        System.out.println(avg);*/


        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    System.out.print("dulpicate");
                }
            }
        }





    }
}
