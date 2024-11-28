//Cada entidade é uma classe
class Carga {
  boolean status_operacional;
  double capacidade;
  String tipo_de_carga;
	//constructor que inicializa os objetos

  public Carga(String tipo, boolean ou, double capa) {
    this.status_operacional = ou;
    this.capacidade = capa;
    this.tipo_de_carga = tipo;
  }
}