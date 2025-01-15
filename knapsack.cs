namespace Solution
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[] weights = new int[3] { 1, 2, 3 };
            int[] values = new int[3] { 6, 10, 12 };
            var result = GetMaxValue(weights, values, 5);
            Console.WriteLine(result);
        }

        static int GetMaxValue(int[] weights, int[] values, int capacity)
        {
            int[][] dp = new int[weights.Length + 1][];

            for (int i = 0; i < weights.Length + 1; i++)
            {
                dp[i] = new int[capacity + 1];
            }

            for (int i = 1; i < weights.Length + 1; i++)
            {
                for (int j = 1; j <= capacity; j++)
                {
                    if (weights[i - 1] <= j)
                    {
                        dp[i][j] = Math.Max(dp[i - 1][j], values[i - 1] + dp[i - 1][j - weights[i - 1]]);
                    }
                    else
                    {
                        dp[i][j] = dp[i - 1][j];
                    }
                }
            }
            return dp[weights.Length][capacity];
        }
    }
}
