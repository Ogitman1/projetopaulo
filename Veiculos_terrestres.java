//Cada entidade é uma classe

class Veiculos_terrestres {
	//constructor que inicializa os objetos
  public Veiculos_terrestres(String tipo, boolean ou, double capa) {
    this.status_operacional = ou;
    this.capacidade = capa;
    this.tipo_de_carga = tipo;
  }

  boolean status_operacional;
  double capacidade;
  String tipo_de_carga;
}