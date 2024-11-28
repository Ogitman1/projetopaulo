//Interface para as classes implementarem os métodos
public interface Interfaceporto {
	abstract public void agendarAtracacao();
	abstract public void rastrear_conteineres();

	abstract public void rel_desempenho_porto();
    public void verificar_Disponibilidade();
    public void alocar_Recursos();
    public void atualizar_Status();
	abstract public void gerenciar_fila_de_espera();
	abstract public void cal_taxa_de_operacao();
	
	
	
}
