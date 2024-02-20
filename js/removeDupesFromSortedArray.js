function removeDupesFromSortedArray(array) {
    let result = [];
    if(array[0] !== array[1]) {
        result.push(array[0]);
    }
    if(array[array.length-1] !== array[array.length-2]) {
        result.push(array[array.length-1]);
    }
    for(let i =1; i<array.length-1; i++) {
       let current = array[i];
       let prev = array[i-1];
       let next = array[i+1];
       if(current!==prev && current!==next){
        result.push(current);
       }
    }
    result.sort((a, b) => a-b)
    console.log(result);
}

removeDupesFromSortedArray([0,1,1,1,2,3,3,5]);