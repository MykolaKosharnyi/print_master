package dao;

import java.util.List;

import entities.printer.TypeDrops;

public interface TypeDropsDao {
    void create(  TypeDrops  typeDrops );
    TypeDrops find( int id );
    int find(String name);
    List<TypeDrops> findAll();
    void update(int id, TypeDrops  typeDrops);
    void delete (int id);
}
