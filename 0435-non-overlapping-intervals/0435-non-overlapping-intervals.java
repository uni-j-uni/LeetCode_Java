class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (start, end) -> start[1] - end[1]);
        int end = intervals[0][1];
        int overLap = 0;

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= end) {
                end = intervals[i][1];
            }
            else overLap++;
        }

        return overLap;
    }
}