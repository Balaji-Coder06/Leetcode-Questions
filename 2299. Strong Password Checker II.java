class Solution {
    public boolean strongPasswordCheckerII(String password) {
        boolean l = false;
        boolean u = false;
        boolean n = false;
        boolean s = false;
        if (password.length() < 8) return false;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isLowerCase(ch)) l = true;
            else if (Character.isUpperCase(ch)) u = true;
            else if (Character.isDigit(ch)) n = true;
            else s = true;
            if (i > 0 && password.charAt(i) == password.charAt(i - 1))
                return false;
        }
        return (l && u && n && s);
    }
}
