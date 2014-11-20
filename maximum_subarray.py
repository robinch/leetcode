class Solution:
    # @param A, a list of integers
    # @return an integer
    def maxSubArray(self, A):
        currentSum = 0
    	maxSum = A[0]
    	
        for i in xrange(len(A)):
			currentSum = currentSum + A[i]
			maxSum = max(maxSum, currentSum)
			currentSum = max(currentSum, 0)
      	return maxSum
