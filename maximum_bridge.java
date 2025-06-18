public class MaximumBridge {
    public static int maximumBridges(int[] a, int[] b, int n, int m) {
        if (n == 0 || m == 0) {
            return 0; 
        }
        if (a[n - 1] == b[m - 1]) {
            return 1 + maximumBridges(a, b, n - 1, m - 1);
        } else {
            return Math.max(maximumBridges(a, b, n, m - 1), maximumBridges(a, b, n - 1, m));
        }
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 2, 1, 2};
        int[] b = {1, 2, 1, 2, 2, 1, 2, 2};
        
        int result = maximumBridges(a, b, a.length, b.length);
        System.out.println(result + " ways to have bridges between a and b");
    }
}