package dao;

import java.util.List;

import entities.printer.RIP;

public interface RipDao {
    void create(  RIP  rip );
    RIP find( int id );
    int find(String name);
    List<RIP> findAll();
    void update(int id, RIP  rip);
    void delete (int id);
}
