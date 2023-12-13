function getMissingAndRepeating(nums) {
    var missing = 0, repeating = 0;
    var res = [];
    nums.sort((a, b) => a - b);

    for (let i = 0; i < nums.length - 1; i++) {
        let e = nums[i];
        for (let j = i + 1; j < nums.length; j++) {
            if (e === nums[j]) repeating = nums[j];
        }
    }

    for (let i = 0; i < nums.length - 1; i++) {
        let e = nums[i];
        for (let j = e + 1; j < nums[i + 1]; j++) {
            missing = j;
        }
    }
    
    res.push(missing);
    res.push(repeating);

    res.forEach(e => console.log(e));
}

getMissingAndRepeating([4,3,3,1]);


//1,4 