package Desafio04;


            public class SmartTv {
                boolean ligada = false;
                boolean desligada = true;
                int volume = 10;
                int canal;


                public SmartTv() {
                }

                public SmartTv(boolean ligada, boolean desligada, int volume, int canal) {
                    this.ligada = ligada;
                    this.desligada = desligada;
                    this.volume = volume;
                    this.canal = canal;
                }

                public boolean getLigada() {
                    return ligada;
                }

                public void setLigada(boolean ligada) {
                    this.ligada = ligada;
                }

                public boolean getDesligada() {
                    return desligada;
                }

                public void setDesligada(boolean desligada) {
                    this.desligada = desligada;
                }

                public int getVolume() {
                    return volume;
                }

                public void setVolume(int volume) {
                    this.volume = volume;
                }

                public int getCanal() {
                    return canal;
                }

                public void setCanal(int canal) {
                    this.canal = canal;
                }

                public void aumentarVolume(int novoVolume) {
                    this.volume++;

                }

                public void diminuirVolume(int novoVolume) {
                    this.volume--;

                }
            }




