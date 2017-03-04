/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw02;

/**
 * This Class MainTest Class
 * @version 1
 * @author ercan
 */
public class MainClass {
     /**
     * Main Class Static Tester main method
     * @param args command line strings 
     */
    public static void main(String[] args){
        
        long startTime = System.nanoTime();
        test_ArrayList();
        long endTime = System.nanoTime();
        long totalTime = endTime-startTime;
        System.out.printf("\n\nTook approximately %d milisecond\n", totalTime/1000000);
        
        
        long startTime2 = System.nanoTime();
        test_LinkedList();
        long endTime2 = System.nanoTime();
        long totalTime2 = endTime2-startTime2;
        System.out.printf("\n\nTook approximately %d milisecond\n", totalTime2/1000000);
    }
    
    /**
     * ArrayList test
     */
    private static void test_ArrayList(){
        
        Admin admin = new Admin();
        System.out.println("-----------------------------Created admin!-----------------------------");
        System.out.println("\tView Admin\n"+admin.toString());
        LibraryStaff staff = new LibraryStaff(0, "kenankurt", "1234", "Kenan", "Kurt", "kenankara12@hotmail.com");
        System.out.println();
        System.out.println("-----------------------------Created staff!-----------------------------");
        System.out.println("\tView Staff\n"+staff.toString());
        try 
        {
            admin.add(staff);
            
        } catch (NullPointerException e)
        {
            e.printStackTrace(System.err);
        }
        
        System.out.println();
        System.out.println("-----------------------------Add staff by admin-----------------------------");
        System.out.println("\tAfter added Staff View Admin\n"+admin.toString());
        Books book =new Books("System Programlama", "Author1", "C and C++", 4583);
        Books book2 =new Books("C++", "Author2", "C++", 1234);
        System.out.println();
        System.out.println("-----------------------------Created 2 Books!-----------------------------");
        try 
        {
            staff.addBook(book);
            staff.addBook(book2);
            
        } catch (NullPointerException e)
        {
            e.printStackTrace(System.err);
        }

        System.out.println("-----------------------------Add Books by staff-----------------------------");
        System.out.println("\tAfter added 2 books View books by staff\n"+staff.toString());
      
        LibraryUsers libuser = new LibraryUsers(0, "eliff","222","Elif", "Serap", "elifserap.1@gmail.com");
        System.out.println();
        System.out.println("-----------------------------Created Library User!-----------------------------");
        
        try 
        {
            staff.register(libuser);
        } 
        catch (NullPointerException e)
        {
            e.printStackTrace(System.err);
        }
        //System.out.println();
        System.out.println("-----------------------------Registed Library User by Staff!-----------------------------");
        System.out.println(staff.toString());
        LibraryUsers libuser2 = new LibraryUsers(1, "yagmurcan", "321", "Yagmur", "Can", "yagmurcan2@gmail.com");
        System.out.println();
        System.out.println("-----------------------------Created Library User2!-----------------------------");
        
        try 
        {
            staff.register(libuser2);
        } 
        catch (NullPointerException e)
        {
            e.printStackTrace(System.err);
        }
        System.out.println("\tView Library User 2\n"+libuser2.toString());
        System.out.println();
        System.out.println("-----------------------------Registed Library User2!-----------------------------");
        LibrarySystemAbstract libuser3 = new LibraryUsers(2,"bekirkurt","bekir11", "Bekir", "Kurt", "bekirkurt@hotmail.com");
        Register register = new Register(2,"bekirkurt","bekir11", "Bekir", "Kurt", "bekirkurt@hotmail.com");
        System.out.println();
        System.out.println("-----------------------------Created Library User3!-----------------------------");
        System.out.println("\tView Library User 3\n"+libuser3.toString());
        System.out.println();
        System.out.println("-----------------------------Register User3!-----------------------------");
        System.out.println();
        try 
        {
            if(staff.register((LibraryUsers) libuser3)){
                System.out.println("-----------------------------Registered Successfull!-----------------------------");
            }
        } 
        catch (NullPointerException e)
        {
            e.printStackTrace(System.err);
        }
        
        System.out.println();
        try 
        {
            if(libuser3.logIn(register)){
                System.out.println("-----------------------------Log In Library User3 Successfull!-----------------------------");
            }
        } 
        catch (SecurityException e)
        {
            e.printStackTrace(System.err);
        }
        
        System.out.println();
        System.out.println("-----------------------------Library user barrow 2 book User3!-----------------------------");
        

        System.out.println("********************\n\n"+ staff.getBooks()+"******************\n\n");

        //System.out.println("********************\n\n"+ staff.getBooks()+"******************\n\n");
        
        try 
        {
            libuser3.barrowBook(book);
            libuser3.barrowBook(book2);
        } 
        catch (NullPointerException | Error e)
        {
            e.printStackTrace(System.err);
        }
        System.out.println("\tView Library User 3 After barrow 2 books\n"+libuser3.toString());
        System.out.println();
        System.out.println("-----------------------------Library user return book one by User3!-----------------------------");
        
        try 
        {
            libuser3.returnBook(book);
        } 
        catch (NullPointerException | Error e)
        {
            e.printStackTrace(System.err);
        }
        System.out.println("\tView Library User 3 After return a book\n"+libuser3.toString());
        try 
        {
            if(libuser3.logOut(register)){
                System.out.println("-----------------------------Log Out Library User3 Successfull!-----------------------------");
            }
        } 
        catch (SecurityException e)
        {
            e.printStackTrace(System.err);
        }

        System.out.println("-----------------------------END OF SYSTEM-----------------------------");
    }
    /**
     * LinkedList test
     */
    private static void test_LinkedList(){
        
        AdminLinked admin = new AdminLinked();
        System.out.println("-----------------------------Created admin!-----------------------------");
        System.out.println("\tView Admin\n"+admin.toString());
        LibraryStaffLinked staff = new LibraryStaffLinked(0, "kenankurt", "1234", "Kenan", "Kurt", "kenankara12@hotmail.com");
        System.out.println();
        System.out.println("-----------------------------Created staff!-----------------------------");
        System.out.println("\tView Staff\n"+staff.toString());
        try 
        {
            admin.add(staff);
            
        } catch (NullPointerException e)
        {
            e.printStackTrace(System.err);
        }
        
        System.out.println();
        System.out.println("-----------------------------Add staff by admin-----------------------------");
        System.out.println("\tAfter added Staff View Admin\n"+admin.toString());
        Books book =new Books("System Programlama", "Author1", "C and C++", 4583);
        Books book2 =new Books("C++", "Author2", "C++", 1234);
        System.out.println();
        System.out.println("-----------------------------Created 2 Books!-----------------------------");
        try 
        {
            staff.addBook(book);
            staff.addBook(book2);
            
        } catch (NullPointerException e)
        {
            e.printStackTrace(System.err);
        }

        System.out.println("-----------------------------Add Books by staff-----------------------------");
        System.out.println("\tAfter added 2 books View books by staff\n"+staff.toString());
      
        LibraryUsersLinked libuser = new LibraryUsersLinked(0, "eliff","222","Elif", "Serap", "elifserap.1@gmail.com");
        System.out.println();
        System.out.println("-----------------------------Created Library User!-----------------------------");
        
        try 
        {
            staff.register(libuser);
        } 
        catch (NullPointerException e)
        {
            e.printStackTrace(System.err);
        }
        //System.out.println();
        System.out.println("-----------------------------Registed Library User by Staff!-----------------------------");
        System.out.println(staff.toString());
        LibraryUsersLinked libuser2 = new LibraryUsersLinked(1, "yagmurcan", "321", "Yagmur", "Can", "yagmurcan2@gmail.com");
        System.out.println();
        System.out.println("-----------------------------Created Library User2!-----------------------------");
        
        try 
        {
            staff.register(libuser2);
        } 
        catch (NullPointerException e)
        {
            e.printStackTrace(System.err);
        }
        System.out.println("\tView Library User 2\n"+libuser2.toString());
        System.out.println();
        System.out.println("-----------------------------Registed Library User2!-----------------------------");
        LibrarySystemAbstractLinked libuser3 = new LibraryUsersLinked(2,"bekirkurt","bekir11", "Bekir", "Kurt", "bekirkurt@hotmail.com");
        Register register = new Register(2,"bekirkurt","bekir11", "Bekir", "Kurt", "bekirkurt@hotmail.com");
        System.out.println();
        System.out.println("-----------------------------Created Library User3!-----------------------------");
        System.out.println("\tView Library User 3\n"+libuser3.toString());
        System.out.println();
        System.out.println("-----------------------------Register User3!-----------------------------");
        System.out.println();
        try 
        {
            if(staff.register((LibraryUsersLinked) libuser3)){
                System.out.println("-----------------------------Registered Successfull!-----------------------------");
            }
        } 
        catch (NullPointerException e)
        {
            e.printStackTrace(System.err);
        }
        
        System.out.println();
        try 
        {
            if(libuser3.logIn(register)){
                System.out.println("-----------------------------Log In Library User3 Successfull!-----------------------------");
            }
        } 
        catch (SecurityException e)
        {
            e.printStackTrace(System.err);
        }
        
        System.out.println();
        System.out.println("-----------------------------Library user barrow 2 book User3!-----------------------------");
        

        System.out.println("********************\n\n"+ staff.getBooks()+"******************\n\n");

        //System.out.println("********************\n\n"+ staff.getBooks()+"******************\n\n");
        
        try 
        {
            libuser3.barrowBook(book);
            libuser3.barrowBook(book2);
        } 
        catch (NullPointerException | Error e)
        {
            e.printStackTrace(System.err);
        }
        System.out.println("\tView Library User 3 After barrow 2 books\n"+libuser3.toString());
        System.out.println();
        System.out.println("-----------------------------Library user return book one by User3!-----------------------------");
        
        try 
        {
            libuser3.returnBook(book);
        } 
        catch (NullPointerException | Error e)
        {
            e.printStackTrace(System.err);
        }
        System.out.println("\tView Library User 3 After return a book\n"+libuser3.toString());
        try 
        {
            if(libuser3.logOut(register)){
                System.out.println("-----------------------------Log Out Library User3 Successfull!-----------------------------");
            }
        } 
        catch (SecurityException e)
        {
            e.printStackTrace(System.err);
        }

        System.out.println("-----------------------------END OF SYSTEM-----------------------------");
    }
}
