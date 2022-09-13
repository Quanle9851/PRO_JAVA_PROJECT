/* 
    This program contains 2 parts: (1) and (2)
    YOUR TASK IS TO COMPLETE THE PART  (2)  ONLY
*/

package csd201_se1605_pe3;

import java.io.FileReader;
import java.io.LineNumberReader;
import java.util.Scanner;

public class MyList {  
//===========================================================================
//(1)=========== DO NOT EDIT THIS PART === DO NOT EDIT THIS PART ============ 
//===========================================================================    
    Node head, tail;    
    Scanner sc = new Scanner(System.in);  
    
    public MyList() {head=tail=null;}
    
    //return true if the list is empty, otherwise return false
    boolean isEmpty() {return head == null;}
    
    //clear the list
    void clear() {head=tail=null;}
         
    //load data from book.txt to the list
    void loadData() {
        try {
            //open book.txt for reading
            LineNumberReader lnr = new LineNumberReader(
                    new FileReader("book.txt"));
            String s;
            while(true) {
                s = lnr.readLine();
                if(s == null) break;
                if(s.trim().isEmpty()) continue;
                String [] st = s.trim().split("#");
                String code = st[0].trim();
                String name = st[1].trim();
                String author = st[2].trim();
                double price = Double.valueOf(st[3].trim());
                Book book = new Book(code, name, author, price);
                Node p = new Node(book);
                if(isEmpty()) {
                    head = tail = p;
                } else {
                    tail.next = p;
                    tail = p;
                }
            }
            lnr.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
//===========================================================================
//(2) ==== YOU CAN EDIT OR EVEN ADD NEW FUNCTIONS IN THE FOLLOWING PART =====
//===========================================================================    
    //return the first node which data=x, otherwise return null
    Node find(String x) {
        Node p = head;
        while(p!=null && !p.info.code.equals(x)) 
            p = p.next;
        if(p!=null) return p;
        return null;
    }
    // Note: You do not need to edit this function. Your task is to use it 
    // to complete other functions.
    
    //traverse the list
    void traverse() {
        // Traverse from head to tail and dislay info of all nodes 
        // (books) in the list.
        if(isEmpty()) {
            System.out.println(" The list is empty");
            return;
        }
        Node p=head;
        while(p!=null) {
            System.out.println(p.info);
            p=p.next;
        }
    }
    
    //add new book
   public void addNewBook() {
        // Add a new book with newCode, newName, author, price 
        // at the head of a list.
        
        String code = "", name, author;
        double price;
        Node check = null;
        do {
            System.out.println("Enter code of book: ");
            code = sc.nextLine();

            check = find(code);
            if (check != null) {
                System.err.println("The book already exist!");
            }
        } while (check != null);
        System.out.println("Enter name of book: ");
        name = sc.nextLine();
        System.out.println("Enter author of book: ");
        author = sc.nextLine();
        System.out.println("Enter price of book: ");
        price = sc.nextDouble();
        Book b = new Book(code, name, author, price);
        addFirst(b);
    }

    //add a new node to the front
    void addFirst(Book f) {
        // Add a new book with newCode, newName, author, price 
        // at the head of a list.
           Node p = new Node(f);
        if (isEmpty()) {
            head = tail = p;
        } else {
            p.next = head;
            head = p;
        }
    }
      
    //update a book
    void updateBook() {
        // Update the price of a book by book code
        String code;
        double price;
        System.out.println("Enter code of book: ");
        code = sc.nextLine();
        Node f = find(code);
        if (f == null) {
            System.err.println("The book is not exist to update!!!");
            return;
        }        else
            System.out.println("Input the new price of book to update: ");
            price = sc.nextDouble();
            f.info.price = price;
    }
    
    //remove a book
void removeBook() {
        // Delete a book by book code
        String code;
        System.out.println("Enter code of book: ");
        code = sc.nextLine();
        Node f = find(code);
        if (f == null) {
            System.err.println("The book is not exist to update!!!");
            return;
        } else {
            remove(f);
            System.out.println("Remove book successfully!!!");
        }
    }
    //remove a given node in the list
    void remove(Node p) {
        // Delete a book by book code
        if (p == null) {
            return;
        }
        Node f = head, prev = null;
        while (f != null && f != p) {
            prev = f;
            f = f.next;
        }
        if (prev == null) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
        } else {
            prev.next = p.next;
            if (p == tail) {
                tail = prev;
            }
        }
        p.next = null;
    }
    
    //sort books by book’s code
 void sort() {
        // Sort the list in ascending order by book code using 
        // insertion sort algorithm.
        Node pi, pj;
        Book x;
        pi = head;
        while (pi != null) {
            pj = pi.next;
            while (pj != null) {
                if (pj.info.code.compareTo(pi.info.code) < 0) {
                    x = pi.info;
                    pi.info = pj.info;
                    pj.info = x;
                }
                pj = pj.next;
            }
            pi = pi.next;
        }
    }
}




