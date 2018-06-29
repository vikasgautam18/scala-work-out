package gautamspeakscom.wordpress.com.week1


/**
  *  https://www.hackerrank.com/challenges/rotate-string/problem
  *
  * Scturtle likes strings very much. He is getting bored today, because he has already completed this week's task and doesn't have anything else to do.
  * So he starts left-rotating a string. If the length of the string is n, then he will rotate it n times and note down the result of each rotation on a paper.

    For a string S = S1S2...Sn, n rotations are possible. Let's represent these rotations by r1, r2... rn.
    Rotating it once will result in string r1 = S2S3..SnS1, rotating it again will result in string r2 = S3S4..SnS1S2 and so on.
    Formally, ith rotation will be equal to ri = Si+1...Sn-1SnS1...Si. Note that rn=S.

    Your task is to display all n rotations of string S.

    For example, if S = abc then it has 3 rotations. They are r1 = bca, r2 = cab and r3 = abc.

    Input Format
    The first line contains an integer,T, which represents the number of test cases to follow. Then follows T lines, which represent a test case each.
    Each test case contains a string, S, which consists of lower case latin characters  only.

    Output Format
    For each test case, print all the rotations, r1 r2 ... rn, separated by a space.

    Constraints
    1 <= T <= 10
    1 <= n <= 100
     will consist of lower case latin characters only.

    ***** Sample Input *****

    5
    abc
    abcde
    abab
    aaa
    z

  ***** Sample Output *****

    bca cab abc
    bcdea cdeab deabc eabcd abcde
    baba abab baba abab
    aaa aaa aaa
    z
   ***** Explanation *****
  *
    Test case #1: This case is mentioned in the problem statment.
    Test case #2: Rotations of abcde are: bcdea -> cdeab -> deabc -> eabcd -> abcde.
    Test case #3: Rotations of abab are: baba -> abab -> baba -> abab.
    Test case #4: All three rotations will result into same string.
    Test case #5: Only one rotation is possible, and that will result into original string.

  *
  */

object StringRotation {

  def main(args: Array[String]): Unit = {

  }

}
