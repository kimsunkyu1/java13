package iducs.java.b;

public interface Animals {
	//public final double Height = 172.3;
	String species = "동물"; //앞에 public final 생략되어있음.
	//public final String species = "동물"; //앞에 public final 생략되어있음.

	
	void move(); // 앞에 public abstract 생략되어있음
	void eat();
	void sound();
	void breathe();
}
