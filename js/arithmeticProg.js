function isInAP(array) {
    var flag = false;

    // Sort the array numerically
    array.sort((a, b) => a - b);

    var cd = array[1] - array[0];
    console.log("cd: " + cd);

    for (let i = 0; i < array.length - 1; i++) {
        if (cd === (array[i + 1] - array[i])) {
            console.log(array[i + 1] - array[i]);
            flag = true;
        } else {
            flag = false;
            return flag;
        }
    }
    return true;
}

console.log(isInAP([1, 2, 3]));    // true
console.log(isInAP([1, 2, 8]));    // false
console.log(isInAP([19, 28, 10]));  // true
