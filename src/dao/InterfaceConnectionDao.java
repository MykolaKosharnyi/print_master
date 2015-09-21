package dao;

import java.util.List;

import entities.printer.InterfaceConnection;

public interface InterfaceConnectionDao {
    void create(  InterfaceConnection  interfaceConnection );
    InterfaceConnection find( int id );
    int find(String name);
    List<InterfaceConnection> findAll();
    void update(int id, InterfaceConnection  interfaceConnection);
    void delete (int id);
}
