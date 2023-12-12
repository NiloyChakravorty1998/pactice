function findMinMax(nums) {
    var min = 0, max = 0;
    for(let i = 0; i<nums.length; i++) {
        if(nums[i] >= max) {
            max = nums[i];
        }
        if(nums[i] <= min) {
            min = nums[i];
        }
    }
    var result = [];
    result.push("Min : "+ min);
    result.push("Max : "+ max);
    return result;
}

const res = findMinMax([1,2,99,26,88,-1,0]);
res.forEach(element => console.log(element));