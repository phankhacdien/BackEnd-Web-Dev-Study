package Exercise2;

import java.time.Month;
import java.util.Scanner;

public class UI {
    public void run(){
        Scanner scanner = new Scanner(System.in);
        LibraryManager app = new LibraryManager();

        while (true) {
            System.out.println("Enter 1: Insert new Document");
            System.out.println("Enter 2: Delete document by barcode");
            System.out.println("Enter 3: Show Document Information by barcode");
            System.out.println("Enter 4: Search Document by type: Book, Magazine, Newspaper");
            System.out.println("Enter 5: Exit");

            int func = Integer.parseInt(scanner.nextLine());

            switch (func) {
                case 1: {
                    System.out.println("Enter a: Insert new Book");
                    System.out.println("Enter b: Insert new Magazine");
                    System.out.println("Enter c: Insert new Newspaper");

                    String type = scanner.nextLine();

                    switch (type) {
                        case "a": {
                            System.out.print("Enter Book barcode: "); String doc_barcode = scanner.nextLine();
                            System.out.print("Enter Book Introducer: "); String introducer = scanner.nextLine();
                            System.out.print("Enter Book Release number: "); int release_num = Integer.parseInt(scanner.nextLine());
                            System.out.print("Enter Book page quantity: "); int page_qty = Integer.parseInt(scanner.nextLine());
                            Document new_doc = new Book(doc_barcode, introducer, release_num, page_qty);
                            app.insert(new_doc);
                            break;
                        }
                        case "b": {
                            System.out.print("Enter Magazine barcode: "); String doc_barcode = scanner.nextLine();
                            System.out.print("Enter Magazine Introducer: "); String introducer = scanner.nextLine();
                            System.out.print("Enter Magazine Release number: "); int release_num = Integer.parseInt(scanner.nextLine());
                            System.out.print("Enter Magazine page quantity: "); int page_qty = Integer.parseInt(scanner.nextLine());
                            System.out.print("Enter Magazine release's number: "); int release_no = Integer.parseInt(scanner.nextLine());
                            System.out.print("Enter Magazine release's month: "); Month release_month = Month.valueOf(scanner.nextLine());
                            Document new_doc = new Magazine(doc_barcode, introducer, release_num, page_qty, release_no, release_month);
                            app.insert(new_doc);
                            break;
                        }
                        case "c": {
                            System.out.print("Enter Newspaper barcode: "); String doc_barcode = scanner.nextLine();
                            System.out.print("Enter Newspaper Introducer: "); String introducer = scanner.nextLine();
                            System.out.print("Enter Newspaper Release number: "); int release_num = Integer.parseInt(scanner.nextLine());
                            System.out.print("Enter Newspaper page quantity: "); int page_qty = Integer.parseInt(scanner.nextLine());
                            System.out.print("Enter Newspaper release's number: "); int release_no = Integer.parseInt(scanner.nextLine());
                            System.out.print("Enter Newspaper release's month: "); Month release_month = Month.valueOf(scanner.nextLine());
                            System.out.print("Enter Newspaper release's day: "); int release_day = Integer.parseInt(scanner.nextLine());
                            Document new_doc = new Newspaper(doc_barcode, introducer, release_num, page_qty, release_no, release_month, release_day);
                            app.insert(new_doc);
                            break;
                        }
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                }
                case 2: {
                    System.out.println("Enter Document barcode: ");
                    String del_barcode = scanner.nextLine();
                    app.Delete(del_barcode);
                    break;
                }
                case 3: {
                    System.out.println("Enter Document barcode: ");
                    String getInfo_barcode = scanner.nextLine();
                    app.showDocumentInfo(getInfo_barcode);
                    break;
                }
                case 4: {
                    System.out.println("Enter a: Search all Book");
                    System.out.println("Enter b: Search all Magazine");
                    System.out.println("Enter c: Search all Newspaper");

                    String type = scanner.nextLine();

                    switch (type) {
                        case "a": {
                            app.find("Book");
                            break;
                        }
                        case "b": {
                            app.find("Magazine");
                            break;
                        }
                        case "c": {
                            app.find("Newspaper");
                            break;
                        }
                    }
                    break;
                }
                case 5:{
                    return;
                }
                default:
                    System.out.println("Invalid");
            }
        }
    }
}
