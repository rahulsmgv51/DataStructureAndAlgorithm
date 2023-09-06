
You are given an array of n numbers, which represents n different types of denominations of coins. You are given a target 'amt', you need to count the number of permutations of the coins possible that sum up to the given target amount, i.e. in how many ways you can pay 'amt' using the available denominations.

Note 1: You can consider that you are having infinite supply of each coin denomination i.e. the same coin denomination can be used for many installments in payment of "amt".

Note 2: You are required to find the count of distinct permutations. For eg, 2 + 2 + 3 = 7 and 2 + 3 + 2 = 7 and 3 + 2 + 2 = 7 are different permutations, hence their count will be 3. However, we cannot swap coin value = 2 with other coin value = 2 only to form another permutation, as they will not form distinct permutations.

Example, to pay the amount = 7 using coins {2, 3, 5, 6}, there are five coin permutations possible: (2, 5), (5, 2), (2, 2, 3), (2, 3, 2) and (3, 2, 2). Hence the answer is 5.