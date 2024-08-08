package solidDemo.interfaceSegregation;

class Printer implements PrintDocument, ScanDocument ,faxDocument {
    public void printDocument() {
        System.out.println("Printer");
    }
    public void scanDocument() {
        System.out.println("Scanner");
    }
    @Override
    public void faxDocument() {
        System.out.println("fax");
    }
}
public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.scanDocument();
        printer.printDocument();
        printer.faxDocument();
    }
}
