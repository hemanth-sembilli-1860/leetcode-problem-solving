import java.util.*;

class Solution {
    public boolean parseBoolExpr(String expression) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == ')') {
                List<Character> list = new ArrayList<>();
                while (!stack.isEmpty() && stack.peek() != '(') {
                    list.add(stack.pop());
                }
                stack.pop(); // pop '('
                char op = stack.pop(); // pop operator
                char res = evaluate(op, list);
                stack.push(res);
            } else if (c != ',') {
                stack.push(c);
            }
        }
        boolean finalResult = stack.peek() == 't';

        if (false) {
            Stack<Boolean> st = new Stack<>();
            Stack<Character> sd = new Stack<>();
            int n = expression.length();
            for (int i = 0;i<n;i++){
                char ch = expression.charAt(i);
                if (ch == 'f' || ch == 't'){
                    if (ch == 'f'){
                        st.push(false);
                    }
                    else if (ch == 't'){
                        st.push(true);
                    }
                }
                else if (ch == '&' || ch == '|' || ch == '!'){
                    sd.push(ch);
                }
            }
            while (!st.isEmpty() && !sd.isEmpty()){
                boolean c1 = st.pop();
                char c2 = sd.pop();
                if (c2 == '&'){
                    if (!st.isEmpty()){
                        boolean c3 = st.pop();
                        if ((c1 == false && c3==true) || (c1==true && c3==false)){
                        st.push(false&true);
                    }
                    else if (c1==false && c3==false){
                        st.push(false&false);
                    }
                    else if (c1==true && c3==true){
                        st.push(true&true);
                    }
                    }
                    else {
                        st.push(c1);
                    }
                }
                else if (c2 == '|'){
                    if (!st.isEmpty()){
                        boolean c3 = st.pop();
                        if ((c1 == false && c3==true) || (c1==true && c3==false)){
                        st.push(false|true);
                    }
                    else if (c1==false && c3==false){
                        st.push(false|false);
                    }
                    else if (c1==true && c3==true){
                        st.push(true|true);
                    }
                    }
                    else {
                        st.push(c1);
                    }
                }
                else if (c2 == '!'){
                    st.push(!c1);
                }
            }
            if (st.pop().equals(false)){
                return false;
            }
            else {
                return true;
            }
        }

        return finalResult;
    }

    private char evaluate(char op, List<Character> list) {
        if (op == '!') {
            return list.get(0) == 't' ? 'f' : 't';
        }
        if (op == '&') {
            for (char ch : list) {
                if (ch == 'f') return 'f';
            }
            return 't';
        }
        if (op == '|') {
            for (char ch : list) {
                if (ch == 't') return 't';
            }
            return 'f';
        }
        return 't';
    }
}