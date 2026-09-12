function isPalindrome(x: number): boolean {
    let digits = Array.from(String(x), Number);
    let palindrome = true;

    for ( let i = 0; i < digits.length; i++ ) {
        if (digits[i] !== digits[digits.length - i - 1]) {         
            palindrome = false;
            if(digits[i] === digits.length / 2) break;
        }
    }
    return palindrome
    };