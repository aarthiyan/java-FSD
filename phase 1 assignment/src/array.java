import java.util.*;
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("Enter Array elements");
		for(int i=0;i<5;i++){
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<5;i++){
			System.out.print(arr[i] + "  ");
		}

		System.out.println("Enter 2D Array elements");
		int[][] arr2 = new int[3][2];
		for(int i=0;i<3;i++){
			for(int j=0;j<2;j++){
				arr2[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<2;j++){
				System.out.print(arr2[i][j] + "  ");
			}
			System.out.print("\n");
		}
	}
}	