import java.util.Arrays;

public class MergeArrays {
    
   
    public static void mergeArrays(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;
        
        
        int k = m - 1;
        for (int i = m - 1; i >= 0; i--) {
            if (X[i] != 0) {
                X[k--] = X[i];
            }
        }
        
        
        int i = n, j = 0, index = 0;
        while (i < m && j < n) {
            if (X[i] <= Y[j]) {
                X[index++] = X[i++];
            } else {
                X[index++] = Y[j++];
            }
        }
        
        
        while (j < n) {
            X[index++] = Y[j++];
        }
    }

    public static void main(String[] args) {
        int[] X = { 0, 2, 0, 3, 0, 5, 6, 0, 0 };
        int[] Y = { 1, 8, 9, 10, 15 };
        
        
        mergeArrays(X, Y);
        
       
        System.out.println("Merged array: " + Arrays.toString(X));
    }
}
