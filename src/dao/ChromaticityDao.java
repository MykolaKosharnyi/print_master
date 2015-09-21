package dao;

import java.util.List;

import entities.printer.Chromaticity;

public interface ChromaticityDao {
    void create(  Chromaticity  chromaticity );
    Chromaticity find( int id );
    int find(String name);
    List<Chromaticity> findAll();
    void update(int id, Chromaticity  chromaticity);
    void delete (int id);
}
