package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class LibraryController {

    private List<Book> bookList = new ArrayList<>();

    // 2️⃣ /welcome
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to the Online Library System!";
    }

    // 3️⃣ /count
    @GetMapping("/count")
    public int totalBooks() {
        return 100;
    }

    // 4️⃣ /price
    @GetMapping("/price")
    public double bookPrice() {
        return 499.99;
    }

    // 5️⃣ /books
    @GetMapping("/books")
    public List<String> getBookTitles() {
        return Arrays.asList("Java Basics", "Spring Boot Guide", "Data Structures");
    }

    // 6️⃣ /books/{id}
    @GetMapping("/books/{id}")
    public String getBookById(@PathVariable int id) {
        return "Details of Book with ID: " + id;
    }

    // 7️⃣ /search?title=Java
    @GetMapping("/search")
    public String searchBook(@RequestParam String title) {
        return "Searching for book with title: " + title;
    }

    // 8️⃣ /author/{name}
    @GetMapping("/author/{name}")
    public String getAuthor(@PathVariable String name) {
        return "Books written by Author: " + name;
    }

    // 9️⃣ /addbook (POST)
    @PostMapping("/addbook")
    public String addBook(@RequestBody Book book) {
        bookList.add(book);
        return "Book added successfully!";
    }

    // 🔟 /viewbooks
    @GetMapping("/viewbooks")
    public List<Book> viewBooks() {
        return bookList;
    }
}
