package easy;
import java.util.HashSet;

public class CandySwap {
    public static void main(String[] args){

    }

    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0; 
        int sumB = 0; 
        HashSet<Integer> set = new HashSet<>();
        for(int size: aliceSizes){
            sumA += size;
        }
        
        for(int size: bobSizes){
            set.add(size);
            sumB += size;
        }
        
        int replacement = (sumB-sumA)/2;
         for (int x: aliceSizes){
            if(set.contains(replacement+x)){
                return new int[]{x, x+replacement};
            }
            
        }
    return new int[]{};
    }
    
}
