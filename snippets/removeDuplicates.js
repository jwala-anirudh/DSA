/** Remove duplicates from the given array

Given Array : 1 2 2 4 5 4 7 8 7 3 6

Resulted Array after removing : 1 2 4 5 7 8 3 6 */
const removedDuplicates = (inputArr) => {
  const freq = {};
  const outputArr = [];

  for (let val of inputArr) {
    if (freq[val]) {
      freq[val] = freq[val] + 1;
    } else {
      freq[val] = 1;
    }
  }

  for (const key in freq) {
    if (freq[key] >= 1) {
      outputArr.push(key);
    }
  }

  return outputArr;
};

const removedDuplicatesMap = (inputArr) => {
  const freq = new Map();
  const outputArr = [];

  for (let val of inputArr) {
    if (freq.get(val)) {
      freq.set(val, freq.get(val) + 1);
    } else {
      freq.set(val, 1);
    }
  }

  for (const key of freq.keys()) {
    if (freq.get(key) >= 1) {
      outputArr.push(key);
    }
  }

  return outputArr;
};

const arr = [1, 2, 2, 4, 5, 4, 7, 8, 7, 3, 6];
console.log(removedDuplicates(arr));
console.log(removedDuplicatesMap(arr));
