package Controller;

import Entity.Book;
import Entity.Document;
import Entity.Magazine;
import Entity.Newspaper;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LibraryManager {
    private List<Document> documentList;

    public LibraryManager() {
        this.documentList = new ArrayList<Document>();
    }

    public void addDocument(Document doc) {
        this.documentList.add(doc);
    }

    public void deleteDocByID(String docID) {
        Document del_doc = this.documentList.stream()
                .filter(document -> document.getDocumentID().equals(docID))
                .findAny().orElse(null);

        if (del_doc == null) {
            System.out.println("Cannot find document with document ID: " + docID);
        } else {
            System.out.print("This doc will be delete: " + del_doc.toString());
            this.documentList.remove(del_doc);
        }
    }

    public void showDocumentInfoByID(String docID) {
        this.documentList.stream()
                .filter(document -> document.getDocumentID().contains(docID))
                .forEach(System.out::println);
    }

    public void searchingByDocumentType(Class docType){
        if (docType == Book.class) {
            this.documentList.stream()
                    .filter(document -> document instanceof Book).forEach(System.out::println);
        } else if (docType == Magazine.class) {
            this.documentList.stream()
                    .filter(document -> document instanceof Magazine).forEach(System.out::println);
        } else {
            this.documentList.stream()
                    .filter(document -> document instanceof Newspaper).forEach(System.out::println);
        }
    }
}
