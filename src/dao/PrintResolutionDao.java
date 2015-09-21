package dao;

import java.util.List;

import entities.printer.PrintResolution;

public interface PrintResolutionDao {
    void create(  PrintResolution  printResolution );
    PrintResolution find( int id );
    int find(String name);
    List<PrintResolution> findAll();
    void update(int id, PrintResolution  printResolution);
    void delete (int id);
}
