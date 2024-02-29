import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

public class ReportGenerator {

    public static final String REPORT_SIMPLE_MOVIES = "SimpleMovie.jasper";
    
    public static JasperPrint generateReportSimpleMovies() {
        JasperPrint reportFilled = null;
        try {
            // Cargar el archivo del informe como un recurso utilizando ClassLoader
            InputStream reportStream = ReportGenerator.class.getResourceAsStream(REPORT_SIMPLE_MOVIES);
            
            // Verificar si el archivo del informe se cargó correctamente
            if (reportStream == null) {
                throw new JRException("No se pudo encontrar el archivo del informe: " + REPORT_SIMPLE_MOVIES);
            }
            
            // Llenar el informe
            reportFilled = JasperFillManager.fillReport(reportStream, new HashMap(), Conexion.getMySQLConnection());
        } catch (JRException e) {
            e.printStackTrace();
        }
        return reportFilled;
    }
}
