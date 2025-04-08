package com.senai.Aula04.Exemplos.Veiculos;

public class Moto extends Veiculo{
        private boolean partidaEletrica;

    public Moto(String modelo, int ano, boolean partidaEletrica) {
        super(modelo, ano);
        this.partidaEletrica = partidaEletrica;
    }

    //Aqui o void foi substituido por um boolean para haver um retorno
        public boolean isPartidaEletrica() {
            return partidaEletrica;
        }

        public void setPartidaEletrica(boolean partidaEletrica) {
            this.partidaEletrica = partidaEletrica;
        }

        public void exibirdetalhes(){
            super.exibirDetalhes();
            System.out.println(" partida eletrica: " +(partidaEletrica? "sim" : "não" ));
        }
}
