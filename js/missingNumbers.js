function findMissingNumbers(nums) {
    nums.sort((a,b) => a-b);
    var resArr = [];
    for(let i = 0; i<nums.length-1;i++){
        var first = nums[i];
        var second = nums[i+1];
        if(first == second){

        }else{
            for(let j =first+1; j<second;j++){
                resArr.push(j);
            }
        }
        
    }
    return resArr;
}

console.log(findMissingNumbers([1,4,4,6,10]));