package com.dsa.avlvisualizer;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/avl")
@CrossOrigin(origins = "*")
public class AvlController {

    private AvlTree avlTree = new AvlTree();

    @PostMapping("/insert/{value}")
    public String insert(@PathVariable int value) {
        avlTree.insert(value);
        return "Inserted " + value;
    }

    @GetMapping("/root")
    public AvlNode getRoot() {
        return avlTree.getRoot();
    }

    // RESET TREE
    @PostMapping("/reset")
    public String reset() {
        avlTree = new AvlTree();
        return "Tree reset";
    }
}
