function sortDescending(arr) {
    return arr.sort(function(a, b) {
        return b - a;
    });
}

const inputArray = [5, 2, 9, 1, 5, 6, 3, 8];
const sortedArray = sortDescending(inputArray);

console.log(sortedArray);
