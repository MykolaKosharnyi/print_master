package dao;

import java.util.List;

import entities.printer.EquipmentManufacturer;

public interface EquipmentManufacturerDao {
    void create(  EquipmentManufacturer  equipmentManufacturer );
    EquipmentManufacturer find( int id );
    int find(String name);
    List<EquipmentManufacturer> findAll();
    void update(int id, EquipmentManufacturer  equipmentManufacturer);
    void delete (int id);
}
