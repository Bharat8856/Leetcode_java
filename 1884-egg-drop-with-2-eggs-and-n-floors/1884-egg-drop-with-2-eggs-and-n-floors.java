class Solution {
    public int twoEggDrop(int n) {
        int drops = 0;
        int floors = 0;

        while (floors < n) {
            drops++;
            floors += drops;
        }

        return drops;
    }
}