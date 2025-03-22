package org.example.repository;

import org.example.model.House;
import org.example.model.HouseType;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HouseRepository {

    private final List<House> houses = Arrays.asList(

            new House(HouseType.HOUSE, 100000, 80, 3, 1),
            new House(HouseType.HOUSE, 120000, 90, 4, 1),
            new House(HouseType.HOUSE, 95000, 85, 3, 1),

            new House(HouseType.VILLA, 350000, 220, 6, 2),
            new House(HouseType.VILLA, 320000, 210, 5, 2),
            new House(HouseType.VILLA, 330000, 215, 5, 2),

            new House(HouseType.SUMMER_HOUSE, 210000, 155, 4, 1),
            new House(HouseType.SUMMER_HOUSE, 220000, 160, 4, 1),
            new House(HouseType.SUMMER_HOUSE, 205000, 150, 3, 1)
    );

    public List<House> getHouseList() {
        return houses.stream()
                .filter(h -> h.getType() == HouseType.HOUSE)
                .collect(Collectors.toList());
    }

    public List<House> getVillaList() {
        return houses.stream()
                .filter(h -> h.getType() == HouseType.VILLA)
                .collect(Collectors.toList());
    }

    public List<House> getSummerHouseList() {
        return houses.stream()
                .filter(h -> h.getType() == HouseType.SUMMER_HOUSE)
                .collect(Collectors.toList());
    }

    public List<House> getAllHouses() {
        return houses;
    }
    public List<House> findByRoomCountAndLivingRoomCount(int roomCount, int livingRoomCount) {
        return houses.stream()
                .filter(h -> h.getRoomCount() == roomCount && h.getLivingRoomCount() == livingRoomCount)
                .collect(Collectors.toList());
    }
}
