function findKthLargestAndSmallest(nums,kTh){
    nums.sort((a,b) => a-b);
    var res = [];

    if(nums.length > 0 && nums.length > kTh){
        res.push(` Min at ${kTh} pos : ` +nums[kTh-1]);
        res.push(` Max at ${kTh} pos : ` +nums[nums.length - kTh]);
    }
    return res;
}

const res = findKthLargestAndSmallest([1,99,50,0,23,199],3); //0,1,23,50,99,199
res.forEach(e => console.log(e));
