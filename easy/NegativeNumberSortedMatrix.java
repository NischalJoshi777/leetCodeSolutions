package easy;

public class NegativeNumberSortedMatrix {

    public static void main(String[] args) {
        int[][] grid = { {4,3,2,-1}, {3,2,1,-1}, {1,1,-1,-2}, {-1,-1,-2,-3} };
        System.out.println(countNegatives(grid));  // Using optimized method
        System.out.println(countNegativesBinarySearch(grid)); // Using binary search method
    }

    //optimized searching
    static int countNegatives(int[][] grid){
        int count = 0;
        int row = grid.length - 1;
        int col = grid[0].length -1; 
        int currentRow = row; 
        int currentColumn = 0; 
        while(currentRow >=0 && currentColumn <= col){
            if(grid[currentRow][currentColumn]< 0){
                count += col-currentColumn+1;
                currentRow--;
            } else {
                currentColumn++;
            }
        }
        return count;
    }
        
    // using binary search
    static int countNegativesBinarySearch (int[][] grid) {
    int count = 0;
     for(int i = 0; i < grid.length; i++){
        count += binarySearch(grid[i]);
     }
     return count;
    }

    static int binarySearch(int[] arr) {
        int start = 0;
        int len = arr.length;
        int end = len - 1; 
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] >= 0){
                start = mid+1;
            } else {
              end = mid-1;  
            }
        }
        return len-start;
    }
    
}
