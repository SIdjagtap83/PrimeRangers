#<b>Prime Rangers</b>

You are given [L,R] you are required to determine the prime rangers in this range.The definition of prime rangers is that frequency of the smallest prime digit must be greater than or equal to the frequency of the second smallest prime digit in a number the frequency of the second smallest prime digit is greater than or equal to the frequency of the third smallest prime digit in a number and so on.

<b>Note:</b>

the number of prime rangers may become very large therefore print the prime rangerd modulo 10^9+7

<b>InputFormat:</b>

the first line contains an integer T denoting the number of test cases
next T lines contains two spaced seperated integer L and R denoting the range in which you have to find the prime rangers

<b>Output Format:</b>
printnumber of prime rangers mofuli10^9+7

<b>Constraints :</b>

1<=T<=5
1<=L<=R<=10^18

<b>Sample Input1:</b>

2
1 10
31 32

<b>Sample Output1 :</b>

7
1

<b>Explanation:</b>

<b>TestCase1:</b>

the number 3 5 and 7 are not prime rangers because in these numbers frequency of 2 is 0 but the frequency of the prime number greater than 2 is 1

<b>TestCase2:</b>

the number 32 is a prime ranger because the frequency of 2 is 1 and the frequency of 3 is 1 which satisfies the condition that the frequency of the smallest prime digit 2 is greater than equal to the frequency of the second smallest prime digit.
