function findMinDistBetweenWords(sentence, word1, word2) {
    let words = sentence.split(' ');
    let res = [];

    for(let i =0; i<words.length-1; i++) {
        if(words[i] == word1){
            for(let j = i+1; j < words.length; j++){
                if(words[j] == word2){
                    res.push(j-i);
                }
            }
        }
    }

    res.sort((a,b) => a-b);
    return res[0];
}

console.log(findMinDistBetweenWords('the work of the teacher is done','work', 'done'));