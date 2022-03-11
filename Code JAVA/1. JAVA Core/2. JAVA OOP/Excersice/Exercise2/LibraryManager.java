package Exercise2;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class LibraryManager {
    private List<Document> docs;

    public LibraryManager() {
        this.docs = new ArrayList<Document>();
    }

    public void insert(Document doc){
        this.docs.add(doc);
    }

    public void Delete(String del_barcode){
        Document del_doc = docs.stream()
                .filter(document -> document.doc_barcode.equals(del_barcode))
                .findAny().orElse(null);
        this.docs.remove(del_doc);
    };

    public void showDocumentInfo(String getInfo_barcode) {
        for (Document doc : this.docs){
            if (doc.doc_barcode.equals(getInfo_barcode)){
                System.out.println(doc.toString());
            }
        }
    }

    public void find(@NotNull String find_type) {
        switch (find_type){
            case "Book": {
                this.docs.stream()
                        .filter(document -> document instanceof Book)
                        .forEach(document -> System.out.println(document.toString()));
                break;
                }
            case "Magazine":{
                this.docs.stream()
                        .filter(document -> document instanceof Magazine)
                        .forEach(document -> System.out.println(document.toString()));
                break;
            }
            case "Newspaper":{
                this.docs.stream()
                        .filter(document -> document instanceof Newspaper)
                        .forEach(document -> System.out.println(document.toString()));
                break;
            }
        }
    }
}
