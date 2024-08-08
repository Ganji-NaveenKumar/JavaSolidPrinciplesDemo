package solidDemo.interfaceSegregation;
class PrinterClass implements PrintDocument {
    @Override
    public void printDocument() {
        // Print document logic here
        System.out.println("Printing document");
    }
}