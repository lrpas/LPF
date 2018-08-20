object larissa{
  
  val nome: String = "Larissa";
  var idade = 21;
  val curso = "Ecomp";
  def aniversario={
    
    idade=idade+1;
      
    }
  
  def imprime=(nome + " tem "+ idade +" e cursa: "+curso);
  
}

------------

println(larissa.imprime);
larissa.aniversario;
println(larissa.imprime);

class pessoa(_nome:String,_idade:Int){
  
  val nome:String = _nome;
  var idade:Int = _idade;
  
  def fez_aniversario() {
    idade = idade+1;
  }
  
  
  
}

var larissa = new pessoa ("larissa",21);
println(larissa.nome + larissa.idade);

