package ch03.e5;

public class AdditionBenchmark extends Benchmark {
	int i = 1;
	
	@Override
	void benchmark() {
		i += i;
	}
	
	public static void main(String[] args) {
		AdditionBenchmark ab = new AdditionBenchmark();
		System.out.println(ab.repeat(10000));
	}
}
