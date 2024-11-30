class Containeres implements Interfaceporto{
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
      if (!status_operacional) {
          System.out.println("Contêiner não está operacional. Verifique o status.");
          return -1; // Indica erro
      }

      if (cargaAtual > capacidade) {
          System.out.println("A carga atual excede a capacidade do contêiner!");
          return -1; // Indica erro
      }

      double espacoRestante = capacidade - cargaAtual;
      System.out.println("Espaço restante no contêiner: " + espacoRestante + " toneladas.");
      return espacoRestante;
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

    public void verificar_Disponibilidade() {
        System.out.println("Verificando a disponibilidade de recursos e atracação.");
        // Lógica para verificar disponibilidade no porto
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
        System.out.printf("Tempo estimado para atraque do container: %.2f horas%n", tempo);
        return tempo;
    }
    @Override
    public void cal_taxa_de_operacao() {
        System.out.println("Cálculo da taxa de operação concluído.");
        // Lógica para calcular taxas de operação do porto
    }
}

