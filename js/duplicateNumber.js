function getDupes(nums) {
    for(let i =0; i<nums.length-1;i++){
        for(let j =i+1; j<nums.length;j++){
            if(nums[i] == nums[j]){
                console.log(` Dupe of ${nums[i]} at pos : ${j}`);
                return;
            }
        }
    }
}

getDupes([99,1,2,3,99,99,3]);