import javax.swing.JOptionPane;

public class main {
	public static void main(String[] args) {
		//Ordem_de_Servico servico = new Ordem_de_Servico("Pesado", true, 2_000_000f);
		// JOptionPane.showMessageDialog(null, "O resultado é "+valor);
 
	// Criando um barco de atração
      Containeres container = new Containeres("Pesado", true ,100_000);

      // Distância e velocidade média para o cálculo
      double distancia = 50; // Distância até o porto (em quilômetros)
      double velocidadeMedia = 30; // Velocidade média do container (em km/h)

      // Calculando e exibindo o tempo estimado para o atraque do Container
      container.calcularEspacoRestante(200_000f);
	  container.calcularTempoDeAtracacao(distancia, velocidadeMedia);
	  //verificar a disponibilidade
	  boolean stt = container.status_operacional;
	  container.verificar_Disponibilidade(stt);
      // Criando um barco de atração
      Carga carga = new Carga("Pesado", true, 100_000);

      // Distância e velocidade média para o cálculo da Carga
      double dst = 10_000f; // Distância até o porto (em quilômetros)
      double velocidademedia = 100; // Velocidade média do carga (em km/h)

      // Calculando e exibindo o tempo estimado para o atraque
      double tempo = carga.calcularTempoDeAtracacao(dst, velocidademedia);
	  String tdecarga = carga.getTipoDeCarga();
	  System.out.printf("Tipo de carga: %s", tdecarga);
	  System.out.printf("Tempo de atracacao: %s", tempo);
	  carga.retornarInformacoes();
	  
      // Criando um veículo terrestre
    Veiculos_terrestres veiculo = new Veiculos_terrestres("Pesado", true, 500_000f);

      // Distância e velocidade média
      double dist = 2_000f; // Distância em quilômetros
      double velmedia = 80; // Velocidade média em km/h

      // Calculando e exibindo o tempo estimado de transporte
      veiculo.calcularTempoDeTransporte(dist, velmedia);
	  veiculo.getInformacoesVeiculo();

	  // Criando um Navio
	  Navio navio = new Navio("Pesado", true, 1_000f);
	  navio.statusNavio();
	  
	   // Calculando e exibindo o tempo estimado para o atraque
	   navio.calcularTempoDeAtracacao(dist, velmedia);
      // Criando um barco de atração
      Barcos_de_Atracao barco = new Barcos_de_Atracao("Leve", true, 1_000f);

      // Distância e velocidade média para o cálculo
      double dstancia = 5_000_000f; // Distância até o porto (em quilômetros)
      double vmedia = 90; // Velocidade média do barco (em km/h)

      // Calculando e exibindo o tempo estimado para o atraque
      barco.calcularTempoDeAtracacao(dstancia, vmedia);
	  //informações barco
	  System.out.printf("Informações do Barco: %s", barco.retornarInformacoes());
	  //verificar disponibilidade
	  boolean statusbarco = barco.status_operacional;
	  barco.verificar_Disponibilidade(statusbarco);

	  
	}

}
