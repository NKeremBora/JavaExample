package org.example.service;

import org.example.model.House;
import org.example.repository.HouseRepository;

import java.util.List;
import java.util.stream.Collectors;

public class HouseService {

    private final HouseRepository repository;

    public HouseService(HouseRepository repository) {
        this.repository = repository;
    }

    public double getTotalPriceOfHouses() {
        return repository.getHouseList().stream().mapToDouble(House::getPrice).sum();
    }

    public double getTotalPriceOfVillas() {
        return repository.getVillaList().stream().mapToDouble(House::getPrice).sum();
    }

    public double getTotalPriceOfSummerHouses() {
        return repository.getSummerHouseList().stream().mapToDouble(House::getPrice).sum();
    }

    public double getTotalPriceOfAllHouses() {
        return repository.getAllHouses().stream().mapToDouble(House::getPrice).sum();
    }

    public double getAverageSquareMetersOfHouses() {
        return repository.getHouseList().stream().mapToDouble(House::getSquareMeters).average().orElse(0);
    }

    public double getAverageSquareMetersOfVillas() {
        return repository.getVillaList().stream().mapToDouble(House::getSquareMeters).average().orElse(0);
    }

    public double getAverageSquareMetersOfSummerHouses() {
        return repository.getSummerHouseList().stream().mapToDouble(House::getSquareMeters).average().orElse(0);
    }

    public double getAverageSquareMetersOfAllHouses() {
        return repository.getAllHouses().stream().mapToDouble(House::getSquareMeters).average().orElse(0);
    }

    public List<House> filterHousesByRoomAndLivingRoom(int roomCount, int livingRoomCount) {
        return repository.findByRoomCountAndLivingRoomCount(roomCount, livingRoomCount);
    }
}