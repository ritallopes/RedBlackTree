package br.ufrn.imd.edb2;

public class Pessoa implements Comparable<Pessoa> {
    Integer id = null;

    public Pessoa(Integer id){
        this.id = id;
    }

    @Override
    public int compareTo(Pessoa o) {
        return id.compareTo(o.id);
    }

    @Override
    public String toString() {
        return "ID: "+ id;
    }
}
