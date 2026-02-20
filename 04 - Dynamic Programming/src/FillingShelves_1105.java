

public class FillingShelves_1105 {
    public static int minHeightShelves(int[][] books, int shelfWidth) {
        return helper(books, shelfWidth, 0, 0, 0);
    }

    private static int helper(int[][] books, int shelfWidth, int i, int currentWidth, int currentHeight) {

        //no more books
        if (i == books.length) {
            return currentHeight;
        }

        int width = books[i][0];
        int height = books[i][1];

        //Put book on same shelf (if possible)
        int option1 = Integer.MAX_VALUE;

        if (currentWidth + width <= shelfWidth) {
            option1 = helper(
                    books,
                    shelfWidth,
                    i + 1,
                    currentWidth + width,
                    Math.max(currentHeight, height)
            );
        }

        //Start new shelf
        int option2 = currentHeight + helper(
                books,
                shelfWidth,
                i + 1,
                width,
                height
        );

        return Math.min(option1, option2);
    }

    public static int minHeightShelves2(int[][] books, int shelfWidth){
        int n = books.length;
        int[] dp = new int[n + 1];

        dp[0] = 0;

        for (int i = 1; i <= n; i++) {

            dp[i] = Integer.MAX_VALUE;

            int width = 0;
            int height = 0;

            for (int j = i; j >= 1; j--) {

                width += books[j - 1][0];

                if (width > shelfWidth) {
                    break;
                }

                height = Math.max(height, books[j - 1][1]);

                dp[i] = Math.min(dp[i], dp[j - 1] + height);
            }
        }

        return dp[n];
    }
}
