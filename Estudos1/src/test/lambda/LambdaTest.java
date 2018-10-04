package test.lambda;

import java.awt.List;
import java.util.ArrayList;

public class LambdaTest {
	public static void main(String[] args) {
		// Lambda com threads

		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Id: " + Thread.currentThread().getId());
				System.out.println("Name: " + Thread.currentThread().getName());
				System.out.println("Priority: " + Thread.currentThread().getPriority());
				System.out.println("State: " + Thread.currentThread().getState());

				ArrayList list = new ArrayList<>();

				for (int i = 0; i < 50; i++) {
					list.add(i);
				}

				list.forEach(n -> System.out.println(n));

			}
		}).start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Id: " + Thread.currentThread().getId());
				System.out.println("Name: " + Thread.currentThread().getName());
				System.out.println("Priority: " + Thread.currentThread().getPriority());
				System.out.println("State: " + Thread.currentThread().getState());

				ArrayList<Integer> list = new ArrayList<>();

				for (int i = 50; i > 0; i--) {
					list.add(i);
				}

				list.forEach(n -> {
					if (n % 2 == 0) {
						System.out.println(n);
					}
				});

			}
		}).start();
	}

}
