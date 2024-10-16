public class textBook extends Book{
    String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public textBook(){
        super();
        subject = "";
    }

    public textBook(String title, int year, double price, String subject){
        super(title, year, price);
        this.subject = subject;
    }

    public void print() {
        super.print();
        System.out.println("Subject : " +subject);
    }
}
