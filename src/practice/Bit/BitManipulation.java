package practice.Bit;

public class BitManipulation {

	public static void main(String[] args) {
//		System.out.println(hammingWeight(2147483648L));
		System.out.println(reverseBits(43261596));
	}

	public static int hammingWeight(long n) {
		int and = 1;
		int count = 0;
		for (int i = 1; i <= 32; i++){
			if ((n & and) != 0){
				count++;
			}
			and = and << 1;
		}
		return count;
	}

	public static int reverseBits(int x){
		int b = 0;
		while (x!=0){
			b<<=1;
			b|=( x &1);
			x>>=1;
		}
		return b;
	}
}
