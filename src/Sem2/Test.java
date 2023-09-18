package Sem2;

public class Test {
    public static void main(String[] args) {
//        char c1 = 'a';
//        char c2 = 'b';
//        int n = 6;
//        System.out.println(print(c1, c2, n));

//        System.out.println(reduction("aaabccffffdhhhbba"));
    }

    private static String print(char a, char b, int c) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < c / 2; i++) {
            sb.append(a);
            sb.append(b);
        }
        return sb.toString();
    }

    private static String reduction(String str) {
//        Напишите метод, который сжимает строку.
//        Пример: вход aaaabbbcdd.
//        Результат: a4b3cd2 aaabccffffd
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                if (count == 1) {
                    sb.append(str.charAt(i - 1));
                } else {
                    sb.append(str.charAt(i - 1)).append(count);
                }
                count = 1;
            }
        }
        if (count == 1) {
            sb.append(str.charAt(str.length() - 1));
        } else {
            sb.append(str.charAt(str.length() - 1)).append(count);
        }
        return sb.toString();
    }

}
