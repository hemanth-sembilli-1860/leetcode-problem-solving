class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        String s = "()";
        generate(n,0,0,new StringBuilder(),list);
        return list;
    }
    public static void generate(int n,int op,int cl,StringBuilder sb,List<String> list){
        if (cl == n){
            list.add(sb.toString());
            return;
        }
        if (op!=n){
            sb.append('(');
            generate(n,op+1,cl,sb,list);
            sb.deleteCharAt(sb.length()-1);
        }
        if (cl!=op){
            sb.append(')');
            generate(n,op,cl+1,sb,list);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}