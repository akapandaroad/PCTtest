import javax.management.RuntimeErrorException;


public class BasicGenerator <T> {
	private Class<T> type;

	public BasicGenerator(Class<T> type) {
		
		this.type = type;
	}
	
	public T next(){
		try {
			return type.newInstance();
		} catch (Exception e) {
		throw new RuntimeException(e);	
		}
	}
	
	public static<T> BasicGenerator<T> creat(Class<T> type){
		return new BasicGenerator<>(type);
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BasicGenerator<Counter> gen=BasicGenerator.creat(Counter.class);
		for (int i = 0; i < 5; i++) {
			System.out.println(gen.next());
		}
	}

}
