package sec06.ch07;

public interface MyList {
	void add(int idx, int value);
	int size();
	int get(int i);
	int remove();
	int remove(int idx);
	void add(int value);
}
