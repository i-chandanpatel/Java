import java.util.*;

class Matrix {
    public static void main(String[] args) {
	int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        //int arr[][] = new int[3][3];
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Enter elements of Matrix: ");
        //for(int i = 0; i < 3; i++) {
        //    for(int j = 0; j < 3; j++) {
        //        arr[i][j] = sc.nextInt();
        //    }
        //}

        System.out.println("Elements of Matrix are: ");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int[][] transpose = new int[3][3];
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                transpose[j][i] = arr[i][j];
            }
        }

        System.out.println("Elements of transpose Matrix are: ");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int[][] lowerTriangular = new int[3][3];
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if (i >= j) {
                    lowerTriangular[i][j] = arr[i][j];
                } else {
                    lowerTriangular[i][j] = 0;
                }
            }
        }

        System.out.println("Elements of Lower Triangular Matrix are: ");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(lowerTriangular[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int[][] upperTriangular = new int[3][3];
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if (i <= j) {
                    upperTriangular[i][j] = arr[i][j];
                } else {
                    upperTriangular[i][j] = 0;
                }
            }
        }

        System.out.println("Elements of Upper Triangular Matrix are: ");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(upperTriangular[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();


	System.out.println("Sum of Matrix: ");
	System.out.println("Matrix 1");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

	System.out.println("Matrix 2");
	for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(upperTriangular[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

	int sum[][]=new int[3][3];
	for(int i=0; i<arr.length; i++){
	   for(int j=0; j<arr.length; j++){
		sum[i][j]=arr[i][j]+upperTriangular[i][j];
	   }
	}


	System.out.println("Matrix of sum");
	for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
	


	int[][] result = new int[3][3];

        for(int i = 0; i < 3; i++) {           
            for(int j = 0; j < 3; j++) {  
                result[i][j] = 0;
                for(int k = 0; k < 3; k++) {
                    result[i][j] += arr[i][k] * sum[k][j];
                }
            }
        }

        System.out.println("Product of the two matrices:");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
	
	
        //sc.close();
    }
}
