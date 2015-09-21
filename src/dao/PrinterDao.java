package dao;

import java.util.List;

import entities.printer.Printer;

public interface PrinterDao {
    void create(  Printer  printer );
    Printer find( int id );
    List<Printer> findAll();
    void update(int id, Printer  printer);
    void delete (int id);
}
