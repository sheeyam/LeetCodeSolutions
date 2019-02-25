class Solution {
    func twoSum(_ nums: [Int], _ target: Int) -> [Int] {
        var finalArray: [Int] = []
        for i in 0..<nums.count {
            for j in i+1..<nums.count {
                if nums[j] + nums[i] == target {
                    finalArray = [i, j]
                }     
            }
        }
        return finalArray
    }
}
