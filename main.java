import javax.swing.JOptionPane;

class Ordem_de_Servico implements Interfaceporto {
	boolean status_operacional; 
	double capacidade; //capacidade da carga
	String tipo_de_carga; //tipo da carga
	//constructor que inicializa os objetos
	public Ordem_de_Servico(String tipo, boolean ou, double capa) {
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
public class main {
	public static void main(String[] args) {
		//Ordem_de_Servico servico = new Ordem_de_Servico("Pesado", true, 2_000_000f);
		// JOptionPane.showMessageDialog(null, "O resultado é "+valor);
 
	// Criando um barco de atração
      Containeres container = new Containeres("Pesado", true, 100_000);

      // Distância e velocidade média para o cálculo
      double distancia = 50; // Distância até o porto (em quilômetros)
      double velocidadeMedia = 30; // Velocidade média do container (em km/h)

      // Calculando e exibindo o tempo estimado para o atraque do Container
      container.calcularEspacoRestante(container.capacidade);
	  container.calcularTempoDeAtracacao(distancia, velocidadeMedia);
		
      // Criando um barco de atração
      Carga carga = new Carga("Pesado", true, 100_000);

      // Distância e velocidade média para o cálculo da Carga
      double dst = 10_000f; // Distância até o porto (em quilômetros)
      double velocidademedia = 30; // Velocidade média do carga (em km/h)

      // Calculando e exibindo o tempo estimado para o atraque
      carga.calcularTempoDeAtracacao(dst, velocidademedia);

	  
      // Criando um veículo terrestre
    Veiculos_terrestres veiculo = new Veiculos_terrestres("Pesado", true, 500_000f);

      // Distância e velocidade média
      double dist = 2_000f; // Distância em quilômetros
      double velmedia = 80; // Velocidade média em km/h

      // Calculando e exibindo o tempo estimado de transporte
      veiculo.calcularTempoDeTransporte(dist, velmedia);

	  // Criando um Navio
	  Navio navio = new Navio("Pesado", true, 1_000_000f);
	  
	   // Calculando e exibindo o tempo estimado para o atraque
	   navio.calcularTempoDeAtracacao(dist, velmedia);
      // Criando um barco de atração
      Barcos_de_Atração barco = new Barcos_de_Atração("Leve", true, 1_000f);

      // Distância e velocidade média para o cálculo
      double dstancia = 5_000_000f; // Distância até o porto (em quilômetros)
      double vmedia = 90; // Velocidade média do barco (em km/h)

      // Calculando e exibindo o tempo estimado para o atraque
      barco.calcularTempoDeAtracacao(dstancia, vmedia);

	}

}
