package exercise.pkg1;
import java.util.Scanner;
import java.util.Arrays;

public class exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap so luong phan tu mang: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        Arrays.sort(arr);
        
        System.out.println("Mảng sau khi sắp xếp tăng dần: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
        scanner.close();
    }
}
