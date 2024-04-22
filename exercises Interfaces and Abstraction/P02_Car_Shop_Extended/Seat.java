package Car_Shop_Extend_01;

public class Seat extends CarImpl implements Sellable {


    private Double price;
    public Seat(String model, String color, int horsePower, String countryProduced, Double price) {
        super(model, color, horsePower, countryProduced);
        this.price=price;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}
