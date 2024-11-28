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
	//Para agendar navegações
	public void agendarAtracacao() {
	};
	//rastrear containeres
	public void rastrear_conteineres() {

	};
	//alocar recursos do porto dinamicamente
	public void alocar_Recursos() {

	};
	//verificar disponibilidade dos agendamentos
    public void verificar_Disponibilidade(){

    }
	//atualizar status das cargas ocupadas ou não
    public void atualizar_Status(){

    }
	public void rel_desempenho_porto() {

	}

	public void gerenciar_fila_de_espera() {

	}
	//calcular taxa das operações do porto
	public void cal_taxa_de_operacao() {

	}
}
public class main {
	public static void main(String[] args) {
		Ordem_de_Servico servico = new Ordem_de_Servico("Pesado", true, 2_000_000f);
		Barcos_de_Atração barco = new Barcos_de_Atração("Leve", true, 1_000f);
        Veiculos_terrestres veiculo = new Veiculos_terrestres("Pesado", true, 500_000f);
        Navio navio = new Navio("Pesado", true, 1_000_000f);
        Containeres container = new Containeres("Pesado", true, 2_000_000f);
		// JOptionPane.showMessageDialog(null, "O resultado é "+valor);
 
	}

}
