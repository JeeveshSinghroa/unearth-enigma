class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i=1; i<=numRows; i++) {
            result.add(func(i));
        }
        return result;
    }

    public List<Integer> func(int n) {
        List<Integer> list = new ArrayList<Integer>();
        int ans = 1;
        list.add(ans);
        for(int i=1; i<n; i++) {
            ans = ans * (n-i);
            ans = ans / i;
            list.add(ans);
        }
        return list;
    }
}