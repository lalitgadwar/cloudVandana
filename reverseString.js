function reverseWords(sentence) {
    return sentence.split(/\s+/).map(word => word.split('').reverse().join('')).join(' ');
}

const inputSentence = "This is a sunny day";
const reversedSentence = reverseWords(inputSentence);

console.log(reversedSentence);
