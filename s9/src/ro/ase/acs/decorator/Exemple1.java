package ro.ase.acs.decorator;

//we need it when we need an extra functionality than just the one from the classes

interface DataService{
    String fetchData();
}

class DataServiceConcrete implements DataService{
    public String fetchData(){
        return "Data";
    }
}
class LoggingDecorator implements DataService{
    private DataService wrapper;
    LoggingDecorator(DataService wrapper){
        this.wrapper= wrapper;
    }

    public String fetchData(){
        System.out.println("Fetching data...");
        return wrapper.fetchData();
    }
}

public class Exemple1 {
    public static void main(String[] args) {
        //usage
        DataService myDataService = new LoggingDecorator(new DataServiceConcrete());
        System.out.println(myDataService.fetchData());

        //create the actual data service object
        DataService realDataService = new DataServiceConcrete();

        //decorate the realDataService with LoggingDecorator
        DataService loggedDataService= new LoggingDecorator(realDataService);

        //use the decorated service to fetch data
        String data = loggedDataService.fetchData();
        System.out.println("Data retrieved: "+ data);
    }
}
