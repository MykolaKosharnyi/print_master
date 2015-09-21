package dao;

import java.util.List;

import entities.printer.TypeOfPrinthead;

public interface TypeOfPrintheadDao {
    void create(  TypeOfPrinthead  typeOfPrinthead );
    TypeOfPrinthead find( int id );
    int find(String name);
    List<TypeOfPrinthead> findAll();
    void update(int id, TypeOfPrinthead  typeOfPrinthead);
    void delete (int id);
}
