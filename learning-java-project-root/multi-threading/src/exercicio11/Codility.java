package exercicio11;

public class Codility {

	static class Solution {
		
		public static int[] solution (int[] A, int K) {
			
			for(int j = 0; j < K; j++){
				
				int last = A[A.length - 1];
				
				for(int i = A.length - 1; i > 0; i--) {
					A[i] = A[i - 1];
				}
				
				A[0] = last;
				
			}
			
			return A;
			
		}
		
	}
	
	public static void main(String[] args) {

		int[] vetor = new int[]{1,2,3,4,5};
			
		int[] result = Solution.solution(vetor, 2);
		
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
		
	}

}
