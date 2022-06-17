

package br.com.ifsc.internacionalizacao;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal {

    public static void main(String[] args) {
        PaginaPrincipal pagina = new PaginaPrincipal();
        pagina.setVisible(true);
    }
}
