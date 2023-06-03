public class medianOfTwoSortedArray {
    //for same size
  static int find(int[] first, int[] second, int start_f,int start_s, int end_f, int end_s) 
    { 
        if(end_f - start_f == 1){
            int x = Math.max(first[start_f],second[start_s]);
            int y = Math.min(first[end_f],second[end_s]);
            return (x+y)/2;
        }
        int m1 = median(first, start_f, end_f);
        int m2 = median(second, start_s, end_s);
        if(m1 == m2){
            return m1;
        }
        else if(m1 < m2){
            //return the first array from (start_f + end_f + 1)/2 to last index and second from first index to (start_s + end_s + 1)/2
            return find(first, second, (start_f + end_f + 1)/2, start_s, end_f, (start_s + end_s + 1)/2);
        }
        else{
            //return the first array from first index to (start_f + end_f + 1)/2 and second from (start_s + end_s + 1)/2 to last index
            return find(first, second, start_f, (start_s + end_s + 1)/2, (start_f + end_f + 1)/2, end_s);
        }
    } 
  
    static int median(int[] array, int start, int end) 
    { 
        int n = end - start + 1; 
        if (n % 2 == 0) { 
            return (array[start + (n / 2)]+ array[start + (n / 2 - 1)]) / 2; 
        } 
        else { 
            return array[start + n / 2]; 
        } 
    } 
  
    public static void main(String[] args) 
    { 
        int first[] = { 1, 6, 8, 10, 12 }; 
        int second[] = { 2, 3, 4, 9, 11 }; 
        int n1 = first.length; 
        int n2 = second.length; 
        if (n1 != n2) { 
            System.out.println("size not equal"); 
        } 
        else if (n1 == 0) { 
            System.out.println("Arrays are empty."); 
        } 
        else if (n1 == 1) { 
            System.out.println((first[0] + second[0]) / 2); 
        } 
        else { 
            System.out.println( 
                "Median is "
                + find(first, second, 0, 0,first.length - 1, second.length - 1)); 
        } 
    }
}

/*for different size

 *      int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1 + n2;
        int[] new_arr = new int[n];

        int i=0, j=0, k=0;

        while (i<=n1 && j<=n2) {
            if (i == n1) {
                while(j<n2) new_arr[k++] = nums2[j++];
                break;
            } else if (j == n2) {
                while (i<n1) new_arr[k++] = nums1[i++];
                break;
            }

            if (nums1[i] < nums2[j]) {
                new_arr[k++] = nums1[i++];
            } else {
                new_arr[k++] = nums2[j++];
            }
        }

        if (n%2==0) return (float)(new_arr[n/2-1] + new_arr[n/2])/2;
        else return new_arr[n/2];
 */