package Modelo;

import java.util.Objects;

public class Porta {
    private int id;
    private static int i = 0;
    private boolean temCarro;
    private boolean aberta;

    public Porta(boolean temCarro){
        this.id = i++;
        this.temCarro = temCarro;
        this.aberta = false;
    }


    public boolean isTemCarro() {
        return temCarro;
    }

    public boolean isAberta(){
        return aberta;
    }

    public void setAberta(boolean aberta){
        this.aberta = aberta;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Porta porta = (Porta) o;
        return id == porta.id &&
                temCarro == porta.temCarro;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, temCarro);
    }
/*
    @Override
    public String toString(){
        return "ID: " + id | "Tem Carro? " + temCarro;
    }
*/
   @Override
   public String toString(){
        return "ID: " + id + " | Carro: " + temCarro; }
}
