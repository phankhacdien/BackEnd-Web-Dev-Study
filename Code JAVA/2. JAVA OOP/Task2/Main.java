import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibraryManager app = new LibraryManager();

        while (true) {
            System.out.println("Enter 1: Insert new Document");
            System.out.println("Enter 2: Delete document by barcode");
            System.out.println("Enter 3: Show Document Information");
            System.out.println("Enter 4: Exit");

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
                            System.out.print("Enter Magazine release's month: "); String release_month = scanner.nextLine();
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
                            System.out.print("Enter Newspaper release's month: "); String release_month = scanner.nextLine();
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
                }
            }
        }
    }
}
