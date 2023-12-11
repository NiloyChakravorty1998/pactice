function printPalindrome(string){
    var flag = false;
    var revStr = [];
    for(let i = string.length-1; i>=0;i--){
    revStr.push(string.charAt(i));
    }
    console.log(revStr);

    for(let i = 0; i<string.length;i++){
        if(revStr[i] === string.charAt(i)){
            flag = true;
        }
        else{
            flag = false;
            return flag;
        }
    }
    return flag;
}

console.log(printPalindrome("121"));