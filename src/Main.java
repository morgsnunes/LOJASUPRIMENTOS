import LojaSupr.Fatura;
import LojaSupr.Empregado;
import LojaSupr.Data;
import LojaSupr.ContaCorrente;

class FaturaTeste {
    public static void main(String[] args) {
        Fatura fatura = new Fatura("001", "Mouse", 5, 50.0);
        System.out.println("Número: " + fatura.getNumero());
        System.out.println("Descrição: " + fatura.getDescricao());
        System.out.println("Quantidade: " + fatura.getQuantidade());
        System.out.println("Preço por item: " + fatura.getPreco());
        System.out.println("Total da fatura: " + fatura.getTotalFatura());
    }
    public class EmpregadoTeste {
        public static void main(String[] args) {
            Empregado empregado1 = new Empregado("João", "Silva", 3000.0);
            Empregado empregado2 = new Empregado("Maria", "Oliveira", 4000.0);

            System.out.println("Salário anual de " + empregado1.getNome() + " " + empregado1.getSobrenome() + ": " + empregado1.getSalarioAnual());
            System.out.println("Salário anual de " + empregado2.getNome() + " " + empregado2.getSobrenome() + ": " + empregado2.getSalarioAnual());

            empregado1.aumentarSalario(10);
            empregado2.aumentarSalario(10);

            System.out.println("Salário anual de " + empregado1.getNome() + " " + empregado1.getSobrenome() + " após aumento: " + empregado1.getSalarioAnual());
            System.out.println("Salário anual de " + empregado2.getNome() + " " + empregado2.getSobrenome() + " após aumento: " + empregado2.getSalarioAnual());
        }
    }
    public class DataTeste {
        public static void main(String[] args) {
            Data data = new Data(1, 1, 2021);
            System.out.println(data.exibirData());
        }
    }
    public class ContaCorrenteTeste {
        public static void main(String[] args) {
            ContaCorrente conta = new ContaCorrente("1234", "0001", 1000.0);
            System.out.println("Saldo inicial: " + conta.getSaldo());
            conta.depositar(500.0);
            System.out.println("Saldo após depósito: " + conta.getSaldo());
            conta.sacar(200.0);
            System.out.println("Saldo após saque: " + conta.getSaldo());
        }
    }
}