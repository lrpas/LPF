class pessoa(_nome:String,_idade:Int){
  
  val nome:String = _nome;
  var idade:Int = _idade;
  
  def fez_aniversario() {
    idade = idade+1;
  }
  
  def imprime() = nome + " tem " + idade + " anos";
}
  


var larissa = new pessoa ("larissa",21);
println(larissa.nome + larissa.idade);

class estudante (nome:String,idade:Int,curso:String,_periodo:Int) extends pessoa (nome,idade){
  var periodo:Int= _periodo;
  override def imprime = nome + " tem " + idade + "e cursa " + curso + " no " + periodo +" periodo " ;
  
}

var silva = new estudante ("larissa regina ",21,"ECOMP",5);
println(silva.imprime);
