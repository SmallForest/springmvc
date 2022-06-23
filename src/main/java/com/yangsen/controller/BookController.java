package com.yangsen.controller;

import com.yangsen.pojo.Books;
import com.yangsen.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    //controller->service->dao
    @Autowired
    @Qualifier("BooksServiceImpl")
    protected BooksService booksService;

    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books> books = booksService.queryAllBook();
        for (Books book : books) {
            System.out.println(book);
        }
        model.addAttribute("books",books);
        return "allBook";
    }

    @RequestMapping("/toAddPage")
    public String addPage(){
        return "addPage";
    }

    @RequestMapping("/addBook")
    public String addBook(Books books){
        System.out.println("addBook===>"+books);
        booksService.addBook(books);
        return "redirect:/book/allBook";
    }


}
