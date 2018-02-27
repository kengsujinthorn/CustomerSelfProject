package self.model;

public class MemberCustomer extends Customer implements Comparable<MemberCustomer> {

    private double points;
    private static double discountRate = 0.2;

    public MemberCustomer() {
    }

    public MemberCustomer(String name, String surname, double points) {
        super(name, surname);
        this.points = points;
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

    public double getPoints() {
        return points;
    }

    @Override
    public double getDiscountRate() {
        return discountRate;
    }

    @Override
    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    @Override
    public double redeemPoint2Cash(int usePoints) {
        if (usePoints > points) {
            System.out.println("Your points are not enough!");
            usePoints = -1;
        } else if (usePoints <= points) {               //1700  2000
            if (usePoints / 800 != 0) {                 //1700 / 800
                usePoints = usePoints / 800;            //2     1700 / 800
                points = points - (usePoints * 800);    //400   2000 - (2*800)
                usePoints = usePoints * 100;            //400   4 * 100
            }
        }
        return usePoints;
    }

    @Override
    public void addPointFromBuyingTotalPrice(double buyinglPrice) {
        if (buyinglPrice / 25 != 0) {       //20 / 25  0.8
            points = buyinglPrice / 25;     //4 200 / 25
            if (points < 1) {
                points = 0;
            }
        }
    }

    public int compareTo(MemberCustomer o) {
        return getName().compareTo(getName());
    }

    @Override
    public String toString() {
        return "MemberCustomer ♥" + "\n Name : " + super.name + "\n Surname" + super.surname + "\n Points : " + points;
    }

}
