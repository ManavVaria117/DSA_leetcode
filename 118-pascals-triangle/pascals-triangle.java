class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        if(numRows <= 0 ){
            return triangle;
        }

        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        for(int i = 1 ; i < numRows ; i++){
            List<Integer> prev = triangle.get(i - 1);
            List<Integer> current = new ArrayList<>();

            current.add(1);

            for(int j = 1; j < i ; j++){
                int sum = prev.get(j-1) + prev.get(j);
                current.add(sum);
            }

            current.add(1);

            triangle.add(current);
        }
        return triangle;
    }
}