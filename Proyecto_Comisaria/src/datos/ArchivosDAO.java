package datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Policia;

public class ArchivosDAO {

    public String cargarPolicias(File archivo) {
        int contador_no = 0, contador = 0;
        JDBCDAO jd = new JDBCDAO();
        String datos, nombre, numPlaca, departamento, foto;
        String text, nombres = "";
        Integer idPolicia, edad;
        String[] trozos;
        try (FileReader fr = new FileReader(archivo)) {
            BufferedReader br = new BufferedReader(fr);
            br.readLine();
            while (br.readLine() != null) {
                trozos = br.readLine().split(",");
                idPolicia = Integer.valueOf(trozos[0]);
                nombre = trozos[1];
                numPlaca = trozos[2];
                edad = Integer.valueOf(trozos[3]);
                departamento = trozos[4];
                foto = trozos[5];
                Policia p = new Policia(idPolicia, nombre, numPlaca, edad, departamento, foto);
                try {
                    jd.InsertarPolicias(p);
                    contador++;
                } catch (SQLException ex) {
                    if (ex.getErrorCode() == 1062) {
                        contador_no++;
                        nombres = nombres + " " + nombre;
                    }
                }
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }

        if (contador_no == 0) {
            text = "No se han insertado policías.";
        } else if (contador_no == 1) {
            text = "Número de policias insertados: " + contador + "\nEl policía " + nombres + " ya estaba en la base de datos.";
        } else {
            text = "Número de policias insertados: " + contador + "\nLos policías " + nombres + " ya estaban insertados."
                    + "\n" + "No se han insertado un total de " + contador_no + " policías.";
        }

        return text;
    }

}
