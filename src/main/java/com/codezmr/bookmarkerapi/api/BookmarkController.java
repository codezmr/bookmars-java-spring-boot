package com.codezmr.bookmarkerapi.api;

import com.codezmr.bookmarkerapi.domain.Bookmark;
import com.codezmr.bookmarkerapi.domain.BookmarkService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/bookmarks")
@RequiredArgsConstructor
public class BookmarkController {
    private final BookmarkService service;

    @GetMapping
    public List<Bookmark> getBookmarks(){
        return service.getBookmarks();
    }
}
