package setDemo;

import java.util.HashMap;
import java.util.WeakHashMap;

public class whashMap {

	public static void main(String[] args) {
		Stud s1 = new Stud(1, "megha");
		Stud s2 = new Stud(2, "sharayu");
		Stud s3 = new Stud(3, "saru");

		HashMap<Stud, String> h = new HashMap<>();
		h.put(s1, "xyz");
		h.put(s2, "pqr");
		h.put(s3, "ghi");
		s1 = null;
		System.out.println(h.size());

		WeakHashMap<Stud, String> w = new WeakHashMap<>();
		//w.put(s1, "xyz");
		w.put(s2, "pqr");
		w.put(s3, "ghi");
		s1 = null;

		System.gc();
		System.out.println(w.size());

		for (int i = 0; i < 5; i++) {
			System.out.println("weakHashMap" + w);
			System.out.println("HasHmap" + h);
		}
		System.out.println("size of weakhash" + w.size());
		System.out.println("size of hashmap" + h.size());

	}

}

class Stud {
	int id;
	String name;

	@Override
	public String toString() {
		return "Stud [id=" + id + ", name=" + name + "]";
	}

	public Stud(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stud other = (Stud) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}