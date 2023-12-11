function removeDupes(nums) {
    var set = new Set();
    for(let i =0; i<nums.length;i++){
        set.add(nums[i]);
    }
    return set;
}

console.log(removeDupes([1,1,1,99,1,2,3,99]));