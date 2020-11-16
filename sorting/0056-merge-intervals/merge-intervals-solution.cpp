class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals) {
        if(intervals.size() == 1) 
            return intervals;
        sort(intervals.begin(), intervals.end());
        vector<vector<int>> out;
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int i = 1; i < intervals.size(); i++)
        {
            if(intervals[i][0] > end)
            {
                out.push_back({start, end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
            else
                end = std::max(end, intervals[i][1]);
        }
        out.push_back({start, end});
        return out;
    }
};
