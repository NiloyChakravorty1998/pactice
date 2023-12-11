function countLetters(string) {
    var resMap = [];
    for(let i =0; i<string.length;i++){
        var letter = string.charAt(i);
        resMap.push(letter);
    }
    resMap.sort();

    for(let i = 0; i<resMap.length; i++){
        var element = resMap[i];
        var count =0;
        for(let j = 0; j < resMap.length; j++){
            if(element === resMap[j]){
                count++;
            }
        }
        if(count > 1) i++;
        console.log(`Count of letter : ${element} is : ${count}`)
    }
}

countLetters("capgemini");