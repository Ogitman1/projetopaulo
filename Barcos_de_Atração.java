class Barcos_de_Atração {
  boolean status_operacional;
  double capacidade; // Capacidade do barco em toneladas
  String tipo_de_carga;

  // Construtor que inicializa os objetos
  public Barcos_de_Atração(String tipo, boolean ou, double capa) {
      this.status_operacional = ou;
      this.capacidade = capa;
      this.tipo_de_carga = tipo;
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
}