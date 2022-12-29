/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lms;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class LMS {
    public static void main(String[]args) {

       String r; int ch=1;

       System.out.println("................LIBRARY MANAGEMENT SYSTEM.............");
        while (ch!=0){

            System.out.println("Press 1 to add a book");
            System.out.println("Press 2 to issue a book");
            System.out.println("Press 3 to complete the issue details");
            System.out.println("Press 4 to exit");
            Scanner obj1 = new Scanner(System.in);
            System.out.println("enter any number");
            int a = obj1.nextInt();
            switch (a) {
                case 1:
                    Library aa = new Library();
                    aa.add();
                    break;
                case 2:
                    Library bb = new Library();
                    bb.iss();
                    break;

                case 3:
                    Library dd = new Library();
                    dd.detail();
                    break;
                case 4:
                    Library add = new Library();
                    add.exit();
                    break;
                default:
                    System.out.println("invalid number");


            }
            System.out.println("want to continue?,press 1 else press 0");
            Scanner l=new Scanner(System.in);
            ch= l.nextInt();
        }

        }


    }



class Library
{
    String str,b,a,c,date; int o;
    void add()
    {
        System.out.println("enter book name,price and book_no");
        Scanner obj2 =new Scanner(System.in);
        String s=obj2.nextLine();
        float price = obj2.nextFloat();
        int  bookno= obj2.nextInt();
        System.out.println("your details is" +"name of book:: "+s +"Price::" + price +"book no"+ bookno);

    }
    void iss()
    {
        Scanner obj3=new Scanner(System.in);
        System.out.println("Book Name");
        str=obj3.nextLine();
        System.out.println("book id");
        o= obj3.nextInt();
        System.out.println("issue date");
        b= obj3.nextLine();
        c=obj3.nextLine();
        System.out.println("Return book date");
        date=obj3.nextLine();

    }




    void detail()
    {
        System.out.println("All details");
        System.out.println("book name::" +str);
        System.out.println("book id ::" + o);
        System.out.println("issue date " + b);
        System.out.println("book return date::" + date);

    }
    void exit()
    {
        System.exit(0);
    }
}

 

