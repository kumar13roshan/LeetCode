class Solution {
    public int maxDepth(String s) {
        int d=0,md=0;
        for(char c: s.toCharArray()){
            if(c=='('){
                d++;
                if(d> md) md=d;
            }else if(c==')'){
                d--;
            }
        }
       return md;
    }
}