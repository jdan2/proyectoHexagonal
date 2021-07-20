package infraestructure;

import application.ConsoleApp;
import domain.service.BooksService;
import domain.service.BooksServiceFactory;

public class ApplicationMain {
    public static void main(String[] args) {
        BooksService booksService = BooksServiceFactory.getBooksService(new BooksRepositoryImpl());
        ConsoleApp consoleApp = new ConsoleApp(System.console(), booksService);
        consoleApp.waitForCommand();
    }

}
