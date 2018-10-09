/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entrenamientogit;

/**
 *
 * @author Ariel
 */
public class Tema {
    String Nomb_Tema, Hora_Conf;

    public Tema(String Nomb_Tema, String Hora_Conf) {
        this.Nomb_Tema = Nomb_Tema;
        this.Hora_Conf = Hora_Conf;
    }

    public String getNomb_Tema() {
        return Nomb_Tema;
    }

    public void setNomb_Tema(String Nomb_Tema) {
        this.Nomb_Tema = Nomb_Tema;
    }

    public String getHora_Conf() {
        return Hora_Conf;
    }

    public void setHora_Conf(String Hora_Conf) {
        this.Hora_Conf = Hora_Conf;
    }
    
    
    
}
