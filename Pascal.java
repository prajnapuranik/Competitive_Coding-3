// Time Complexity : O(N^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//https://leetcode.com/problems/pascals-triangle/

class Pascal {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> master = new ArrayList<>();
        master.add(new ArrayList<Integer>());
        master.get(0).add(1);

        for(int i=1;i<numRows;i++){

            List<Integer> temp = new ArrayList<>();

            temp.add(1);

            for(int j=1; j<i;j++){
                temp.add(master.get(i-1).get(j) + master.get(i-1).get(j-1));
            }
            temp.add(1);

            master.add(temp);
        }

        return master;

    }
}