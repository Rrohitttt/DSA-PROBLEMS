class Solution {
    public String frequencySort(String s) {
    int[] hash=new int[128];
    for(char ch:s.toCharArray()) hash[ch]++;
    StringBuilder ans=new StringBuilder();
    while(ans.length()<s.length()){
        int max=0;
        char maxchar=0;
        for(int i=0;i<128;i++){
            if(hash[i]> max){
                max=hash[i];
                maxchar=(char) i;
            }
        }
        for(int i=0;i<max;i++){
            ans.append(maxchar);
        }
        hash[maxchar]=0;
    }
    return ans.toString();
    }
}