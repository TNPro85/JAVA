package jUtils;

public class NumberUtils {

	public static void swapInt(int x, int y) {
		x = x ^ y;
		y = x ^ y;
		x = x ^ y;
	}
}
