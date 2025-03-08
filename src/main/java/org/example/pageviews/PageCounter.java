package org.example.pageviews;

import org.springframework.stereotype.Component;

@Component
public class PageCounter {
    private Integer pageCounter = 0;

    public void incrementCount() {
        pageCounter++;
    }

    public Integer getPageCount() {
        return pageCounter;
    }
}
