public interface Report {
    Report clone();
    void setData(String data);
    void setFormat(String format);
    void generateReport();
}


class SalesReport implements  Report{
    private String format;
    private String data;
    SalesReport(String format, String data){
        this.format= format   ;
        this.data=data;
    }

    @Override
    public Report clone() {
        return new SalesReport(this.format, this.data);
    }

    @Override
    public void setData(String data) {
        this.data= data;
    }

    @Override
    public void generateReport() {
        System.out.println("Sales report");
        System.out.println("Format: "+ this.format);
        System.out.println("Data: "+ this.data);
    }

    @Override
    public void setFormat(String format) {
        this.format= format;
    }
}