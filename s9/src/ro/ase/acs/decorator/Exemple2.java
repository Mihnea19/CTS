package ro.ase.acs.decorator;

//interface component
interface Subscription{
    String getDescription();
    double getPrice();
}

//base implementation of an subscriber
class BasicSubscription implements Subscription{
    @Override
    public String getDescription() {
        return "Abonament de baza";
    }

    @Override
    public double getPrice() {
        return 10.0;
    }
}

//abstract decorator
abstract class SubscriptionDecorator implements Subscription{
    protected Subscription subscription;
    public SubscriptionDecorator(Subscription subscription){
        this.subscription= subscription;
    }

    @Override
    public String getDescription() {
        return subscription.getDescription();
    }

    @Override
    public double getPrice() {
        return subscription.getPrice();
    }
}

//decorator for adding options of viewing
class OfflineViewingDecorator extends SubscriptionDecorator{
    public OfflineViewingDecorator(Subscription subscription){
        super(subscription);
    }

    @Override
    public String getDescription() {
        return subscription.getDescription()+ ", vizionare online";
    }

    @Override
    public double getPrice() {
        return subscription.getPrice() + 3.0;
    }
}

//decorator for HD viewing
class HDViewingDecorator extends SubscriptionDecorator{
    public HDViewingDecorator(Subscription subscription){
        super(subscription);
    }

    @Override
    public String getDescription() {
        return subscription.getDescription()+ ", vizionare in HD quality";
    }

    @Override
    public double getPrice() {
        return subscription.getPrice() + 3.0;
    }
}

public class Exemple2 {
    public static void main(String[] args) {
        //creating an user
        Subscription subscription= new BasicSubscription();

        //adding an offline viewing
        subscription= new OfflineViewingDecorator(subscription);

        //adding in hd viewing
        subscription= new HDViewingDecorator(subscription);

        //print the description and final price of the subscription
        System.out.println("Description: "+ subscription.getDescription());
        System.out.println("Price: "+ subscription.getPrice());
    }
}
