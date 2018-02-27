package self.model;


public abstract class Customer {
   
    protected String name;
    protected String surname;

    public Customer() {
    }

    public Customer(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public abstract double getDiscountRate();
    public abstract void setDiscountRate(double discountRate);
    public abstract double redeemPoint2Cash(int usePoints);
    public abstract void addPointFromBuyingTotalPrice(double buyinglPrice);

    @Override
    public String toString() {
        return "Customer ♥" + "\nName : " + name + "\nSurname : " + surname;
    }
    
    
    
}
