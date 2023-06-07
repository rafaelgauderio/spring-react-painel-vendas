export const numberFormat = (value: number, precision: number) => {
    let factor = Math.pow(10, precision || 0);
    return Math.round(value * factor) /factor;
}