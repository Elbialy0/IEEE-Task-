public class BookClass {
    private String name;
    private String author;
    private int numPages;
    private String publishDate;
    public void create(String name , String author , int numPages, String publishDate)
    {
        this.name=name;
        this.author=author;
        this.numPages=numPages;
        this.publishDate=publishDate;
    }
    public void updateName(String name)
    {
        this.name=name;
    }
    public void updateAuthor(String author)
    {
        this.author=author;
    }
    public void updateNumPages(int numpPages)
    {
       this.numPages=numpPages;
    }
    public void updatePublishDate(String publishDate)
    {
        this.publishDate=publishDate;
    }
    public void delete()
    {
        this.name=null;
        this.author=null;
        this.numPages=0;
        this.publishDate=null;
    }
    public void showAll()
    {
        System.out.println(" Book Name: "+name+" Author: "+author+ " Number of pages: "+numPages+" Publish date: "+publishDate);
    }
}
