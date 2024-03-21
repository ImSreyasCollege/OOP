import java.util.Scanner;
import java.util.Arrays;

class Search{
    public static void main(String arg[]){
		System.out.println("Name : Sreyas Satheesh\nRoll.no : 53\nTitle : Search element in array\nDate : 13/02/2024\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements : ");
        for(int i=0; i<arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("Array is : " + Arrays.toString(arr));
        System.out.print("Enter the value to search : ");
        int value = scanner.nextInt();
        int flag = 0;
        for(int i=0; i<n; i++){
            if(value == arr[i]){
                flag = 1;
                break;
            }
        }
        System.out.println("Element " + value + (flag == 0 ? " not found in the array" : " found in the array"));

        scanner.close();
    }
}