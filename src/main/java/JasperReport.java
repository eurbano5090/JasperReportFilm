import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class JasperReport {
	
	public static void main(String[] args) throws JRException {
		
		JasperPrint reporteLLeno= ReportGenerator.generateReportSimpleMovies();
		JasperViewer viewer = new JasperViewer(reporteLLeno);
		viewer.setVisible(true);
	//	JasperExportManager.exportReportToPdf(reporteLLeno);
	}
}
