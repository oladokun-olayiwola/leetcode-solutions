function maxLengthBetweenEqualCharacters(s: string): number {
            let newLength = -1;
            let length: number;
    for (let i = 0; i < s.length; i++) {
        for (let j = i + 1; j < s.length; j++) {
            if ( s[i] === s[j]) {
                length = j -i - 1
                if ( length > newLength )
                    newLength = length;
                }   
        }
    }
    return newLength;
};