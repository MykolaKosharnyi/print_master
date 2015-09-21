package dao;

import java.util.List;

import entities.printer.Feed;

public interface FeedDao {
    void create(  Feed  feed );
    Feed find( int id );
    int find(String name);
    List<Feed> findAll();
    void update(int id, Feed  feed);
    void delete (int id);
}
