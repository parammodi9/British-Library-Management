class Book 
{
    String bookname;
    double isbn_no;
    String author_name;
    String Publisher;
    public void book(String bookname,double isbn_no,String author_name,String publisher)
    {
       
        
    }
    public double getbookinfo(String bookname,double isbn_no,String author_name,String publisher)
    {
        double bookinfo = 0;
        System.out.println("Book Information is"+bookinfo);
        return bookinfo;
    }
    
}
class Main
{
public static void main(System args[])
{
    Book b=new Book();
    b.getbookinfo("Pokemon",12345,"Devarsh","Seven");
    
}    
}
