package day21;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Document {
    List<Page> pages = Arrays.asList(new Page("content1"), new Page("content2"), new Page("content3"));

    public String getPageContent(int pageNumber) {
        return this.pages.get(pageNumber).getContent();
    }

    public static Stream<Page> createPageFrom(Stream<String> contents) {
        return contents.map(Page::new);
    }

    public static void printDocuments(List<Page> pages) {
        pages.stream()
                .map(Page::getContent)
                .forEach(Printers::print);
    }

    public static void main(String[] args) {
        Document d = new Document();
        String s = d.getPageContent(1);
        System.out.println(s);

        printDocuments(Arrays.asList(new Page("content4"), new Page("content5"), new Page("content6")));


    }
}
