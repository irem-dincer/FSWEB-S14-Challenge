package org.example.models;

public class HealthyBurger extends Hamburger{
private String  healthyExtra1Name;
private double  healthyExtra1Price;
private String  healthyExtra2Name;
private double  healthyExtra2Price;


public HealthyBurger(String name,double price,String breadType){
    super(name,"Tofu",price,breadType);

}

public void addHealthyAddition1(String healthyExtra1Name, double healthyExtra1Price){
    this.healthyExtra1Name=healthyExtra1Name;
    this.healthyExtra1Price=healthyExtra1Price;
    System.out.println("Extra: "+healthyExtra1Name+" price: "+healthyExtra1Price);
}
    public void addHealthyAddition2(String healthyExtra2Name, double healthyExtra2Price){
        this.healthyExtra2Name=healthyExtra2Name;
        this.healthyExtra2Price=healthyExtra2Price;
        System.out.println("Extra: "+healthyExtra2Name+" price: "+healthyExtra2Price);
    }

@Override
public String itemizeHamburger(){
    System.out.println("extra:"+healthyExtra1Name);
    System.out.println("extra:"+healthyExtra2Name);

    double totalPrice=super.getPrice();

    if(healthyExtra1Name != null){
        totalPrice +=healthyExtra1Price;
    }
    if(healthyExtra2Name != null){
        totalPrice +=healthyExtra2Price;
    }
    return  "HealthyHamburger : "+getName()+" HealthyHamburger  + Tüm malzemeler: "+totalPrice;

}
    @Override
    public double getPrice() {
        double totalPrice = super.getPrice();  // Hamburger fiyatı + hamburger eklentileri

        if(healthyExtra1Name != null) {
            totalPrice += healthyExtra1Price;
        }
        if(healthyExtra2Name != null) {
            totalPrice += healthyExtra2Price;
        }

        return totalPrice;  // Toplam fiyat (hamburger + hamburger eklentileri + healthyBurger eklentileri)
    }


}
