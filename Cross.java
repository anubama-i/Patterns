/*
Print the word with odd letters as

P         M
 R      A
   O  R
     G
  O    R
 R       A
P          M 

*/

public class Cross {
    public static void main(String[] args) {
        String str = "PROGRAM";
        int n = str.length();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i || j == n - 1 - i) {
                    System.out.print(str.charAt(i));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
