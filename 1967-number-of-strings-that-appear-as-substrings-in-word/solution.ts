function numOfStrings(patterns: string[], word: string): number {
        let numberOfStrings: number = 0;
    for ( let i = 0; i < patterns.length; i++) {
        const appears = word.includes(patterns[i])
        if (appears) {
            numberOfStrings = numberOfStrings + 1
        }
    }
            return numberOfStrings
};
