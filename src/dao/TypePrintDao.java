package dao;

import java.util.List;

import entities.printer.TypePrint;

public interface TypePrintDao {
    void create(  TypePrint  typePrint );
    TypePrint find( int id );
    int find(String name);
    List<TypePrint> findAll();
    void update(int id, TypePrint  typePrint);
    void delete (int id);
}
