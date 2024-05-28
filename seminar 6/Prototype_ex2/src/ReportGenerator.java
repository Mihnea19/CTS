import java.util.HashMap;
import java.util.Map;

public class ReportGenerator {

    private Map<String, Report> reports = new HashMap<>();

    public ReportGenerator() {
    }

    public Report create(String format, String data, String type) throws InterruptedException {
        Report reportToReturn = reports.get(type);
        if(reportToReturn == null)
        {
            System.out.println("Object needs to be created.");
            if(type=="SalesReport")
                reportToReturn = new SalesReport(format,data);
            else
               // reportToReturn = new ReportGenerator();

            this.reports.put(type,reportToReturn);
        }

        return reportToReturn.clone();
    }

}
