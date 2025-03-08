package org.example.pageviews;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PageCountController {

    private final PageCounter pageCounter;

    public PageCountController(PageCounter pageCounter) {
        this.pageCounter = pageCounter;
    }

    @GetMapping("/currentcount")
    public Integer getCurrentPageCount() {
        return pageCounter.getPageCount();
    }
}
