package builder.example;

public class Car implements CarInterface{

    private int id;
    private String model;
    private int year;
    private int engineSize;
    private int seats;
    private String color;

    private Car(CarBuilder builder) {
        this.id = builder.id;
        this.color = builder.color;
        this.model = builder.model;
        this.seats = builder.seats;
        this.year = builder.year;
        this.engineSize = builder.engineSize;
    }

    @Override
    public String toString(){
        return this.id + " " + this.model + " " + this.color;
    }
    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public int getSeats() {
        return seats;
    }

    public String getColor() {
        return color;
    }

    public static class CarBuilder {

        private int id;
        private String model;
        private int year;
        private int engineSize;
        private int seats;
        private String color;

        public CarBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public CarBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        public CarBuilder setEngineSize(int engineSize) {
            this.engineSize = engineSize;
            return this;
        }

        public CarBuilder setSeats(int seats) {
            this.seats = seats;
            return this;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public Car build() {
            return new Car(this);
        }

    }

}
