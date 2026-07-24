class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
         int nge[] = new int[100001];
        Stack<Integer> st = new Stack<>();
        for (int i = m-1;i>=0;i--){
            while (!st.isEmpty() && nums2[i]>=st.peek()){
                st.pop();
            }
            if (st.isEmpty()){
                nge[nums2[i]] = -1;
            }
            else {
                nge[nums2[i]] = st.peek();
            }
            st.push(nums2[i]);
        }
        for (int i = 0;i<n;i++){
            nums1[i] = nge[nums1[i]];
        }
        return nums1;
    }
}