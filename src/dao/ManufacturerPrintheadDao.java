package dao;

import java.util.List;

import entities.printer.ManufacturerPrinthead;

public interface ManufacturerPrintheadDao {
    void create(  ManufacturerPrinthead  manufacturerPrinthead );
    ManufacturerPrinthead find( int id );
    int find(String name);
    List<ManufacturerPrinthead> findAll();
    void update(int id, ManufacturerPrinthead  manufacturerPrinthead);
    void delete (int id);
}
