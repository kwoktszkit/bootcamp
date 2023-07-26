class Solution {
  public String reversePrefix(String word, char ch) {

    int idx = word.indexOf(ch);
    if (idx == -1) {
      return word;

    }

    char[] arr = word.toCharArray();
    char temp;
    int strLength = idx + 1;

    for (int i = 0; i < strLength; i++) {
      if (i > strLength / 2 - 1) {
        break;
      }
      temp = arr[i];
      arr[i] = arr[strLength - 1 - i];
      arr[strLength - 1 - i] = temp;

    }

    return String.valueOf(arr);

  }
}