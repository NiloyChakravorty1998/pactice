function reverseASentence(sentence) {
    var senArr = sentence.split(" ");
    var res ="";
    for(let i = senArr.length -1; i>=0;i--){
        res = res +" " +senArr[i];
    }
    return res;
}

console.log(reverseASentence("I am niloy"));