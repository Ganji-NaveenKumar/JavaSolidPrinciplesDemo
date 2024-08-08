package solidDemo.interfaceSegregation;
class FaxMachine implements faxDocument {
    @Override
    public void faxDocument() {
        // Fax document logic here
        System.out.println("Faxing document...");
    }
}