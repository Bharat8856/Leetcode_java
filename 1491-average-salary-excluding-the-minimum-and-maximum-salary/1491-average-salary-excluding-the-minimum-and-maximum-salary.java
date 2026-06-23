class Solution {
    public double average(int[] salary) {
        int sum = 0;
        int min = salary[0];
        int max = salary[0];
        for (int su : salary) {
            sum += su;
            min = Math.min(min, su);
            max = Math.max(max, su);
        }

        return (double) (sum - min - max) / (salary.length - 2);
    }
}