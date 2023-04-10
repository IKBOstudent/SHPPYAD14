package com.example.shppyad14.PostOffice;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/postoffices")
public class PostOfficeController {
    private final List<PostOffice> postOffices = new ArrayList<>();

    @GetMapping("")
    public ResponseEntity<List<PostOffice>> getAllPostOffices() {
        return ResponseEntity.ok(postOffices);
    }

    @PostMapping("")
    public ResponseEntity<PostOffice> createPostOffice(@RequestBody PostOffice postOffice) {
        postOffices.add(postOffice);
        return ResponseEntity.ok(postOffice);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePostOffice(@PathVariable int id) {
        if (id >= postOffices.size()) {
            return ResponseEntity.badRequest().body("Invalid id");
        }
        postOffices.remove(id);
        return ResponseEntity.ok("Post office deleted successfully");
    }
}
