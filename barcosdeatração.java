//Cada entidade é uma classe
class Barcos_de_Atração {
  boolean status_operacional;
  double capacidade;
  String tipo_de_carga;

	//constructor que inicializa os objetos
  public Barcos_de_Atração(String tipo, boolean ou, double capa) {
    this.status_operacional = ou;
    this.capacidade = capa;
    this.tipo_de_carga = tipo;
  }
}