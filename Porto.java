// Classe que implementa a interface Interfaceporto
public class Porto implements Interfaceporto {
    

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

    @Override
    public void cal_taxa_de_operacao() {
        System.out.println("Cálculo da taxa de operação concluído.");
        // Lógica para calcular taxas de operação do porto
    }
}
