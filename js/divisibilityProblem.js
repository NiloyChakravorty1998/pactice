function divisibilityProblem () {
    const testCaseArr = [85, 21,200,41];
    let num = "";
    testCaseArr.forEach((i) => {
        num = num + (i%10);
    })
    console.log(num);
    if(num % 5 == 0){
        console.log("Is divisible ");
    }else{
        console.log("Not divisible ");
    }
}

divisibilityProblem();