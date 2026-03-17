class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        unordered_map<int, int> freq;
        // Step 1: Count frequency
        for (int num : nums) {
            freq[num]++;
        }
        // Step 2: Create buckets
        vector<vector<int>> bucket(nums.size() + 1);
        // Step 3: Fill buckets
        for (auto it : freq) {
            int num = it.first;
            int count = it.second;
            bucket[count].push_back(num);
        }
        // Step 4: Get top k elements
        vector<int> result;
        for (int i = bucket.size() - 1; i >= 0 && result.size() < k; i--) {
            for (int num : bucket[i]) {
                result.push_back(num);
                if (result.size() == k) return result;
            }
        }
        return result;
    }
};