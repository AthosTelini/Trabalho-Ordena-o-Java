
package javasortAthos;

public class Dados implements Comparable<Dados>{
   
   private int Ano;
   private int Pos;
   private String Clubes;
   private int Vitorias;
   private int Derrotas;
   private int Empates;

    public int getAno() {
        return Ano;
    }

    public void setAno(int Ano) {
        this.Ano = Ano;
    }

    public int getPos() {
        return Pos;
    }

    public void setPos(int Pos) {
        this.Pos = Pos;
    }

    public String getClubes() {
        return Clubes;
    }

    public void setClubes(String Clubes) {
        this.Clubes = Clubes;
    }

    public int getVitorias() {
        return Vitorias;
    }

    public void setVitorias(int Vitorias) {
        this.Vitorias = Vitorias;
    }

    public int getDerrotas() {
        return Derrotas;
    }

    public void setDerrotas(int Derrotas) {
        this.Derrotas = Derrotas;
    }

    public int getEmpates() {
        return Empates;
    }

    public void setEmpates(int Empates) {
        this.Empates = Empates;
    }

   
   
  
   
    
    @Override    
    public int compareTo(Dados outroDado){
      return this.getClubes().
              compareTo(outroDado.getClubes());
    }
    
     @Override
    public String toString(){
        return getClubes()+ " : " + getPos();
    }
        @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dados dados = (Dados) o;
        return Clubes.equals(dados.Clubes);
    }
        
}
