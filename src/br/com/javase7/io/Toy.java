package br.com.javase7.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Toy {

	public static void main(String[] args) throws Exception {
		/*
		 * MyBufferedReader br = new MyBufferedReader(new
		 * FileReader(System.getProperty("user.dir") + "\\classes.txt")); try {
		 * String line = null; while ((line = br.readLine()) != null) {
		 * instantiate(line); } } finally { br.close(); }
		 */

		try (MyBufferedReader br = new MyBufferedReader(new FileReader(System.getProperty("user.dir") + "\\classes.txt"))) {
			String line = null;
			while ((line = br.readLine()) != null) {
				instantiate(line);
			}
		}
	}

	private static void instantiate(String className) throws Exception {
		try {
			Class<?> clazz = Class.forName(className);
			Object o = clazz.newInstance();
			System.out.println(o.getClass().getName());

		} catch (ClassNotFoundException e) {
			System.err.println("Classe nao encontrada: " + className);
			throw e;
		} catch (InstantiationException e) {
			System.err.println("Nao foi possivel instanciar a classe: " + className);
			throw e;
		} catch (IllegalAccessException e) {
			System.err.println("Nao foi possivel instanciar a classe: " + className);
			throw e;
		}

		/*try {
			Class<?> clazz = Class.forName(className);
			Object o = clazz.newInstance();
			System.out.println(o.getClass().getName());
		} catch (ClassNotFoundException e) {
			System.err.println("Classe nao encontrada: " + className);
			throw e;
		} catch (InstantiationException | IllegalAccessException e) {
			System.err.println("Nao foi possivel instanciar a classe: " + className);
			throw e;
		}*/
	}

	public static class MyBufferedReader extends BufferedReader {
		public MyBufferedReader(Reader r) {
			super(r);
		}

		public void close() throws IOException {
			System.out.println("fechando o BufferedStream");
			super.close();
		}
	}

}
