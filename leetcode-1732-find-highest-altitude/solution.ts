function largestAltitude(gain: number[]): number {
    let altitude: number[] = [0];
    for ( let i = 0; i < gain.length; i++) {
        altitude.push(altitude[i] + gain[i])
    }
    const highestAltitude = Math.max(...altitude);
    return highestAltitude;
};