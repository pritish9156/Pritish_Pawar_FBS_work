package Map;

import java.util.Objects;

public class MyKey implements Comparable<MyKey>{

	
	int key;
	
	
	public MyKey(int key) {
		this.key = key;
	}
	

	int getKey() {
		return key;
	}


	@Override
	public String toString() {
		return "\nMyKey [key=" + key + "]";
	}

	@Override
	public int compareTo(MyKey o) {
		return this.key - o.key;
	}


	@Override
	public int hashCode() {
		return key;
	}


	@Override
	public boolean equals(Object obj) {
		MyKey other = (MyKey) obj;
		return key == other.key;
	}

}
