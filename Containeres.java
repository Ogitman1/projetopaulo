public class Containeres implements Interfaceporto {
    boolean status_operacional;
    double capacidade;
    String tipo_de_carga;

    // Construtor que inicializa os objetos
    public Containeres(String tipo, boolean ou, double capa) {
        this.status_operacional = ou;
        this.capacidade = capa;
        this.tipo_de_carga = tipo;
    }

    // Método para calcular o espaço restante após carregar
    public double calcularEspacoRestante(double cargaAtual) {
        //calculo espaco
        double espacoRestante = ((capacidade - cargaAtual)/1000)*-1;
        if (cargaAtual <= capacidade) {
            System.out.println("A carga atual do contêiner foi aprovada!");
            System.out.println("Espaço excedida do contêiner: " + espacoRestante + " toneladas.");
            return espacoRestante; // Indica erro
        }
        else {
            System.out.println("A carga atual excede a capacidade do contêiner!");
            System.out.println("Espaço excedida do contêiner: " + espacoRestante + " toneladas.");
            return espacoRestante;
            
        }
    }

    // Getter para status_operacional
    public boolean getStatusOperacional() {
        return status_operacional;
    }

    // Getter para capacidade
    public double getCapacidade() {
        return capacidade;
    }

    // Getter para tipo_de_carga
    public String getTipoDeCarga() {
        return tipo_de_carga;
    }

    @Override
    public void agendarAtracacao() {
        System.out.println("Agendamento da atracação concluído.");
    }

    @Override
    public void rastrear_conteineres() {
        System.out.println("Rastreamento de contêineres iniciado.");
    }

    @Override
    public void rel_desempenho_porto() {
        System.out.println("Relatório de desempenho do porto gerado.");
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
    

    public void alocar_Recursos() {
        System.out.println("Recursos alocados com sucesso.");
    }

    public void atualizar_Status() {
        System.out.println("Status atualizado no sistema.");
    }

    @Override
    public void gerenciar_fila_de_espera() {
        System.out.println("Gerenciamento da fila de espera realizado.");
    }

    public double calcularTempoDeAtracacao(double distancia, double velocidadeMedia) {

        if (velocidadeMedia <= 0) {
            System.out.println("Erro: Velocidade média inválida.");
            return -1; // Verifica se a velocidade média é válida
        }

        double tempo = distancia / velocidadeMedia; // Fórmula: tempo = distância / velocidade
        System.out.printf("Tempo estimado para atraque do container: %.2f horas%n", tempo);
        return tempo;
    }

    @Override
    public void cal_taxa_de_operacao() {
        System.out.println("Cálculo da taxa de operação concluído.");
    }
}
