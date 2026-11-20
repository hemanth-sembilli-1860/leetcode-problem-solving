class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> st = new ArrayDeque<>();
        int sum = 0;

        for (String op : operations) {
            if (op.equals("C")) {
                sum -= st.pop();
            } 
            else if (op.equals("D")) {
                int val = st.peek() * 2;
                st.push(val);
                sum += val;
            } 
            else if (op.equals("+")) {
                int first = st.pop();
                int second = st.peek();
                int val = first + second;
                st.push(first);
                st.push(val);
                sum += val;
            } 
            else {
                int val = Integer.parseInt(op);
                st.push(val);
                sum += val;
            }
        }
        return sum;
    }
}
