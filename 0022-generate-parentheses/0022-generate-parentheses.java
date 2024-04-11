
class Solution {
    
    public void solve(String s,int op,int cl,List<String> res){
        if(op > cl){
            return;
        }
        if(op > 0){
            solve(s+"(",op-1,cl,res);
        }
        if(cl > 0){
            solve(s+")",op,cl-1,res);
        }
        if(op == 0 && cl==0){
            res.add(s);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        solve("",n,n,res);
        return res;
    }
}