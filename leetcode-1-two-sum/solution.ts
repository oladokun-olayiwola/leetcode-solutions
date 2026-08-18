function twoSum(nums: number[], target: number): number[] {
    const numMap = new Map<number, number>();

    for (let i = 0; i < nums.length; i++) {
        const num = target - nums[i];

        if (numMap.has(num)) {
            return [numMap.get(num)!, i];
        } else {
            numMap.set(nums[i], i);
        }
    }

    return [];
}