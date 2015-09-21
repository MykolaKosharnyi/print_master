package dao;

import java.util.List;

import entities.printer.SizeDrops;

public interface SizeDropsDao {
    void create(  SizeDrops  sizeDrops );
    SizeDrops find( int id );
    int find(String name);
    List<SizeDrops> findAll();
    void update(int id, SizeDrops  sizeDrops);
    void delete (int id);
}
