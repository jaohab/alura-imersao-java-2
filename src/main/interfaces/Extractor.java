package main.interfaces;

import java.util.List;

import main.functions.Content;

public interface Extractor {

    public List<Content> contents(String apiUrl);
    public void showContent(String apiUrl);
    
}
