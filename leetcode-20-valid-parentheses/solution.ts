function isValid(s: string): boolean {
    let isValidClose = false;
    let open = [];
    const charArray = s.split('');
    let currentOpen;
    

    for ( let val of charArray) {
        if ( val === '[' || val === '{' || val === '(') {
            open.push(val);
        } else if ( val === '}' || ')' || val === ']') {

            if (open.length === 0) {
                return false;
            }

            currentOpen = open[open.length -1];
            if(currentOpen == '{' && val == '}' || currentOpen == '(' && val == ')' || currentOpen == '[' && val == ']') {
                open.pop();
                isValidClose = true;
            }else {
                return false;
            };
        }
    };

    return isValidClose && open.length === 0;
};