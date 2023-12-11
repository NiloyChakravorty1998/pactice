function maxSum(nums){
    var max =0;
    nums.sort((a,b) => a-b);
    
    for(let i =0; i<nums.length-1;i++){
        for(let j=i+1; j<nums.length;j++){
            var check = nums[i] + nums[j];
            if(check > max ){
                max = check;
            }
        }
    }
    return max;
}

console.log(maxSum([10,10,9]));