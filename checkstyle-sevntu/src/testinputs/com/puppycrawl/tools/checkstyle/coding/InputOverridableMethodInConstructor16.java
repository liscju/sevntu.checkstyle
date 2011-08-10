package TestClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class InputOverridableMethodInConstructor16 {


	private static class Object1 implements Serializable {

		public void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
			 doSmth("Bar!");
		}

		public void doSmth() {
			System.out.println("Bar!");
		}

		public final void doSmth(String value) {
			System.out.println(value);
		}
	}

}