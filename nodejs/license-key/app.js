/**
 * Format an unformatted license key according to the specified block size
 *
 * @param {string} S unformatted license key
 * @param {number} K block size
 * @returns {string} formatted license key
 */
function solution(S, K) {
  /* Make array of all characters, while converting letters to uppercase */
  let chars = S.toUpperCase().split('');

  /* Remove any dashes from array of characters */
  for (let i = 0; i < chars.length; i++) {
    if (chars[i] === '-') {
      chars.splice(i, 1);
      i--;
    }
  }

  /* Make blocks of K or less characters, starting from the end */
  let count = 0;
  let blocks = [];
  for (let i = chars.length - 1; i >= 0; i--) {
    count++;
    if (count === K || i === 0) {
      blocks.push(chars.splice(i, count));
      count = 0;
    }
  }

  /* Make character blocks into strings and combine the strings with hyphens */
  let result = '';
  for (let i = blocks.length - 1; i >= 0; i--) {
    if (result === '')
      result = result.concat(blocks[i].join(''));
    else
      result = result.concat(`-${blocks[i].join('')}`);
  }

  return result;
}

console.log(solution('2-4A0r7-4k', 4));
console.log(solution('2-4A0r7-4k', 3));
console.log(solution('2-4A0r7-4k', 20));
console.log(solution('r', 1));
console.log(solution('ra0', 1));
console.log(solution('r-----------a------000bbBB', 2));
console.log(solution('---a', 10));