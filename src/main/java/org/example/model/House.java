package org.example.model;

public class House {
    private HouseType type;
    private double price;
    private double squareMeters;
    private int roomCount;
    private int livingRoomCount;

    public House(HouseType type, double price, double squareMeters, int roomCount, int livingRoomCount) {
        this.type = type;
        this.price = price;
        this.squareMeters = squareMeters;
        this.roomCount = roomCount;
        this.livingRoomCount = livingRoomCount;
    }

    public HouseType getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public double getSquareMeters() {
        return squareMeters;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public int getLivingRoomCount() {
        return livingRoomCount;
    }

    @Override
    public String toString() {
        return "House{" +
                "type=" + type +
                ", price=" + price +
                ", squareMeters=" + squareMeters +
                ", roomCount=" + roomCount +
                ", livingRoomCount=" + livingRoomCount +
                '}';
    }
}