import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();

        System.out.println("Digite o número do cep: ");
        var numeroCep = sc.nextLine();

        try{
            Endereco novoEndereco = consultaCep.buscaEndereco(numeroCep);
            System.out.println(novoEndereco);

            GeradorArquivo geradorArquivo = new GeradorArquivo();
            geradorArquivo.gerarArquivo(novoEndereco);
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}