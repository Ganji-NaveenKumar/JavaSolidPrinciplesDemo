package solidDemo.interfaceSegregation;
class Scanner implements ScanDocument {
    @Override
    public void scanDocument() {
        // Scan document logic here
        System.out.println("Scanning document...");
    }
}