package com.reactfrontend.graphql;
import java.util.ArrayList;
import java.util.List;


public class LinkRepository {
    private final List<Link> links;

    public LinkRepository() {
        this.links =  new ArrayList<>();
        links.add(new Link("http://reactfrontend.com", "GraphQL Java CORS application"));
        links.add(new Link("http://graphql.org/learn/", "The official docs"));
    }


    public List<Link> getAllLinks() {
        return links;
    }

    public void saveLink(Link link) {
        links.add(link);
    }
}
