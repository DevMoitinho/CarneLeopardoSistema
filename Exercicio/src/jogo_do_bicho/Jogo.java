package jogo_do_bicho;

import java.util.Random;
import java.util.Arrays;

public class Jogo {
	public static void main(String[] args) {
		imprimeAposta(fazAposta());
	}
	
	public static String pegaBicho(int b) {
		String[] bichos = {"Avestruz", "Águia","Burro","Borboleta","Cachorro","Cabra", "Carneiro","Camelo", "Cobra", "Coelho","Cavalo", "Elefante", "Galo", "Gato","Jacaré", "Leão", "Macaco","Porco", "Pavão","Peru","Touro","Tigre","Urso","Veado","Vaca"};
		return bichos[b];
	}
	
	public static int[] fazAposta() {
		Random rand = new Random();
		int[] numeros = new int[5];
		
		for(int i=0;i<numeros.length;i++) {
			int n = rand.nextInt(25);
			if(!meuIn(numeros,n)) {numeros[i] = n;}
		}
		
		return numeros;
	}
	
	public static void imprimeAposta(int[] n) {
		Arrays.sort(n);
		for(int i= 0; i<n.length;i++) {
			System.out.print(pegaBicho(n[i]) + " ");
		}
		
	}	
	
	
	
	public static boolean meuIn(int[] a, int n) {
		for(int i =0;i<a.length;i++) {
			if(a[i] == n) {
				return true;
			}
		}
		return false;
	}
}
