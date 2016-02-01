# kryptus-sat
Projeto Java com comunicação com o SAT da Kryptus

## DLL
Utilize a DLL cdecl

## Exemplos do codigo

Pointer retornoPointer = KryptusNativeInterface.INSTANCE.ConsultarSAT(new NativeLong(1L));

String retornoString = retornoPointer.getString(0);

System.out.println("Retorno do Aparelho Kryptus");

System.out.println(retornoString);
