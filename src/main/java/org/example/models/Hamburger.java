package org.example.models;

public class Hamburger {

private  String name;
private  String meat;
private double price;
private String breadRollType;

    private String addition1Name;
    private   double addition1Price;
    private String addition2Name;
    private  double addition2Price;
    private  String addition3Name;
    private   double addition3Price;
    private String addition4Name;
    private   double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType){
        this.name=name;
        this.meat=meat;
        this.price=price;
        this.breadRollType=breadRollType;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getMeat() {
        return this.meat;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void setBreadRollType(String breadRollType) {
        this.breadRollType = breadRollType;
    }

    public String getBreadRollType() {
        return this.breadRollType;
    }

    public void  addHamburgerAddition1(String addition1Name, double addition1Price){
        this.addition1Name=addition1Name;
        this.addition1Price=addition1Price;
        System.out.println("extra: "+addition1Name+" price:"+addition1Price);
    }
    public void  addHamburgerAddition2(String addition2Name,double addition2Price){
        this.addition2Name=addition2Name;
        this.addition2Price=addition2Price;
        System.out.println("extra: "+addition2Name+" price:"+addition2Price);
    }
    public void  addHamburgerAddition3(String addition3Name,double addition3Price){
        this.addition3Name=addition3Name;
        this.addition3Price=addition3Price;
        System.out.println("extra: "+addition3Name+" price:"+addition3Price);
    }
    public void  addHamburgerAddition4(String addition4Name,double addition4Price){
        this.addition4Name=addition4Name;
        this.addition4Price=addition4Price;
        System.out.println("extra: "+addition4Name+" price:"+addition4Price);
    }
    public String itemizeHamburger() {

        System.out.println("extra:" + addition1Name);
        System.out.println("extra:" + addition2Name);
        System.out.println("extra:" + addition3Name);
        System.out.println("extra:" + addition4Name);


        double totalPrice = this.price;


        if(addition1Name != null) {
            totalPrice += addition1Price;
        }
        if(addition2Name != null) {
            totalPrice += addition2Price;
        }
        if(addition3Name != null) {
            totalPrice += addition3Price;
        }
        if(addition4Name != null) {
            totalPrice += addition4Price;
        }

        return "Hamburger: " + this.getName() + " Hamburger + Tüm malzemeler: " + totalPrice;
    }

    public double getPrice() {
        double totalPrice = this.price;

        if(addition1Name != null) {
            totalPrice += addition1Price;
        }
        if(addition2Name != null) {
            totalPrice += addition2Price;
        }
        if(addition3Name != null) {
            totalPrice += addition3Price;
        }
        if(addition4Name != null) {
            totalPrice += addition4Price;
        }

        return totalPrice;  // Toplam fiyat (hamburger + eklentiler)
    }



}


