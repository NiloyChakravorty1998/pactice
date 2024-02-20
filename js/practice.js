//fibo
function printFibonacci(limit) {
    var first = 0;
    var second = 1;
    for (let i = 0; i < limit; i++) {
        console.log(first);
        var next = first + second;
        first = second;
        second = next;
    }

}
//printFibonacci(10);

//missing and reapeating
function findMissingAndReapeating(numbers){
    var missing = [];
    for(let i = 0; i < numbers.length -1; i++) {
        var number = numbers[i];
        for(let j= number+1; j< numbers[i+1];i++) {
            missing.push(j);
            
        }
    }
    console.log(missing);
}

findMissingAndReapeating([0,2,3,4,5,7]);