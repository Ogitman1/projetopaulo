// Classe que implementa a interface Interfaceporto
public class Porto implements Interfaceporto {
    // Atributos da classe
    private String nome;
    private String localizacao;
    private int capacidadeDeNavios; // Capacidade máxima de navios no porto

    // Construtor
    public Porto(String nome, String localizacao, int capacidadeDeNavios) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.capacidadeDeNavios = capacidadeDeNavios;
    }
    public String retornarInformacoes() {
        return String.format(
            "Nome: %b, Localizacao: %s toneladas, Tipo de Carga: %.2f",
            this.nome, this.localizacao, this.capacidadeDeNavios
        );
    }
    // Métodos implementados da interface
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
        System.out.println("Gerenciamento da fila de espera realizado.");
        // Lógica para organizar a fila de navios esperando atracação
    }

    @Override
    public void cal_taxa_de_operacao() {
        System.out.println("Cálculo da taxa de operação concluído.");
        // Lógica para calcular taxas de operação do porto
    }

    // Método para retornar as informações do porto
    public String getInformacoesPorto() {
        return String.format(
            "Nome do Porto: %s%nLocalização: %s%nCapacidade de Navios: %d",
            nome, localizacao, capacidadeDeNavios
        );
    }
}
