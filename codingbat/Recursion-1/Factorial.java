class Factorial {
  public static int factorial(int n) {
    // RECURSIVE SOLUTION:
    if (n == 0 || n == 1)
      return 1;

    return n * factorial(n - 1);
  }
}

// ITERATIVE SOLUTION:
/*
 * package codingbat.Recursion-1;
 * 
 * public class factorial {
 * 
 * }
 * 
 * int total = n;
 * 
 * for(int i = n; i > 0; --i){ // System.out.println(i); if((i-1) == 0) break;
 * 
 * total *= (i - 1);
 * 
 * } return total;
 */

/*
 * WRONG WAY: test case: 3 -> 3 * (3 - 1) * (3-2) -> 3 * (2)(1) -> 6, why is
 * this 6? -> this is 6 b/c you are inputing a 3 into the equation & running
 * through that formula. But, the idea is that a recurssive function calls
 * itself to reach a base case. This function is not doing that, it's just doing
 * a calculation.
 * 
 * CORRECT WAY: test case 3: -> 3 * factorial(3-1) // 3 * next number -> 3 *
 * factorial(2) -> 2 * factorial(2-1) // 2 * next number -> 2 * factorial(1) ->
 * factorial(1) is a base case which equals 1
 * 
 * test case 4: -> 4 * factorial(4-1) // 24 -> 3 * factorial(3-1) // 6 -> 2 *
 * factorial(2-1) // 2 -> factorial(1) = 1 // 1
 * 
 * 
 * factorial human way of solving: -> 3 * 2 * 1
 */

/*
 * calculating the factorial of a 3 1. account for factorial rules. factorial of
 * 0 = 1; factorial of 1 = 1 2. if not 0 or 1, return the factorial formula w/
 * the current # as input
 */
