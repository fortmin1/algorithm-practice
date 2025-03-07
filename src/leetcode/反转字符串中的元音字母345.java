package leetcode;

import java.util.Map;

/**
 *
 *@author jiahao
 *@since 2025/3/7 周五
 *
 */
public class 反转字符串中的元音字母345 {
    public static void main(String[] args) {
        System.out.println(reverseVowels("IceCreAm"));
    }
    public static String reverseVowels(String s) {
        char[] charArray = s.toCharArray();
        int n = charArray.length;
        int i = 0;
        int j = charArray.length - 1;
        while (i <= j) {
            char a = charArray[i];
            char b = charArray[j];
            while (i < n && !isVowel(a)) {
                i++;
            }
            if (j > 0 && !isVowel(b)) {
            }
            if (i < j) {
                swap(charArray, i, j);
                i++;
                j--;
            }
        }
        return new String(charArray);
    }

    private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
