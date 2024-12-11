package easy;


class commonPrefix{
    public static void main(String []args){
        Solution sol = new Solution();
        System.out.println(
            sol.longestCommonPrefix(new String[] {"flower","flow","flight"})
        );
    }
}


class Solution {
    public String longestCommonPrefix(String[] strs) {
    String commonPrefix = strs[0];
    for(int i = 0; i< strs.length; i++)
    {
        while(strs[i+1].indexOf(commonPrefix)!=0){   
            commonPrefix = commonPrefix.substring(0, commonPrefix.length()-1) ;     
        }
    }
    return commonPrefix; 
 }
}