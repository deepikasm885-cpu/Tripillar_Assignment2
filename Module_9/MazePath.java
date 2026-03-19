package Module_9;

    class MazePath {
        static void path(int i, int j, int n, String str) {
            if (i == n - 1 && j == n - 1) {
                System.out.println(str);
                return;
            }

            if (i < n - 1) path(i + 1, j, n, str + "D");
            if (j < n - 1) path(i, j + 1, n, str + "R");
        }

        public static void main(String[] args) {
            path(0, 0, 3, "");
        }
    }

