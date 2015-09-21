package dao;

import java.util.List;

import entities.printer.CompatibleInk;

public interface CompatibleInkDao {
    void create(  CompatibleInk  compatibleInk );
    CompatibleInk find( int id );
    int find(String name);
    List<CompatibleInk> findAll();
    void update(int id, CompatibleInk  compatibleInk);
    void delete (int id);
}
