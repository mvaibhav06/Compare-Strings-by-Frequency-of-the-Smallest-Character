class Solution {
    public int frequency(String s){
        char[] temp = s.toCharArray();
        Arrays.sort(temp);
        char ch = temp[0];
        int out = 1;
        for(int i=1; i<temp.length; i++){
            if(temp[i]==ch){
                out++;
            }else{
                break;
            }
        }
        return out;
    }
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] que = new int[queries.length];
        int[] wor = new int[words.length];

        for(int i=0; i<que.length; i++){
            que[i] = frequency(queries[i]);
        }
        for(int i=0; i<wor.length; i++){
            wor[i] = frequency(words[i]);
        }

        int[] out = new int[que.length];
        for(int i=0; i<out.length; i++){
            int out1 = 0;
            for(int j=0; j<wor.length; j++){
                if(que[i] < wor[j]){
                    out1++;
                }
            }
            out[i] = out1;
        }
        return out;
    }
}
