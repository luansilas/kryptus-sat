package br.com.satapp.kryptus;

import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;

public class Application {
	
	public static void main(String[] args) {
		Pointer retornoPointer = KryptusNativeInterface.INSTANCE.ConsultarSAT(new NativeLong(1L));
		String retornoString = retornoPointer.getString(0);
		System.out.println("Retorno do Aparelho Kryptus");
		System.out.println(retornoString);
	}
	
	

}
