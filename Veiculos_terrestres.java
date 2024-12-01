public class Veiculos_terrestres implements Interfaceporto {
    // Atributos da classe
    boolean status_operacional;
    double capacidade; // Capacidade de carga do veículo em toneladas
    String tipo_de_carga;

    // Construtor que inicializa os objetos
    public Veiculos_terrestres(String tipo, boolean ou, double capa) {
        this.status_operacional = ou;
        this.capacidade = capa;
        this.tipo_de_carga = tipo;
    }

    // Método para calcular o tempo estimado de transporte
    public double calcularTempoDeTransporte(double distancia, double velocidadeMedia) {
        if (!status_operacional) {
            System.out.println("O veículo está fora de operação.");
            return -1; // Retorna -1 para indicar que o cálculo não foi possível
        }

        if (velocidadeMedia <= 0) {
            System.out.println("Erro: Velocidade média inválida.");
            return -1;
        }

        double tempo = distancia / velocidadeMedia; // Fórmula: tempo = distância / velocidade
        System.out.printf("Tempo estimado para transporte: %.2f horas%n", tempo);
        return tempo;
    }

    // Método para retornar os atributos da classe
    public String getInformacoesVeiculo() {
        return String.format(
            "Status Operacional: %s%nCapacidade: %.2f toneladas%nTipo de Carga: %s",
            status_operacional ? "Operacional" : "Fora de operação",
            capacidade,
            tipo_de_carga
        );
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
        System.out.println("Gerenciamento da fila de espera");
    }

    @Override
    public void cal_taxa_de_operacao() {
        // TODO Auto-generated method stub
        System.out.println("Gerenciamento da fila de espera");
    }
    
}