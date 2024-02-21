function isPalindrome(str) {
    let elements = str.split("");
    let rt = elements.length-1;
    let lt = 0;

    while(lt < rt) {
        if(!(elements[lt] === elements[rt])) {
            return false;
        }
        lt ++;
        rt --;
    }
    return true;
}

console.log(isPalindrome("acbca"));