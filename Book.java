class Book
{ 
  public static void read()
  {   
      int page_no=100;
	  System.out.println("read");
	  
  }
  public static void write()
  {
	  int page_no=678;
	  System.out.println("page_no:"+page_no);
  }
  public static void learn(String daily)
  {
	  System.out.println("daily:"+daily);
  }	
  public static void main(String[] args)
  {
	  read();
	  write();
	  learn("10 hours");
  }
}