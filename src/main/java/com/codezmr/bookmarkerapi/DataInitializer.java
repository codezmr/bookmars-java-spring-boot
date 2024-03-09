package com.codezmr.bookmarkerapi;

import com.codezmr.bookmarkerapi.domain.Bookmark;
import com.codezmr.bookmarkerapi.domain.BookmarkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {
    private final BookmarkRepository repository;
    @Override
    public void run(String... args) throws Exception {
        // Assuming "repository" is a JpaRepository instance
        repository.save(new Bookmark(
                null,
                "Java Tutorial - Official Documentation",
                "https://docs.oracle.com/javase/tutorial/",
                Instant.now()
        ));

        repository.save(new Bookmark(
                null,
                "Baeldung - In-depth Java Tutorials",
                "https://www.baeldung.com/",
                Instant.now()
        ));

        repository.save(new Bookmark(
                null,
                "Java Magazine - Advanced Features",
                "https://docs.oracle.com/en/java/",
                Instant.now()
        ));

        repository.save(new Bookmark(
                null,
                "Stack Overflow - Q&A for Java Developers",
                "https://stackoverflow.com/questions/tagged/java",
                Instant.now()
        ));

        repository.save(new Bookmark(
                null,
                "GitHub - Open Source Java Code Repository",
                "https://github.com/Index",
                Instant.now()
        ));

        repository.save(new Bookmark(
                null,
                "Maven Repository - Download Java Libraries",
                "https://search.maven.org/?eh",
                Instant.now()
        ));

        repository.save(new Bookmark(
                null,
                "Javarevisited - Tutorials and Tips",
                "https://javarevisited.blogspot.com/",
                Instant.now()
        ));

        repository.save(new Bookmark(
                null,
                "DZone Java - Articles and Tutorials",
                "https://dzone.com/java",
                Instant.now()
        ));

        repository.save(new Bookmark(
                null,
                "InfoQ Java - Enterprise Development News",
                "https://www.infoq.com/java/",
                Instant.now()
        ));

        repository.save(new Bookmark(
                null,
                "CodeGym - Interactive Java Course",
                "https://codegym.cc/",
                Instant.now()
        ));

        repository.save(new Bookmark(
                null,
                "The Java™ Tutorials - More Interactive Tutorials",
                "https://docs.oracle.com/javase/tutorial/",
                Instant.now()
        ));

        repository.save(new Bookmark(
                null,
                "Tutorialspoint Java - Tutorials and References",
                "https://www.javatpoint.com/",
                Instant.now()
        ));

        repository.save(new Bookmark(
                null,
                "Programiz Java - Tutorials and Exercises",
                "https://www.programiz.com/java-programming",
                Instant.now()
        ));

        repository.save(new Bookmark(
                null,
                "GeeksforGeeks Java - Interview Questions",
                "https://www.geeksforgeeks.org/core-java-interview-questions-for-freshers/",
                Instant.now()
        ));

        repository.save(new Bookmark(
                null,
                "CodinGame Java - Coding Challenges",
                "https://www.codingame.com/work/java-interview-questions/",
                Instant.now()
        ));

        repository.save(new Bookmark(
                null,
                "LeetCode Java - Coding Practice Problems",
                "https://leetcode.com/problemset/",
                Instant.now()
        ));

        repository.save(new Bookmark(
                null,
                "HackerRank Java - Coding Challenges",
                "https://www.hackerrank.com/domains/java",
                Instant.now()
        ));

        repository.save(new Bookmark(
                null,
                "jOOQ - SQL Generation Library",
                "https://www.jooq.org/",
                Instant.now()
        ));

        repository.save(new Bookmark(
                null,
                "Spring - Enterprise Java Framework",
                "https://spring.io/",
                Instant.now()
        ));

        repository.save(new Bookmark(
                null,
                "Jakarta EE - Java Enterprise Development",
                "https://projects.eclipse.org/projects/ee4j.jakartaee-platform",
                Instant.now()
        ));

    }
}
