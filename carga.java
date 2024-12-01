class Carga {
  boolean status_operacional;
  double capacidade;
  String tipo_de_carga;

  // Construtor que inicializa os objetos
  public Carga(String tipo, boolean ou, double capa) {
      this.status_operacional = ou;
      this.capacidade = capa;
      this.tipo_de_carga = tipo;
  }

  // Função para retornar o status operacional
  public boolean getStatusOperacional() {
      return this.status_operacional;
  }

  // Função para retornar a capacidade
  public double getCapacidade() {
      return this.capacidade;
  }

  // Função para retornar o tipo de carga
  public String getTipoDeCarga() {
      return this.tipo_de_carga;
  }
  //calculo de tempo de atracacao
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
  // Função para retornar todas as informações de uma vez
  public String retornarInformacoes() {
      return String.format(
          "Status Operacional: %b, Capacidade: %.2f toneladas, Tipo de Carga: %s",
          this.status_operacional, this.capacidade, this.tipo_de_carga
      );
  }
  public boolean verificar_Disponibilidade(boolean status_operacional) {
    if (!status_operacional) {
        System.out.println("Carga não está operacional. Verifique o status.");
        return false; // Carga não operacional
    } else {
        System.out.println("Tudo certo. O Carga está operacional.");
        return true; // Carga operacional
    }
}
}
