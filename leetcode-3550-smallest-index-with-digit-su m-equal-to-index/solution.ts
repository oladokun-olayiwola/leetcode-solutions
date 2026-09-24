function smallestIndex(nums: number[]): number {
    for (let i = 0; i < nums.length; i++) {
        let n = nums[i];
        let sum = 0;
        while (n > 0) {
            let digit = n % 10;
            sum += digit;
            n = Math.floor(n / 10)
        }
        if (sum === i) {
            return i;
        }
    }
    return -1;
};