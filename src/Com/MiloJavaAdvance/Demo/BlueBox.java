package Com.MiloJavaAdvance.Demo;

/**
 * 
 * @author milo
 *
 * @param <K>
 * @param <V>
 *            定义泛型类
 * 
 */
public class BlueBox<K, V> {

	private K k;
	private V v;

	public void add(K k, V v) {
		this.k = k;
		this.v = v;
	}

	public K getK() {
		return k;
	}

	public V getV() {
		return v;
	}

	void getAll() {
		System.out.println("K is: " + k + " V is :" + v);
	}

	public <T, E> void GenericMethod1(T t, E e) {
		System.out.println(t + " : " + e);
	}

	public <T> T GenericMethod2(T t) {
		return t;
	}

	/**
	 * 
	 * @param k
	 * @param v
	 *            虽然类已经有了K，V，但是静态方法需要从新定义
	 */
	public static <K, V> void GenericMethod3(K k, V v) {
		System.out.println(k + " : " + v);
	}

	public <G> G[] swap(G arr[], int a, int b) {
		if (arr.length <= a || arr.length <= b || a < 0 || b < 0) {
			try {
				throw new Exception("请检查数据是否在下标范围内");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				throw new RuntimeException(e);
			}
		} else {
			G g;
			g = arr[a];
			arr[a] = arr[b];
			arr[b] = g;
		}
		return arr;
	}

	public <G> G[] reverse(G arr[]) {
		int start=0;
		int end=arr.length-1;
		while (start<end) {
			G g;
			g = arr[start];
			arr[start] = arr[end];
			arr[end] = g;
			start++;
			end--;
		}
		
		return arr;
	}
}
