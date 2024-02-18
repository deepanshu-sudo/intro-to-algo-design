import java.util.Arrays;

public class CoinChange {

    public static void main(String[] args) {
        int[] coins = {1, 5, 10, 20, 50, 100}; // Coin denominations
        int amount = 46; // Example amount

        int minCoins = minCoins(coins, amount);

        System.out.println("Minimum number of coins needed for " + amount + " cents: " + minCoins);
    }

    public static int minCoins(int[] coins, int amount) {
        int[] minCoinsArray = new int[amount + 1];
        Arrays.fill(minCoinsArray, Integer.MAX_VALUE);

        // Base case: 0 coins needed for amount 0
        minCoinsArray[0] = 0;

        // Iterate through each amount from 1 to the target amount.
        for (int i = 1; i <= amount; i++) {
            // Iterate through each coin denomination.
            for (int coin : coins) {
                // If the current coin is less than or equal to the current amount,
                // update the minimum number of coins needed.
                if (coin <= i) {
                    minCoinsArray[i] = Math.min(minCoinsArray[i], 1 + minCoinsArray[i - coin]);
                }
            }
        }

        // The final result is stored in minCoinsArray[amount].
        return minCoinsArray[amount];
    }
}
