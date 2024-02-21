function findPeakElement(numbers) {
    let peak = 0;
    for(let i =1; i<numbers.length - 1; i++) {
        let lt = numbers[i-1];
        let rt = numbers[i+1];
        let center = numbers[i];

        if(center > lt && center > rt && center > peak) {
            peak = center;
        }
    }

    return peak;
}

console.log(findPeakElement([1,10,9]))