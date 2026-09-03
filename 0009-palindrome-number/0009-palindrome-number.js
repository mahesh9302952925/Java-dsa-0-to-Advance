/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    // Negative numbers and numbers ending in 0 (except 0 itself) cannot be palindromes
    if (x < 0 || (x % 10 === 0 && x !== 0)) {
        return false;
    }

    let reversedHalf = 0;
    while (x > reversedHalf) {
        reversedHalf = reversedHalf * 10 + (x % 10);
        x = Math.floor(x / 10);
    }

    // For odd-length numbers, middle digit doesn't matter (reversedHalf / 10 eliminates it)
    return x === reversedHalf || x === Math.floor(reversedHalf / 10);
};