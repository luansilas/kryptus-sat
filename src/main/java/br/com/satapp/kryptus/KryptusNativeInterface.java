package br.com.satapp.kryptus;

import java.nio.ByteBuffer;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;


/**
 * 
 * @author Luan Silas de Farias
 * @version 0.0.1
 *
 */
public interface KryptusNativeInterface extends Library {
	
	
	public static KryptusNativeInterface INSTANCE = (KryptusNativeInterface) Native.loadLibrary("SAT", KryptusNativeInterface.class); 
	
	/**
	 * Original signature : <code>String AtivarSAT(long, long, String, String, long)</code><br>
	 * <i>native declaration : line 55</i><br>
	 */
	Pointer AtivarSAT(NativeLong numeroSessao, NativeLong subComando, Pointer codigoDeAtivacao, Pointer cnpj, NativeLong cUF);
	
	
	/**
	 * Original signature : <code>String ComunicarCertificadoICPBRASIL(long, String, String)</code><br>
	 * <i>native declaration : line 57</i><br>
	 */
	Pointer ComunicarCertificadoICPBRASIL(NativeLong numeroSessao, Pointer codigoDeAtivacao, Pointer certificado);
	
	/**
	 * Original signature : <code>String EnviarDadosVenda(long, String, String)</code><br>
	 * <i>native declaration : line 59</i><br>
	 */
	Pointer EnviarDadosVenda(NativeLong numeroSessao, Pointer codigoDeAtivacao, ByteBuffer dadosVenda);
	/**
	 * Original signature : <code>String CancelarUltimaVenda(long, String, String, String)</code><br>
	 * <i>native declaration : line 61</i><br>
	 */
	Pointer CancelarUltimaVenda(NativeLong numeroSessao, Pointer codigoDeAtivacao, Pointer chave, Pointer dadosCancelamento);
	
	
	/**
	 * Original signature : <code>String ConsultarSAT(long)</code><br>
	 * <i>native declaration : line 63</i>
	 */
	Pointer ConsultarSAT(NativeLong numeroSessao);
	
	/**
	 * Original signature : <code>String TesteFimAFim(long, String, String)</code><br>
	 * <i>native declaration : line 65</i><br>
	 */
	Pointer TesteFimAFim(NativeLong numeroSessao, Pointer codigoDeAtivacao, Pointer dadosVenda);
	
	
	/**
	 * Original signature : <code>String ConsultarStatusOperacional(long, String)</code><br>
	 * <i>native declaration : line 67</i><br>
	 */
	Pointer ConsultarStatusOperacional(NativeLong numeroSessao, Pointer codigoDeAtivacao);
	
	
	/**
	 * Original signature : <code>String ConsultarNumeroSessao(long, String, long)</code><br>
	 * <i>native declaration : line 69</i><br>
	 */
	Pointer ConsultarNumeroSessao(NativeLong numeroSessao, Pointer codigoDeAtivacao, NativeLong cNumeroDeSessao);
	
	/**
	 * Original signature : <code>String ConfigurarInterfaceDeRede(long, String, String)</code><br>
	 * <i>native declaration : line 71</i><br>
	 */
	Pointer ConfigurarInterfaceDeRede(NativeLong numeroSessao, Pointer codigoDeAtivacao, Pointer dadosConfiguracao);
	
	
	/**
	 * Original signature : <code>String AssociarAssinatura(long, String, String, String)</code><br>
	 * <i>native declaration : line 73</i><br>
	 */
	Pointer AssociarAssinatura(NativeLong numeroSessao, Pointer codigoDeAtivacao, Pointer CNPJvalue, Pointer assinaturaCNPJs);
	
	/**
	 * Original signature : <code>String AtualizarSoftwareSAT(long, String)</code><br>
	 * <i>native declaration : line 75</i><br>
	 */
	Pointer AtualizarSoftwareSAT(NativeLong numeroSessao, Pointer codigoDeAtivacao);
	
	
	/**
	 * Original signature : <code>String ExtrairLogs(long, String)</code><br>
	 * <i>native declaration : line 77</i><br>
	 */
	Pointer ExtrairLogs(NativeLong numeroSessao, Pointer codigoDeAtivacao);
	
	
	/**
	 * Original signature : <code>String BloquearSAT(long, String)</code><br>
	 * <i>native declaration : line 79</i><br>
	 */
	Pointer BloquearSAT(NativeLong numeroSessao, Pointer codigoDeAtivacao);
	
	
	/**
	 * Original signature : <code>String DesbloquearSAT(long, String)</code><br>
	 * <i>native declaration : line 81</i><br>
	 */
	Pointer DesbloquearSAT(NativeLong numeroSessao, Pointer codigoDeAtivacao);
	
	
	/**
	 * Original signature : <code>String TrocarCodigoDeAtivacao(long, String, long, String, String)</code><br>
	 * <i>native declaration : line 83</i><br>
	 */
	Pointer TrocarCodigoDeAtivacao(NativeLong numeroSessao, Pointer codigoDeAtivacao, NativeLong opcao, Pointer novoCodigo, Pointer confNovoCodigo);


}
