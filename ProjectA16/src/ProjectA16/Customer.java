package ProjectA16;

import java.util.ArrayList;

import javax.swing.text.html.AccessibleHTML.TableElementInfo.TableAccessibleContext;

class Customer implements Runnable {
	private Table table;
	private String food;

	public Customer(Table table, String food) {
		this.table = table;
		this.food = food;
	}

	public void run() {
		while (true) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
			}
			String name = Thread.currentThread().getName();

			if (eatFood()) {
				System.out.println(name + "ate a" + food);
			} else {
				System.out.println(name + "failed to ate.:(");
			}
		}

	}

	boolean eatFood() {
		return table.remove(food);
	}
}

class Cook implements Runnable {
	private Table table;

	Cook(Table table) {
		this.table = table;
	}

	public void run() {
		while (true) {
			int idx = (int) (Math.random() * table.dishNum());
			table.add(table.dishNames[idx]);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
}

class table {
	String[] dishName = { "donut", "donut", "buger" };
	final int MAX_FOOD = 6;
	private ArrayList<String> dishes = new ArrayList<>();

	public synchronized void add(String dish) {
		if (dishes.size() >= MAX_FOOD) {
			return;
		}
		dishes.add(dish);
		System.out.println("Dishes:" + dishes.toString());
	}

	public boolean remove(String dishName) {
		synchronized (this) {
			while
		}
	}
}
