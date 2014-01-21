package br.com.javase7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Toy {

	public static void main(String[] args) {
		byte b = 1_2_7;
		int v1 = 999_999;
		int v2 = 100_000 - 1_000;
		Integer i1 = new Integer(12_12_12_1);
		Integer i2 = new Integer(1_2_1_2_1_2_1);
		double f = 123_456.3_4_1;
		System.out.printf("O valor de b e': %d\n", b);
		System.out.printf("O valor de v1 e': %d\n", v1);
		System.out.printf("O valor de v2 e': %d\n", v2);
		System.out.printf("i1 e i2 são iguais?: %b\n", i1.equals(i2));
		System.out.printf("O valor de f e': %.4f\n", f);

		for (String param : args) {
			switch (param) {
			case "-test":
				System.out.println("O programa está sendo executado em modo teste");
				break;
			case "-silent":
				System.out.println("O programa envia poucas informações na saída padrão");
				break;
			case "-verbose":
				System.out.println("O programa envia muitas informações na saída padrão");
				break;
			default:
				System.err.printf("Parâmetro %s não reconhecido\n", param);
				System.exit(-1);
			}
		}

		Map<Integer, Set<Integer>> mapOfIntegers = new HashMap<>();
		Integer aKey = 10;
		//Set<Integer> aSet = new HashSet<>();
		Set<Integer> aSet = null;
		mapOfIntegers.put(aKey, aSet = new HashSet<>());


		
	}
}
