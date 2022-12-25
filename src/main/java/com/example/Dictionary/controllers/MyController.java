package com.example.Dictionary.controllers;
// Hello This is change
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Dictionary.Repositories.DictionaryRepository;
import com.example.Dictionary.models.Dictionary;

@RestController
@RequestMapping("/words")
public class MyController {
    @Autowired
    DictionaryRepository dictionaryRepository;

    @GetMapping("/all")
    public List<Dictionary> getWords()
    {
        List<Dictionary> words = new ArrayList<Dictionary>();
        dictionaryRepository.findAll().forEach(word -> words.add(word));
        return words;
    }

    @DeleteMapping("/{wrdId}")
    @Transactional
    public String deleteWord(@PathVariable Integer wrdId)
    {
        dictionaryRepository.deleteById(wrdId);
        return "Deleted Successfully";
    }

    @PostMapping("")
    @Transactional
    public Dictionary saveWord(@RequestBody Dictionary dictionary)
    {
        dictionaryRepository.save(dictionary);
        return dictionary;
    }

    
}
