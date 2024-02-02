package pl.kacper_malajkat.two_pointers;

/*
    Given a string s, return true if it is a palindrome, or false otherwise.

    T: O(N)
    S: O(N)
*/
class ValidPalindrome {

    static boolean solution(String s) {
        int l = 0, r = s.length() - 1;

        while (l < r) {

            char start = s.charAt(l);
            char end = s.charAt(r);

            if (!Character.isLetterOrDigit(start)) {
                l++;
                continue;
            }

            if (!Character.isLetterOrDigit(end)) {
                r--;
                continue;
            }

            if (Character.toLowerCase(start) != Character.toLowerCase(end)) return false;

            l++;
            r--;
        }

        return true;
    }

}
