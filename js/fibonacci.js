function getFibonacci(limit){
    var first =0;
    var second =1;

    for(let i =0; i<=limit; i++){
        console.log(first);
        var next = first + second;
        first = second;
        second = next;
    }
}

getFibonacci(10);