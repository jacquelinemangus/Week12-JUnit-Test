import java.util.Random;

public class TestDemo {


//Testing multiplication
public int multiplyTwoNumbers(int c, int d) {
	return c * d;
}
public int randomNumberSquared(){
	int x = getRandomInt();
return x * x;
}
public int getRandomInt() {
 	Random random = new Random();
 return random.nextInt(10) + 1;
}


public int addPositive(int a, int b) {
	if (a > 0 && b > 0) {
		return a + b;
		
	} else {
		throw new IllegalArgumentException("Both parameters must be positive!");
	}
}
}