public class Navio implements Interfaceporto {
    boolean status_operacional;
    double capacidade; // Capacidade de carga do veículo em toneladas
    String tipo_de_carga;
    
    public Navio(String tipo, boolean ou, double capa) {
        this.status_operacional = ou;
        this.capacidade = capa;
        this.tipo_de_carga = tipo;
    }

    @Override
    public void agendarAtracacao() {
        System.out.println("Agendamento da atracação concluído.");
        // Lógica para agendar uma atracação no porto
    }

    @Override
    public void rastrear_conteineres() {
        System.out.println("Rastreamento de contêineres iniciado.");
        // Lógica para rastrear contêineres no sistema
    }

    @Override
    public void rel_desempenho_porto() {
        System.out.println("Relatório de desempenho do porto gerado.");
        // Lógica para criar e exibir o relatório de desempenho
    }
    //checa a disponibilidade do navio
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
        // Lógica para alocar recursos necessários para operações
    }

    public void atualizar_Status() {
        System.out.println("Status atualizado no sistema.");
        // Lógica para atualizar o status das operações ou cargas
    }

    @Override
    public void gerenciar_fila_de_espera() {
        System.out.println("Gerenciamento da fila de espera realizado.");
        // Lógica para organizar a fila de navios esperando atracação
    }

    @Override
    public void cal_taxa_de_operacao() {
        System.out.println("Cálculo da taxa de operação concluído.");
        // Lógica para calcular taxas de operação do porto
    }
    // calcula o tempo de atracacao
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
        System.out.printf("Tempo estimado para atraque do Navio: %.2f horas%n", tempo);
        return tempo;
    }
    //função que checa status
    boolean disponibilidade(boolean status) {
        return status;
    }
    
    boolean statusoperacional = disponibilidade(this.status_operacional);
    // Função adicional que fornece o status detalhado do navio
    public void statusNavio() {
        double resul_capacidade = (capacidade/1_000);
        System.out.println("Status do Navio:");
        System.out.println("Operacional: " + (statusoperacional ? "Sim" : "Não"));
        System.out.println("Tipo de Carga: " + tipo_de_carga);
        System.out.println("Capacidade de Carga: " + resul_capacidade + " toneladas");
    }
}
