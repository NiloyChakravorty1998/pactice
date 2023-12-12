function returnPeakElement(nums){
    var max =0;
    for(let i =1; i < nums.length-1; i++){
        var element = nums[i];
        var first = nums[i-1];
        var second = nums[i+1];

        if(element > first && element > second){
            if(max < element) max = element;
        }
    }
    return max;
}

console.log(returnPeakElement([1,1,5,4,9,2]));