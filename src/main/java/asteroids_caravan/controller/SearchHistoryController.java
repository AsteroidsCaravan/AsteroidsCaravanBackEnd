package asteroids_caravan.controller;

import asteroids_caravan.model.SearchHistory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class SearchHistoryController {
    private  List<SearchHistory> searchHistory = new ArrayList<>();

    @GetMapping("/history")
    public List<SearchHistory> index(){
        return searchHistory;
    }

    @PostMapping("/history")
    public ResponseEntity create(@RequestBody SearchHistory history){
        searchHistory.add(history);
        System.out.println("Histórico registrado " + history);
        return ResponseEntity.status(201).body(history);
    }
}
