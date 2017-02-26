package base;

public class MyInteger {
	private int iValue;
	public MyInteger(int newValue) {
		iValue = newValue;
	}
	public int getValue(){
		return iValue;
	}
	public boolean isEven(){
		return iValue % 2 == 0;
	}
	public boolean isOdd(){
		return iValue % 2 == 1;
	}
	public boolean isPrime(){
		if (iValue < 2) return false;
        if (iValue == 2) return true;
        if (iValue % 2 == 0) return false;
        for (int i = 3; i * i <= iValue; i += 2)
            if (iValue % i == 0) return false;
        return true;
	}
	public static boolean isEven(int x){
		return x % 2 == 0;
	}
	public static boolean isOdd(int y){
		return y % 2 == 1;
	}
	public static boolean isPrime(int z){
		if (z < 2) return false;
        if (z == 2) return true;
        if (z % 2 == 0) return false;
        for (int i = 3; i * i <= z; i += 2)
            if (z % i == 0) return false;
        return true;
	}
	public static boolean isEven(MyInteger x) {
		return x.isEven();
		}
	public static boolean isOdd(MyInteger y) {
		return 
		y.isOdd();
		}
	public static boolean isPrime(MyInteger z) 
		{
		return z.isPrime();
		}
	public boolean equals(int n){
		return n == iValue;
	}
	public boolean equals(MyInteger n){
		return equals(n.getValue());

	}
}