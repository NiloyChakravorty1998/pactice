function resverseSentence(sentence){
    var resStr="";
    var sentenceArr = sentence.split(" ");

    for(let i =sentenceArr.length-1;i>=0;i--){
        resStr = resStr + sentenceArr[i];
    }

    return resStr;
}

console.log(resverseSentence("Hello World"));