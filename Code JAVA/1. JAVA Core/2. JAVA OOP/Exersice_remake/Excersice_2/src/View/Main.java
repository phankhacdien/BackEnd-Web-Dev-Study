package View;

import Controller.LibraryManager;
import Entity.Book;
import Entity.Document;
import Entity.Magazine;
import Entity.Newspaper;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibraryManager libraryManager = new LibraryManager();

        while (true) {
            System.out.println("Library Manager System");
            System.out.println("Enter 1: Add new Document");
            System.out.println("Enter 2: Delete Document by Document ID");
            System.out.println("Enter 3: Show Document Information by ID");
            System.out.println("Enter 4: Filter Document by Type");

            int func = Integer.valueOf(scanner.nextLine());

            switch (func) {
                case 1: {
                    System.out.println("Enter 1: To add a Book to Library Doc List.");
                    System.out.println("Enter 2: To add a Magazine to Library Doc List.");
                    System.out.println("Enter 3: To add a Newspaper to Library Doc List.");

                    int addOption = Integer.valueOf(scanner.nextLine());

                    System.out.print("Enter Document Name: "); String docName = scanner.nextLine();
                    System.out.print("Enter Document ID: "); String docID = scanner.nextLine();
                    System.out.print("Enter Producer name: "); String producer = scanner.nextLine();
                    System.out.print("Enter Quantity of Docs: "); int qty = Integer.valueOf(scanner.nextLine());

                    switch (addOption) {
                        case 1: {
                            System.out.print("Enter name of Author: "); String authorName = scanner.nextLine();
                            System.out.print("Enter quantity of page: "); int pageQty = Integer.valueOf(scanner.nextLine());
                            libraryManager.addDocument(new Book(docName, docID, producer, qty, authorName, pageQty));
                            break;
                        }
                        case 2: {
                            System.out.print("Enter Circulation No: "); int circulationNo = Integer.valueOf(scanner.nextLine());
                            System.out.print("Enter Circulation Month: "); Month circulationMonth = Month.valueOf(scanner.nextLine());
                            libraryManager.addDocument(new Magazine(docName, docID, producer, qty, circulationNo, circulationMonth));
                            break;
                        }
                        case 3: {
                            System.out.print("Enter Circulation Day: "); int circulationDay = Integer.valueOf(scanner.nextLine());
                            libraryManager.addDocument(new Newspaper(docName, docID, producer, qty, circulationDay));
                            break;
                        }
                        default: {
                            System.out.println("Invalid");
                            break;
                        }
                    }
                    break;
                }
                case 2: {
                    System.out.print("Enter Document ID to delete: "); String delDocID = scanner.nextLine();
                    libraryManager.deleteDocByID(delDocID);
                    break;
                }
                case 3: {
                    System.out.print("Enter Document ID to show Info: "); String showDocID = scanner.nextLine();
                    libraryManager.showDocumentInfoByID(showDocID);
                    break;
                }
                case 4: {
                    System.out.println("Enter 1: To show all Books");
                    System.out.println("Enter 2: To show all Magazines");
                    System.out.println("Enter 3: To show all Newspapers");

                    int showType = Integer.valueOf(scanner.nextLine());

                    switch (showType) {
                        case 1: {
                            libraryManager.searchingByDocumentType(Book.class);
                            break;
                        }
                        case 2: {
                            libraryManager.searchingByDocumentType(Magazine.class);
                            break;
                        }
                        case 3: {
                            libraryManager.searchingByDocumentType(Newspaper.class);
                            break;
                        }
                    }
                    break;
                }
                default: {
                    System.out.println("Invalid");
                    break;
                }
            }
        }
    }
}
