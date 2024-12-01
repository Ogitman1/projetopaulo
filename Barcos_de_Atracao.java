public class Barcos_de_Atracao { 
    boolean status_operacional;
    double capacidade; // Capacidade do barco em toneladas
    String tipo_de_carga;

    // Construtor que inicializa os objetos
    public Barcos_de_Atracao(String tipo, boolean ou, double capa) {
        this.status_operacional = ou;
        this.capacidade = capa;
        this.tipo_de_carga = tipo;
    }
    public boolean verificar_Disponibilidade(boolean status_operacional) {
        if (!status_operacional) {
            System.out.println("Contêiner não está operacional. Verifique o status.");
            return false; // Contêiner não operacional
        } else {
            System.out.println("Tudo certo. O Contêiner está operacional.");
            return true; // Contêiner operacional
        }
    }
    // Função para calcular o tempo estimado de atraque do barco
    public double calcularTempoDeAtracacao(double distancia, double velocidadeMedia) {
        if (!status_operacional) {
            System.out.println("O barco está fora de operação.");
            return -1; // Retorna -1 para indicar que o cálculo não foi possível
        }

        if (velocidadeMedia <= 0) {
            System.out.println("Erro: Velocidade média inválida.");
            return -1; // Verifica se a velocidade média é válida
        }

        double tempo = distancia / velocidadeMedia; // Fórmula: tempo = distância / velocidade
        System.out.printf("Tempo estimado para atraque do barco: %.2f horas%n", tempo);
        return tempo;
    }

    // Método para retornar todas as variáveis
    public String retornarInformacoes() {
        return String.format(
            "Status Operacional: %b, Capacidade: %.2f toneladas, Tipo de Carga: %s",
            this.status_operacional, this.capacidade, this.tipo_de_carga
        );
    }
}
