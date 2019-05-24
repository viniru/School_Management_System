/*
    NAME       -->  VINAYAK G. BHAT
    CLASS      -->  10TH
    SUBJECT  -->  COMPUTER
    PROJECT  -->  SCHOOL MANAGEMENT SYSTEM
    TEACHER  -->
    SCHOOL    -->  SESHADRIPURAM PUBLIC SCHOOL

 */

/* PROGRAM TO COMPUTE ALL THE PROCESSES OF A SCHOOL  
   THIS PROGRAM CONATINS FOUR CLASSES , CHECK OUT WHAT ALL EACH CLASS DOES :
   
   CLASS NO.1 ----> start
   
   1. NOT THE MAIN PART OF THE PROGRAM , THOUGH IT WELCOMES THE USER AND GIVES THE BASIC 
      INFORMATION OF THE PROGRAM.
   2. CONTAINS ALL THE MEMBER METHODS FOR ANIMATIONS REQUIRED IN THE PROGRAM.
   3. IT GIVES THE FIRST MENU TO CHOOSE BETWEEN INFORMATION AND MAIN MENU
   4. IT CONAINS A TOTAL OF 12 MEMBER METHODS
   5. ITS IMPORTANT MEMBER METHODS ARE :   
     a) welcome()   // welcomes the user and gives the basic information
     b) acc()       // create an account
     c) login()     //login through an existing or a created account
     d) intromenu()  // the first primary menu
    
    CLASS NO.2 ----> information
    
    1. CONATAINS ALL THE INFORMATION ABOUT SCHOOL MANAGEMENT IN AN ORGANISED WAY.
    2. IT CONATAINS NO OTHER CODINGS.
    3. IT CONAINS A TOTAL OF 10 MEMBER METHODS
    4. ITS IMPORTANT MEMBER METHODS ARE :
      a) introduction()            //introduction menu
      b) intro_school_management() //gives informmation(main module i.e.school management)
      c) lib_manage_system()       //gives informmation(library module)
      d) fee_manage()              // gives informmation(fee module)
      
    CLASS NO.3 ---->  management
    
    1. THE MAIN PROGRAM STARTS IN THIS CLASS
    2. IT CONTAINS A TOTAL OF 30 METHODS
    3. WHAT AL IT DOES :
      * ENTRANCE FORM
      * ENTRANCE TEST
      * INPUTTING PREVIOUS SCHOOL MARKS
      * DISPLAY REPORTS
      * ADMISSION
      * PAYING QUARTERLY FEES
      * PAYING YEARLY FEES
      * PAYING FINES FOR DAMAGING SCHOOL THINGS
      * PAYING FINES FOR THE LATE PAYEMENT OF FEES
      * DISPLAYS ANIMATED SAMPLE ID CARD
      * DISPLAY ALL THE STUDENTS NAME
      * DISPLAY ALLTHE STUDENTS INFORAMATION
      * IT ALLOWS TO GO THROUGH THE OTHER CLASS I.E.LIBRARY THROUGH THE MENU
    4. ITS IMPORTANT MEMBER METHODS :
       a) admission_interview()
       b) get_entrance1()
       c) admission()
       d) idcard()
       e) main(String args)
       f) report_payment()
       g) pay_qurterly fees()
       h) fine_for_late_payment_of_fees()
       i) fine_for_damaging_school_things()
       j) pay_admission_fees()
       k) display_students_class_6_to_10_and_their_performances()
       
       CLASS NO.4 ----> library
       
       1. THIS TOO COTAINS THE MAIN PART OF THE PROGRAM
       2. IT IS DESIGNED TO DO ALL THE PROCSSES OF SCHOOL LIBRARY
       3. IT DOES THEFOLLOWING FUNCTIOND :
         * DISPLAYS ALL THE BOOKS IN THE LIBRARY WITH DESCRIPTION
         * SEARCING INDIVIDUAL BOOKS WITH THEIR INFORMATION
         * DELETING BOOKS IN THE LIBRARY
         * PAYMENT OF FINES
         * DISPLAYS REPORT
         * ISSUING BOOKS
         * RETURNING BOOKS
       4. IT CONTAINS TOTALLY 9 MEMBER METHODS
       5. ITS IMPORTANT MEMBER METHODS ARE :
         a) libmenu()
         b) display()
         c) delbok()
         d) issuebook()
         e) return book()
         f) late fine()
         g) lostfine()
         h) report()      
         
         THIS IS WHAT MY PROGRAM CONATINS , EXECUTE MY PROGRAM AND GO THROUGH A REAL LIKE
         SCHOOL MAAGEMENT SYSTEM....
 */
//-----------------------------PROGRAM STARTS FROM HERE(INTRODUCTION)------------------------------------

  import java.io.*;
  import java.math.*;
  import java.lang.*;
  import java.util.Date;

//-------------------IMPORTING ALL REQUIRED PACKAGES AND CLASSES----------------------------
    class start
  {
     static management m = new management();    // object created for class management
     static information info = new information(); //another object created for class information
     static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
     static Date d = new Date(); // date object created
     static int choice  ; // accepts int value and stores 1 of the various choices                      
     static String b ; // variable to input string and store our created accounts username
     static String c ; // variable to input string and store our created accounts password
     
     //NOTE: ALL THE THREE ABOVE VARIABLES ARE USED ONLY AT THE TIME OF ACCOUNT CREATIN AND LOGIN
    //----------------------------------------------------------------------------------------------------
      public static void main() throws IOException //MAIN METHOD
  {
      welcome();
      acc();
        }
//--------------------------------------------------------------------------------------------------------      
       public static void printline() // METHOD TO PRINT A DOUBLE LINE TO SEPARATE THE OLD AND THE NEW CONTENT AND GIVE THE PROJECT A LOOK
     {
        for(int i=0;i<110;i++)
        {
            System.out.print("/");
            if( i == 109)
            {
                System.out.println();
                int j = 0;                   
                do
                {
                    j++;
                    System.out.print("/");
                }
                while(j < 110);
               System.out.println();
             }
        }
        System.out.println();
    }
    
//-----------------------------------------------------------------------------------------------------------------------------------------------   
    public static void  load()
       {
         System.out.println("Loading:|||||---------------------------------------------:10%");
         try {Thread.sleep(3000);}       //inbuilt method
         catch (InterruptedException ex){}
         System.out.println("\f"+"Loading:||||||||||||||||||||------------------------------:40%");
         try {Thread.sleep(4000);}
         catch (InterruptedException ex){}
         System.out.println("\f"+"Loading:||||||||||||||||||||||||||||||--------------------:60%");
         try {Thread.sleep(1000);}
         catch (InterruptedException ex){}
         System.out.println("\f"+"Loading:||||||||||||||||||||||||||||||||||||||||----------:80%");
         try {Thread.sleep(6000);}
         catch (InterruptedException ex){}
         System.out.println("\f"+"Loading:|||||||||||||||||||||||||||||||||||||||||||||-----:90%");
         try {Thread.sleep(1000);}
         catch (InterruptedException ex){}
         System.out.println("\f"+"Loading:||||||||||||||||||||||||||||||||||||||||||||||||||:100%");
         System.out.println("PROGRAM LOADED AND INITIALIZED");
         String ini="Initialized For Usage";
}
 //------------------------------------------------------------------------------------------------------------------------------------------------
         public static void timedelay1() // METHOD USED FOR ANIMATION
        {
            for( long i = 0 ; i <= 11111111; i++);
        }
//---------------------------------------------------------------------------------------------------------        
        public static void timedelay2()// METHOD USED FOR ANIMATION
        {
            for( long i = 0 ; i <= 9999999; i++);
        }
//---------------------------------------------------------------------------------------------------------                   public static void animation(String str1 , String str2)
    public static void animation(String str1 , String str2)
 {
         int n  = 0;
         for( ; n < 2 ; n ++ )
         {
             System.out.println("\f           " + str1 );
              try {Thread.sleep(750);}       //inbuilt method
              catch (InterruptedException ex){}
              System.out.println("\f           " + str2);
              try {Thread.sleep(750);}       //inbuilt method
              catch (InterruptedException ex){}
              while( n == 1){
              System.out.println("\f" + "");
              ++n;
            }
            }
        }
 //-------------------------------------------------------------------------------------------------------    
     public static void welcome()throws IOException // ANIMATED METHOD THAT WELCOMS YOU INTO THE PROGRAM
                                                    // AND GIVES YOU THE STUDENT INFORMATION
     {
         System.out.println("");
         br.readLine();
         for( long i = 0 ; i <= 444444444; i++);
         load();
         System.out.println("\n \n \n \n \n \n \n ");
       timedelay1();
       System.out.print("\t \t \t ##    ##  " );
       timedelay1();
       System.out.print( "######  "  );
       timedelay1();
       System.out.print( "##     "  );
       timedelay1();
       System.out.print( "######  "  );
       timedelay1();
       System.out.print( "######  " );
       timedelay1();
       System.out.print("###  ###  ");
       timedelay1();
       System.out.println( "###### " );
       timedelay1();
      
     
      System.out.print("\t \t \t ##    ##  " );
      timedelay1();
      System.out.print( "##      " );
      timedelay1();
      System.out.print( "##     " );
      timedelay1();
      System.out.print( "##      ");
      timedelay1();
      System.out.print( "##  ##  " );
      timedelay1();
      System.out.print("## ## ##  ");
      timedelay1();
      System.out.println ("##     ");
      timedelay1();
      
      System.out.print("\t \t \t ## ## ##  ");
      timedelay1();
      System.out.print(  "#####   " );
      timedelay1();
      System.out.print("##     " );
      timedelay1();
      System.out.print(  "##      " );
      timedelay1();
      System.out.print( "##  ##  " );
      timedelay1();
      System.out.print("## ## ##  ");
      timedelay1();
      System.out.println("#####  ");
      timedelay1();
    
     
     
      System.out.print("\t \t \t ## ## ##  ");
      timedelay1();
      System.out.print(  "##      ");
      timedelay1();
      System.out.print( "##     " );
      timedelay1();
      System.out.print( "##      " );
      timedelay1();
      System.out.print( "##  ##  ");
      timedelay1();
      System.out.print("##    ##  ");
      timedelay1();
      System.out.println("##     ");
      timedelay1();

      System.out.print("\t \t \t ###  ###  " );
      timedelay1();
      System.out.print( "######  " );
      timedelay1();
      System.out.print( "###### " );
      timedelay1();
      System.out.print( "######  " );
      timedelay1();
      System.out.print( "######  ");
      timedelay1();
      System.out.print("##    ##  ");
      timedelay1();
      System.out.println("###### ");
      timedelay1();;
     
      System.out.println("\n \n \n \n Please enter To Continue.....\n \n \n \n ");
      br.readLine();
     printline();
     System.out.println("\n  ");
     timedelay1();
     System.out.println("   =========================================================================");
     timedelay1();
     System.out.println("   =========================================================================");
     timedelay1();
     System.out.println("   =========================================================================");
     timedelay1();
     System.out.println("   ========================================================================= ");
     timedelay1();
     System.out.println("   |||||||                                                         ||||||| ");
     timedelay1();
     System.out.println("   |||||||  NAME                ::|::  VINAYAK G. BHAT             ||||||| ");
     timedelay1();
     System.out.println("   |||||||  CLASS               ::|::  10th STANDARD               ||||||| ");
     timedelay1();
     System.out.println("   |||||||  ROLL NUMBER         ::|::  27                          ||||||| ");
     timedelay1();
     System.out.println("   |||||||  SUBJECT             ::|::  COMPUTER APPLICATIONS       ||||||| ");
     timedelay1();
     System.out.println("   |||||||  PROJECT TITLE       ::|::  SCHOOL MANAGEMENT SYSTEM    ||||||| ");
     timedelay1();
     System.out.println("   |||||||  SCHOOL              ::|::  SESHADRIPURAM PUBLIC SCHOOL ||||||| ");
     timedelay1();
     System.out.println("   |||||||  TEACHER             ::|::  DEEPA                      ||||||| ");
     timedelay1();
     System.out.println("   |||||||  DATE                ::|::  "+d+"||||||| ");
     timedelay1();
     System.out.println("   |||||||                                                         ||||||| ");
     timedelay1();
     System.out.println("   ========================================================================= ");
     timedelay1();
     System.out.println("   =========================================================================");
     timedelay1();
     System.out.println("   =========================================================================");
     timedelay1();
      System.out.println("  ==========================================================================");
      timedelay1();
     System.out.println("\n  ");
     printline();
     System.out.println(" \n  ");
     System.out.println("Please press enter to continue....");
     br.readLine();
    }
  //---------------------------------------------------------------------------------------------------  
     public static void pageflow() //METHOD WHICH MAKES U FEEL THAT YOU ARE IN A FRESH PAGE
    {
        for (int i=0; i<25; ++i)
            System.out.println();
    }
//--------------------------------------------------------------------------------------------------------
      
        public static void acc() // METHOD USED TO CREATE A NEW ACCOUNT 
 {
     try
     {
         System.out.println(" \n \nPlease select Your Options:");
         System.out.println(" \n 1. Login through an authourised account");
         System.out.println(" \n \n 2. Create a new account \n "); 
         System.out.println(" (NOTE : even creating a new account needs needs the password of the ");
         System.out.println("         authorised user so that the schoolinformation may not be stolen.");
         System.out.println("         this can be used in case the authourised user is absent for");
         System.out.println("         a few days.)");
         choice = Integer.parseInt(br.readLine());
         printline();

         if(choice == 2)
         { 
             System.out.println("Please enter the pwd to be liable to create a new account: \n");
             String pwd = br.readLine();
             if(pwd.equals("vini")) 
             {
              printline();
              System.out.println(" \n \nPlease Enter Your Desired Username:");
              b = br.readLine();  // b VARIABLE IS DECLARED AT THE START OF THE PROGRAM
              System.out.println(" \n Please EnterYour Desired Password:");
              c = br.readLine(); // c VARIABLE IS DECLARED AT THE START OF THE PROGRAM
              pageflow();
              login();
            }
             else
             {
               printline();
               System.out.println(" Sorry.....!! Wrong Password ...!!!");
               acc();
            }
            
        }
        
        if(choice == 1)
        {
          newlogin();
        }
    
        
        else
        {
            printline();
            acc();
    }
    
}

   catch(Exception e)
   {
       acc();
    }
}
 //--------------------------------------------------------------------------------------------------  
   public static  void login() throws IOException // THIS METHOD HELPS YOU LOGIN INTO THIS PROGRAM THROUGH AUTHOURISED ACCOUNT
    {
        System.out.println("\n \n Which way do you want to login now? \n");
        System.out.println("\n \n 1. With the created account");
        System.out.println(" \n 2. With the authourised account");
        choice = Integer.parseInt(br.readLine());
        String username , password ; // inputs and stores username and password
        for(int i = 0; i < 30 ; i++)
        System.out.println(" \n ");
        
            System.out.print(" Enter Your Username : ");
             username = br.readLine();
            System.out.print(" \n Please Enter your Password : ");
             password = br.readLine();  
            if(username.equals(b) && password.equals(c))
            {
            System.out.println("\n \n Congradulation...!!! You Have Logged In ");
            intromenu();
        }
            else
            {
            System.out.println("\n \n Sorry...!! wrong username and password");
            login();
        }
    }
    
//---------------------------------------------------------------------------------------------------------------------
        public static void newlogin()throws IOException// THIS METHOD HELPS YOU LOGIN INTO THIS PROGRAM THROUGH CREATED ACCOUNT
        {
        String username , password ;
        System.out.print(" \n \n Enter Your Username :");
        username = br.readLine();
        System.out.print(" \n Please Enter your Password : ");
        password = br.readLine();
        if(username.equals("Vinayak") &&  password.equals("Bhat"))
        {
        System.out.println("\n \n Congradulation...!!! You Have Logged In ");
        intromenu();
    }
        else
        {
        System.out.println("\n \n Sorry...!! wrong username and password");
        newlogin();
    }
        }
    

 //---------------------------------------------------------------------------------------------------------                   
 public static void intromenu() throws IOException // THIS GIVES YOU THE FIRST OR THE INTRODUCTION MENU
    {
      try
        {
                pageflow();
                printline();
                                animation("SCHOOL MANAGEMENT SYSTEM " , " BY VINAYAK" );
                System.out.println("\n \n ");
                System.out.println("================= PRIMARY MENU ================== \n ");
                 System.out.println("\n\t1. INTRODUCTION MENU ");
                System.out.println("\n\t2. MAIN MENU \n ");
                System.out.println("======================================================");
                System.out.println(" \n \n ");
                System.out.print("\nEnter your choice: ");
                choice = Integer.parseInt(br.readLine());

                    switch(choice)
                        {
                            case 1 : info.introduction();
                                        break;
                            case 2 : m.start();
                                        break;  
                         }
               }
            catch(Exception e)
            {
                System.out.println("ERROR...!!!! " + e + " PRESS ENTER TO CONTINUE......");
            }
            try
            {
                br.readLine();
                intromenu();
            }
            
        catch(Exception e){}
    }  
    
}
//############################################################################################################################################
//#########################################2nd CLASS DECLARATION AND DEFINITION ###############################################################
 //###########################################################################################################################################  
 
  class information  // displys the information of various modules in school management system
 {
     static int choice;
     static start sl = new start(); 
     static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
     public static void introduction()throws IOException
     {
    try
      {
        sl.printline();
        sl.animation("INTRODUCTION" , " " );
        System.out.println("   PLEASE SELECT YOUR CHOICE : \n ");
        System.out.println("   1. INTRODUCTION TO SCHOOL MANAGEMENT SYSTEM ");
        System.out.println("   2. LIBRARY MANAGEMENT MODULE ");
        System.out.println("   3. DISCIPLINE AND CO-CURRICULAR MODULE ");
        System.out.println("   4. PAYROLL MODULE ");
        System.out.println("   5. EXAMS MODULE ");
        System.out.println("   6. FEE MANAGEMENT MODULE ");
        System.out.println("   7. ACCOUNTS MODULE ");
        System.out.println("   8. SCHOOL SHOP MODULE ");
        System.out.println("   9. INVENTORY MODULE ");
        System.out.println("  10. QUIT \n");
        System.out.print("      CHOICE :  ");
        choice = Integer.parseInt(br.readLine());
        
        switch(choice)
        {
            case 1 : intro_school_management();
            break ;
            case 2 : lib_manage_system();
            break ;
            case 3 : co_curricular();
            break ;
            case 4 : payroll();
            break ;
            case 5 : exams();
            break ;
            case 6 : fee_manage();
            break ;
            case 7 : acc_mod();
            break ;
            case 8 : school_shop();
            break ;
            case 9 : inventory();
            break ;
            case 10 : sl.intromenu();
            break ;
        }
    }
    catch(Exception e)
    {
        introduction();
    }     
}

//---------------------------------------------------------------------------------------------------------   
  public static void intro_school_management() throws IOException
  {
      sl.pageflow();
      sl.printline();
      sl.animation("SCHOOL MANAGEMENT SYSTEM" , " ");
      System.out.println("\n\n SCHOOL MANAGEMENT SYSTEM provides a suite of software covering all parts of ");
      System.out.println(" a schools' administration, from behaviour and achievement, planning curriculum and lesson ");
      System.out.println(" structures, dinner money, educational learning plans, data sharing for the 14-19 agenda, managing ");
      System.out.println(" registration and admissions, and providing teachers, parents and pupils access to all this ");
      System.out.println(" information over the internet through a Microsoft SharePoint based webpage.");
      System.out.println(" in recent years, SIMS has moved away from being viewed as a school\n");
      System.out.println(" administration tool and developed into a comprehensive and integrated Management Information");
      System.out.println(" System (MIS) for managing school business processes and whole school improvement.");
      System.out.println(" It supports schools in responding to The Children's Plan by enabling them to view a ");
      System.out.println(" more rounded picture of a child; SIMS has achieved this by moving away from a modular approach.");
      System.out.println(" The main purpose of School Management Systems is to help schools \n");
      System.out.println(" manage various operations including student data, administrative, and fundraising operations.");
      System.out.println(" It is different from Course or Learning Management Systems as schools have different needs towards");
      System.out.println(" learning process in social manner as well as the educational structure has some nuances compared ");
      System.out.println(" to general school education. School management systems make the information flow quicker and more");
      System.out.println(" accessible. They provide teachers with useful tools to decrease the daily routine of simple tasks");
      System.out.println(" which could be automated. Another school specific is the need to involve children parents more in");
      System.out.println(" the process of their child’s education.  They get more involved\n");
      System.out.println(" as they can get up-to-date information about the school events, grades, children school attendance,");
      System.out.println(" homeworks etc. Teachers get automated reports and average grades in the end of a semester. Children ");
      System.out.println(" have a list of the home tasks, digital learning materials. It saves a lot of time for the people ");
      System.out.println(" involved in analyzing of the school performance as all statistics are presented automatically.");
	
      System.out.println("	\n Admission Details and Reports can be taken from the Student Module, which would help the school ");
      System.out.println("	during admission process.	Students ID card's can be generated from the the MarvelSoft SchoolAdmin.");
      System.out.println("	The School's can choose to print and issues the ID card from the software or they can get the Data from ");
      System.out.println("  the MarvelSoft SchoolAdmin in an excel sheet and give it to the ID card vendor's to import the data in their");
      System.out.println("  software and to generate the ID Cards.\n");
      System.out.println("	Marks Card or Progress Report can be issued from the Student Module. The Marks card can be ");
      System.out.println("	customizable as per School needs.");
	
      System.out.println("  Number of Boys and Girls under each section and class for the entire School can be generated from"); 
      System.out.println("	Student Module.");
      System.out.println("\n PRESS ENTER TO CONTINUE....");
      br.readLine();
      introduction();
    }
//---------------------------------------------------------------------------------------------------------   
  public static void  lib_manage_system() throws IOException
  {
           sl.pageflow();
           sl.printline();
      sl.animation("LIBRARY MANAGEMENT MODULE " , " ");
           System.out.println("\n OVERVIEW \n");
      System.out.println("Library is regarded as the brain of any institution. Many institutes understand the importance of the library ");
        System.out.println(" to the growth of the institute and their esteem users(students). Library Management System support the ");
        System.out.println("general requirement of the library like acquisition, catalogying, relating to the library items, their issues and returns. ");
        System.out.println(" They are used for normal reporting as well as admninistration and staff development purpose. Additionally,Library Management");
        System.out.println("System can be easily customized for their own customized reports.");
        System.out.println("\n");
        System.out.println("This system can manage all the happenings of the Library. Book transactions including Book Registration, ");
        System.out.println("Students Registration, Book Issuing, Current Status of a particular books etc. can be very easily handled");
        System.out.println("by this module. Overall this system can be very helpful and it can makes things easier.");
      System.out.println("\nBy using module a School Administrative can keep records of the books ");
      System.out.println("and save them in an appropriate way. Archivist is one of the IT products");
      System.out.println("which can face this challenge to keep the record of books with it s better");
      System.out.println("technology.");
      
      System.out.println("\n FEATURES : \n");
      
      System.out.println("*It takes care of the arrangement and maintenance of library items.");
        System.out.println("Major categories are created and the related items are kept into ");
        System.out.println("them so that the required item can be made available any time with ease ");
        System.out.println(" *Proper management of the arrangement of the book items aliong eith the ");
        System.out.println(" details like the tittle of the book,its date");
        System.out.println("  of receipt ,the publisher's and authours name ,price ,edition and ");
        System.out.println(" whether the book is available for issue purpose,only ");
        System.out.println(" *subsciption, details, reports etc... ");
        System.out.println(" *Helps in decision making .");
        System.out.println(" *Facility to export the reports in various other formats .");
        System.out.println(" * Graphical User Interface");
        System.out.println(" * User Friendly");
        System.out.println(" *Menu Driven");
        System.out.println("Event Driven messages and error generation");
      System.out.println("\n PRESS ENTER TO CONTINUE....");
      br.readLine();
      introduction();
    }
//---------------------------------------------------------------------------------------------------------   
  public static void co_curricular() throws IOException
  {
            sl.pageflow();
            sl.printline();
     sl.animation("DISCIPLINE AND CO-CURRICULAR ACTIVITIES " , " ");
       System.out.println("\n OVERVIEW \n");
      
      System.out.println(" This module  gives you the facility to store the information about the ");
      System.out.println("school Co Curricular activities, and also helps the administrator identify the students’ ");
      System.out.println("mental level and approach towards life. In Archivist one, administrator can define House names, ");
      System.out.println("House allotment, competition and records of events and tours.");
      
      System.out.println("\n Features : \n ");
      
      System.out.println("User Defined the House names. ");
      System.out.println("User Defined Student House Allotment.");
      System.out.println("Collection of Student Performing House Activities.");
      System.out.println("Keeping the record of Performing House Competition and analysis.");
      System.out.println("Keeping the record of different Events");
      System.out.println("Managing Record of school Tours.");
      System.out.println("\n PRESS ENTER TO CONTINUE....");
      br.readLine();
      introduction();
    }
//---------------------------------------------------------------------------------------------------------   
  public static void payroll() throws IOException
  {
            sl.pageflow();
      sl.printline();
      sl.animation(" PAYROLL MODULE " , " ");
           System.out.println("\n OVERVIEW \n");
      
System.out.println("This provides you better staff appointment record, keeping daily absence of");
 System.out.println("staff, automatic monthly pay generation without any ambiguity. It gives you an excellent system for");
System.out.println(" promotion, increment and gives the user defined pay structure. In archivist one user can define the ");
 System.out.println("pay scale, complete staff list, loans and reports etc. In this way administrator will not feel any ");
System.out.println(" burden regarding payroll system.");

System.out.println("\nFeatures : \n");

System.out.println("User Defined Staff.");
System.out.println("Keeping the Records of Daily Absence.");
System.out.println("Managing the Staff Advancement reports.");
System.out.println("Informing you about the Staff Loans deduction.");
System.out.println("User define system of Monthly Allowances or Deductions.");
System.out.println("Automatic Monthly Pay Generation.");
System.out.println("Effective records of Pay Delivery through automation system.");
System.out.println("User defined Promotions and Increments according to the school requirement.");
System.out.println("User Define Pay Structure.");
System.out.println("Defining the by the user Pay Scale.");
System.out.println("Providing the whole Staff List of the school.");
System.out.println("Keeping the records of the Staff Absence Statement.");
System.out.println("Provides updated information about Staff Advances Report.");
System.out.println("Records of the Staff Loans Report.");
System.out.println("Quick view of Monthly Pay Register.");
      System.out.println("\n PRESS ENTER TO CONTINUE....");
      br.readLine();
      introduction();
    }
//---------------------------------------------------------------------------------------------------------   
  public static void exams() throws IOException
  {
            sl.pageflow();
      sl.printline();
      sl.animation("EXAMS MODULE " , " " );
           System.out.println("\n OVERVIEW \n");
      
System.out.println(" In this  school administrator can easily define the overall structure of the");
System.out.println(" exam schedule, test types- on weekly, monthly, quarterly and yearly basis. There is an activity done by ");
System.out.println(" an activity done by the Archivist that is automatic generation of Award Lists, result cards and result sheet.");

System.out.println("FEATURES :");

System.out.println("Defining the weekly, monthly, quarterly, yearly test Schedule");
System.out.println("User Defined Exams and Test types");
System.out.println("Automatic generation of Award Lists");
System.out.println("Exam Closing Schedule");
System.out.println("Blank Award Lists of students");
System.out.println("Automatic Result cards of all students");
System.out.println("Automatic Result Sheets of all Classes");
      System.out.println("\n PRESS ENTER TO CONTINUE....");
      br.readLine();
      introduction();
    }
//---------------------------------------------------------------------------------------------------------   
  public static void fee_manage() throws IOException
  {
            sl.pageflow();
      sl.printline();
      sl.animation(" FEE MANAGEMENT MODULE  " , " ");
           System.out.println("\n OVERVIEW \n");

System.out.println("In Archivist one school administrator can define the fee types, structure and a");
System.out.println("criterion for fee collection. It provides monthly fee generation, student’s fee ledger, outstanding fee");
System.out.println("and fee refunds. In short, it can regularize fee management in a proper way instead of hectic manual work.");

System.out.println("\nFEATURES :\n");

System.out.println("User Defined Fee types e.g. admission fee, monthly fee, security etc..");
System.out.println("Automatic Student Fee Slip Generation.");
System.out.println("Automatic Monthly Fee Slip generation.");
System.out.println("Automation of Fee Deposit in Cash.");
System.out.println("Automation of Fee Deposit with Bank.");
System.out.println("Fee Collection Reports of Cash.");
System.out.println("Fee Collection with Bank Reports.");
System.out.println("Students Outstanding Fee Reports.");
System.out.println("Students Fee Ledger Reports.");
System.out.println("Refundable Fee can be managed even after Years.");
System.out.println("User Defined Fee Concession Rules.");
 

      System.out.println("\n PRESS ENTER TO CONTINUE....");
      br.readLine();
      introduction();
    }
//---------------------------------------------------------------------------------------------------------   
  public static void acc_mod() throws IOException
  {
            sl.pageflow();
      sl.printline();
 sl.animation("  ACCOUNTS MODULE " , " ");
           System.out.println("\n OVERVIEW \n");
      
System.out.println(" By using Archivist a School Administrator can maintain bank voucher, cashreceiving voucher,");
System.out.println(" receiving voucher, monthly expenses, daily expense, student’s ledger, bank reconciliation, accounts");
System.out.println(" ledger, cash flows, unclear cheque, balance sheet and General Journal etc. Archivist accounting system ");
System.out.println(" plays an excellent role to handle all these activities in a general form and facilitates the ");
System.out.println(" administrator in the whole extent.");

System.out.println("\n FEATURES : \n");

System.out.println("Cash Receiving Voucher.");
System.out.println("Cash Payment Voucher.");
System.out.println("Journal Voucher.");
System.out.println("Issuance of Bank Cheque.");
System.out.println("Cash Deposit in Bank.");
System.out.println("Cheque Deposit in Bank.");
System.out.println("Account Ledger.");
System.out.println("Cash Book.");
System.out.println("Bank Statement.");
System.out.println("Day Book.");
System.out.println("Monthly Expense Chart.");
System.out.println("Cash Flow Register.");
System.out.println("Accounts Receivable.");
System.out.println("Trial Balance.");
System.out.println("Profit and Loss Statement.");
System.out.println("Balance Sheet.");
      System.out.println("\n PRESS ENTER TO CONTINUE....");
      br.readLine();
      introduction();
    }
//---------------------------------------------------------------------------------------------------------   
  public static void school_shop() throws IOException
  {
            sl.pageflow();
      sl.printline();
      sl.animation("SCHOOL SHOP MODULE " , " ");
           System.out.println("\n OVERVIEW \n");

System.out.println("By using Archivist one a School Administrator can manage school shop activities ");
System.out.println("like products name entry, current stock, purchase & sale, ledger of the product ");
System.out.println("and vendor etc. Archivist can handle these activities with its fast-computerized interaction.");

System.out.println("\nFEATURES :\n");

System.out.println("User Defined Item Groups.");
System.out.println("User Defined Products.");
System.out.println("Sale.");
System.out.println("Sales Return.");
System.out.println("Purchase.");
System.out.println("Purchase Return.");
System.out.println("Recoveries.");
System.out.println("Current Sock.");
System.out.println("Daily, Monthly Sales.");
 
      System.out.println("\n PRESS ENTER TO CONTINUE....");
      br.readLine();
      introduction();
    }
//---------------------------------------------------------------------------------------------------------   
  public static void inventory() throws IOException
  {
            sl.pageflow();
      sl.printline();
      sl.animation("INVENTORY MODULE " , " ");
           System.out.println("\n OVERVIEW \n");

System.out.println("Through Archivist one administrator is very comfortable to deal even minor activity .");
System.out.println("like inventory system. In Archivist through different option school administrator can ");
System.out.println("define the customize item group of inventory, related with group, keeping the record of purchases");
System.out.println(" items, individual and complete item ledger.");

System.out.println("\n FEATURES : \n");

System.out.println("User Defined Item Group.");
System.out.println("Items related with Group are defined.");
System.out.println("Purchases Items from different Vendors.");
System.out.println("Keeping the Record of Items Issued.");
System.out.println("Keeping the Record of Items Returned.");
System.out.println("Complete report of Items List.");
System.out.println("Individual and Complete Item Ledger.");
System.out.println("Item Purchases Statement.");
System.out.println("Items in Staff Possessions.");
System.out.println("Information about Stock Statement.");
      System.out.println("\n PRESS ENTER TO CONTINUE....");
      br.readLine();
      introduction();
    }
}
    
       
 
 
 //############################################################################################################################################
//#########################################3RD CLASS DECLARATION AND DEFINITION ###############################################################
 //########################################MAIN PROGRAM STARTS HERE###############################################################  
 
 public class management //responsible for the main part of the program
 {                       // main program starts from here
     
     static start a = new start();// object created
     static library lib = new library(); // another object created 
     static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     static int choice; // used to choose one between many choices
     static int ans = 0; // used in entrance test to store the answe's serial no.
     static int counter = 0; //used in loop
     static int counter1 = 0; //to check whether test is written or not
     static int submarks[] = new int[7] ; //for storing marks of different subjects one student during entrance test
     static String entrance_form_info[] = new String[6]; //for storing info entered in entrance form
     static int  unqid; //to store students unique id
     static int get_unqid; // to get students unique id
     static int test_perc ; //to calculate percentage gained in the entrance test
     static int previous_class_perc; //to calculate percentage gained in the previous class in old school
     static int standard ; //inputs integer value and stores the class of the student to which he needs to join
     static String name ; //to store the students name who has joined the school
     static long fin_dam; //stores the total fine payed by the student for damaging things
     static long fin_late_payment_fees ;
     static long fees; // STORES THE FEES PAID
     static boolean quarter_fees_check = false;
     static boolean year_fees_check = false;
     static boolean adm_fees_check = false;
     static int serial_no_for_10th_class[]= {1,2,3,4,5,6,7,8,9,10};
     static boolean exit_easy = false;
     static int maths[] = new int[10];
     static int science[] = new int[10];
     static int comp[] = new int[10];
     static int social[] = new int[10]; // stores marks and displays using randon()
     static int perc[] = new int[10]; // to store the percentage of 10 students in 5 classes
//-------------------------------------------------------------------------------------------------------------------          

    public static void main(String args[])throws IOException
    {
        
        a.main();
    }
//-------------------------------------------------------------------------------------------------------------------     
     public static void start()throws IOException
    {
        try
        {
            a.pageflow();
            a.animation("MAIN MENU" , " " );
            System.out.println(" \n \n \n ===================== MAIN MENU=========================");
            System.out.println(" \n \n ");
            System.out.println("  1. ADMISSION INTERVIEW FOR STUDENTS ");
            System.out.println("  2. ADMISSION");
            System.out.println("  3. PAY ADMISSION FEES ");
            System.out.println("  4. PAY QUARTERLY FEES ");
            System.out.println("  5. GET A SAMPLE ID CARD  ");
            System.out.println("  6. LIBRARY MANAGEMENT SYSTEM ");
            System.out.println("  7. DISPLAY STUDENT NAMES AND THEIR PERFORMANCES(FROM CLASS 6 TO 10) ");
            System.out.println("  8. FINE FOR DAMAGING SCHOOL OBJECTS ");
            System.out.println("  9. FINE FOR THE LATE PAYMENT OF FEES");
            System.out.println(" 10. TOTAL PAYMENT (EXLUDING PAYMENT IN LIBRARY) ");
            System.out.println(" 11. EXIT ");
            System.out.println(" 12. INTRODUCTION MENU ");
            System.out.println("========================================================");
            System.out.println("\n ");
            System.out.print("ENTER YOUR CHOICE : ");
            String ch = br.readLine();
            choice = Integer.parseInt(ch);
            
            switch(choice)
            {
                case 1 : admission_interview();
                break;
                case 2 : admission();
                break ;
                case 3 : pay_admission_fees();
                break ;
                case 4 : pay_quarterly_fees();
                break ;
                case 5 : idcard();
                break ;
                case 6 : lib.libmenu();
                break ; 
                case 7 : display_students_class_6_to_10_and_their_performances();
                break ;
                case 8 : fine_for_damaging_school_things();
                break ;
                case 9 : fine_for_late_payment_of_fees();
                break ;
                case 10 : report_paymet();
                break ;
                case 11 : exit();
                break ;
                case 12 : a.intromenu();
                break ;
                default : set_default();
                break;
           }
       }
       
       catch(Exception e)
       {
           System.out.println("Error....!!!!" + e);
            start();
        }
    }
//------------------------------------------------------------------------------------------------------------------------------          
  public static void  display_students_class_6_to_10_and_their_performances()
   {
          try
       {
     for(int i = 0 ; i < 10 ; i++)
           {
        maths[i] = (int)Math.floor((Math.random())*100);
        science[i] =(int)Math.floor((Math.random())*100);
        comp[i] =(int)Math.floor((Math.random())*100);
        social[i]=(int)Math.floor((Math.random())*100);
        perc[i] =( maths[i] + science[i] + comp[i] + social[i]) * 100 / 400 ;
    }

        a.printline();
       System.out.println(" PLEASE SELECT YOUR CHOICE : \n ");
       System.out.println(" 1. Class 6 ");
       System.out.println(" 2. Class 7 ");
       System.out.println(" 3. Class 8 ");
       System.out.println(" 4. Class 9 ");
       System.out.println(" 5. Class 10 \n ");
       System.out.println("OR PRESS 6 TO EXIT \n ");
       choice = Integer.parseInt(br.readLine());
       switch(choice)
       {
           case 1 : class6();
           break ;
           case 2 : class7();
           break ;
           case 3 : class8();
           break ;
           case 4 : class9();
           break ;
           case 5 : class9();
           break ;
           case 6 : class10();
           break ;
           default : display_students_class_6_to_10_and_their_performances();
           break;
        }
    }
        
        
        catch(Exception e)
        {
            System.out.println("ERROR...!!!!" + e + "PRESS ENTER TO GO TO THE MAIN MENU..");
        }
        try
        {
            br.readLine();
            start();
        }
        catch(Exception e){}         
   }
             
    
//------------------------------------------------------------------------------------------------------------------------------       
   public static void class6()
   {
       try
       {
       String name_students_class_6_to_10[] = {"LOKESH" , "VINUT" , "HARSHA" , "AMIT" , "VIKHYAT" , "SAUTAV" , "GAGAN" , "AVINASH" , "ROOPESH" , name} ;
           System.out.println("PLEASE SELECT THE STUDENT NAME WHOSE PERFORMANCE IS TO BE SEEN : \n ");
         System.out.println("  ///////////////////////////////////");
         for(int i = 0 ; i < 10 ; i++)
         {
         System.out.println("\n  ///////" + serial_no_for_10th_class[i] + ". " + name_students_class_6_to_10[i] );
        }
         System.out.println("  ///////////////////////////////////");
        
         int choice = Integer.parseInt(br.readLine());
         a.printline();
         System.out.println(" NAME \t CLASS \t MATHS \t SCIENCE \t COMPUTER \t SOCIAL \t PERCENTAGE ");
         a.printline();
         for(int i = 0 ; i < 10 ; i++)
         {
             if(choice == serial_no_for_10th_class[i])
             {
                 System.out.print( name_students_class_6_to_10[i] + "\t 10 \t" + maths[i] +"\t " + science[i]+"\t " + comp[i]+"\t " + social[i]+"\t " + perc[i] );
                 break;
                }
            }
            a.printline();
            System.out.println("PRESS ENTER TO EXIT.... AND 1 TO SEE THE PERFORMANCES OF OTHER STUDENT");
            System.out.println(" AND 2 TO SELECT THE CLASS");
            choice = Integer.parseInt(br.readLine());
            if(choice == 1)
            class6();
            if(choice == 2)
            display_students_class_6_to_10_and_their_performances();
            else
            start();
        }
 
        catch(Exception e)
        {
            System.out.println("ERROR...!!!!" + e + "PRESS ENTER TO GO TO THE MAIN MENU..");
        }
        try
        {
            br.readLine();
            start();
        }
        catch(Exception e){}         
   }
        
  
//------------------------------------------------------------------------------------------------------------------------------      
 public static void class7()
   {
       try
       {
        String  name_students_class_6_to_10[] = {"CHINMAY" , "SHIVA" , "GURU" , "HARI" , "LIKHIT" , "RANGA" , "VISHWAL" , "RAGHU" , "NAGARAJ" , name};
           System.out.println("PLEASE SELECT THE STUDENT NAME WHOSE PERFORMANCE IS TO BE SEEN : \n ");
         System.out.println("  ///////////////////////////////////");
         for(int i = 0 ; i < 10 ; i++)
         {
         System.out.println("\n  ///////" + serial_no_for_10th_class[i] + ". " + name_students_class_6_to_10[i] );
        }
         System.out.println("  ///////////////////////////////////");
        
         int choice = Integer.parseInt(br.readLine());
         a.printline();
         System.out.println(" NAME \t CLASS \t MATHS \t SCIENCE \t COMPUTER \t SOCIAL \t PERCENTAGE ");
         a.printline();
         for(int i = 0 ; i < 10 ; i++)
         {
             if(choice == serial_no_for_10th_class[i])
             {
                 System.out.print( name_students_class_6_to_10[i] + "\t 10 \t" + maths[i] +"\t " + science[i]+"\t " + comp[i]+"\t " + social[i]+"\t " + perc[i] );
                 break;
                }
            }
            a.printline();
             System.out.println("PRESS ENTER TO EXIT.... AND 1 TO SEE THE PERFORMANCES OF OTHER STUDENT");
            System.out.println(" AND 2 TO SELECT THE CLASS");
            choice = Integer.parseInt(br.readLine());
            if(choice == 1)
            class7();
            if(choice == 2)
            display_students_class_6_to_10_and_their_performances();
            else
            start();
        }
 
        catch(Exception e)
        {
            System.out.println("ERROR...!!!!" + e + "PRESS ENTER TO GO TO THE MAIN MENU..");
        }
        try
        {
            br.readLine();
            start();
        }
        catch(Exception e){}         
   }
 
//------------------------------------------------------------------------------------------------------------------------------      
   public static void class8()
   {
       try
       {
         String  name_students_class_6_to_10[] = {"RAMA" , "KRISHNA" , "SHYAMA" , "NIRANJAN" , "SUBHRAMANYA" , "VENKAT" , "SHRINIVAS" , "VEERESH" , "KARTHIK" , name};
          System.out.println("PLEASE SELECT THE STUDENT NAME WHOSE PERFORMANCE IS TO BE SEEN : \n ");
         System.out.println("  ///////////////////////////////////");
         for(int i = 0 ; i < 10 ; i++)
         {
         System.out.println("\n  ///////" + serial_no_for_10th_class[i] + ". " + name_students_class_6_to_10[i] );
        }
         System.out.println("  ///////////////////////////////////");
        
         int choice = Integer.parseInt(br.readLine());
         a.printline();
         System.out.println(" NAME \t CLASS \t MATHS \t SCIENCE \t COMPUTER \t SOCIAL \t PERCENTAGE ");
         a.printline();
         for(int i = 0 ; i < 10 ; i++)
         {
             if(choice == serial_no_for_10th_class[i])
             {
                 System.out.print( name_students_class_6_to_10[i] + "\t 10 \t" + maths[i] +"\t " + science[i]+"\t " + comp[i]+"\t " + social[i]+"\t " + perc[i] );
                 break;
                }
            }
             System.out.println("PRESS ENTER TO EXIT.... AND 1 TO SEE THE PERFORMANCES OF OTHER STUDENT");
            System.out.println(" AND 2 TO SELECT THE CLASS");
            choice = Integer.parseInt(br.readLine());
            if(choice == 1)
            class8();
            if(choice == 2)
            display_students_class_6_to_10_and_their_performances();
            else
            start();
        }
 
        catch(Exception e)
        {
            System.out.println("ERROR...!!!!" + e + "PRESS ENTER TO GO TO THE MAIN MENU..");
        }
        try
        {
            br.readLine();
            start();
        }
        catch(Exception e){}         
   }
//------------------------------------------------------------------------------------------------------------------------------      
   public static void class9()
   {
       try
       {
           a.printline();
        String name_students_class_6_to_10[] = {"KUMAR" , "MANOJ" , "ANIL" , "SUNIL" , "GANAPATHI" , "NARAYAN" , "VRUSHAB" , "ARJUN" , "ABHIMANYU" , name};
           System.out.println("PLEASE SELECT THE STUDENT NAME WHOSE PERFORMANCE IS TO BE SEEN : \n ");
         System.out.println("  ///////////////////////////////////");
         for(int i = 0 ; i < 10 ; i++)
         {
         System.out.println("\n  ///////" + serial_no_for_10th_class[i] + ". " + name_students_class_6_to_10[i] );
        }
         System.out.println("  ///////////////////////////////////");
        
         int choice = Integer.parseInt(br.readLine());
         a.printline();
         System.out.println(" NAME     CLASS \t\t MATHS \t\t SCIENCE \t\t COMPUTER \t\t SOCIAL \t\t\t PERCENTAGE ");
         a.printline();
         for(int i = 0 ; i < 10 ; i++)
         {
             if(choice == serial_no_for_10th_class[i])
             {
                 System.out.print( name_students_class_6_to_10[i] + "\t 10 \t" + maths[i] +"\t    " + science[i]+"\t     " + comp[i]+"\t\t " + social[i]+"\t\t\t" + perc[i] );
                 break;
                }
            }
            a.printline();
             System.out.println("PRESS ENTER TO EXIT.... AND 1 TO SEE THE PERFORMANCES OF OTHER STUDENT");
            System.out.println(" AND 2 TO SELECT THE CLASS");
            choice = Integer.parseInt(br.readLine());
            if(choice == 1)
            class9();
            if(choice == 2)
            display_students_class_6_to_10_and_their_performances();
            else
            start();
        }
 
        catch(Exception e)
        {
            System.out.println("ERROR...!!!!" + e + "PRESS ENTER TO GO TO THE MAIN MENU..");
        }
        try
        {
            br.readLine();
            start();
        }
        catch(Exception e){}         
   }
//------------------------------------------------------------------------------------------------------------------------------      
    public static void class10()
   {
       try
       {
        String name_students_class_6_to_10[] = {"VINAYAK" , "VARUN" , "ASWIN" , "PREM" , "ARAVIND" , "AKSHAY" , "HEMANTH" , "MADHU" , "NAVEEN" , name};
           System.out.println("PLEASE SELECT THE STUDENT NAME WHOSE PERFORMANCE IS TO BE SEEN : \n ");
         System.out.println("  ///////////////////////////////////");
         for(int i = 0 ; i < 10 ; i++)
         {
         System.out.println("\n  ///////" + serial_no_for_10th_class[i] + ". " + name_students_class_6_to_10[i] );
        }
         System.out.println("  ///////////////////////////////////");
        
         int choice = Integer.parseInt(br.readLine());
         a.printline();
         System.out.println(" NAME \t CLASS \t MATHS \t SCIENCE \t COMPUTER \t SOCIAL \t PERCENTAGE ");
         a.printline();
         for(int i = 0 ; i < 10 ; i++)
         {
             if(choice == serial_no_for_10th_class[i])
             {
                 System.out.print( name_students_class_6_to_10[i] + "\t 10 \t" + maths[i] +"\t " + science[i]+"\t " + comp[i]+"\t " + social[i]+"\t " + perc[i] );
                 break;
                }
            }
            a.printline();
             System.out.println("PRESS ENTER TO EXIT.... AND 1 TO SEE THE PERFORMANCES OF OTHER STUDENT");
            System.out.println(" AND 2 TO SELECT THE CLASS");
            choice = Integer.parseInt(br.readLine());
            if(choice == 1)
            class10();
            if(choice == 2)
            display_students_class_6_to_10_and_their_performances();
            else
            start();
        }
 
        catch(Exception e)
        {
            System.out.println("ERROR...!!!!" + e + "PRESS ENTER TO GO TO THE MAIN MENU..");
        }
        try
        {
            br.readLine();
            start();
        }
        catch(Exception e){}         
   }  
        
//------------------------------------------------------------------------------------------------------------------------------
 public static void report_paymet()
    {
        a.pageflow();
        a.printline();
        System.out.println("HERE IS THE TOTAL PAYMENT MADE BY THE STUDENT " + name );
        System.out.println(" \n");
        if(adm_fees_check == true)
        {
         System.out.println(" ADMISSION FEES PAID : RS. 15,000");
         if(quarter_fees_check == true)
         System.out.println("FEES PAID ON QUARTERLY BASIS : RS. 5,000 ");
         else if(year_fees_check = false)
         System.out.println("FEES PAID ON YEARLY BASIS : RS. 20,000");
        }
        else
        {
         System.out.println(" ADMISSION FEES PAID : RS. 0");
         System.out.println("FEES PAID ON QUARTERLY BASIS : RS. 0 ");
         System.out.println("FEES PAID ON YEARLY BASIS : RS. 0");
          System.out.println("TOTAL FEES PAID : RS. 0 ");
        }
        if((adm_fees_check == true) && (quarter_fees_check == true))
        System.out.println("TOTAL FEES PAID : RS. 20,000");
        else if((adm_fees_check == true) && (year_fees_check = false))
        System.out.println("TOTAL FEES PAID : RS. 35,000");
        
        System.out.println("FINE PAID FOR DAMAGE : RS " +  fin_dam); 
        System.out.println("FINE PAYED FOR LATE PAYMENT OF FEES : RS. " + fin_late_payment_fees);
        System.out.println("TOTAL FINE PAID : RS. " +( fin_dam + fin_late_payment_fees ));
    }
//------------------------------------------------------------------------------------------------------------------------------      
   public static void pay_quarterly_fees()
   {
       try
       {
       a.printline();
       System.out.println(" PLEASE SELECT YOUR CHOICES :");
       System.out.println(" 1. PAYING SCHEME ");
       System.out.println(" 2. PAY QUATERLY FEES ");
       System.out.println(" 3. EXIT ");
       choice = Integer.parseInt(br.readLine());
       if(choice == 1)
       {
       a.printline();
       System.out.println("THE FEES HAS TO BE QUARTERLY FOUR TIMES A YEAR OR IT CAN BE PAID ALL AT ONCE.");
       System.out.println("AMOUNT FOR EACH QUARTER IS RS. 5000 AND IF THE FEE IS PAYED ALTOGETHER THE ");
       System.out.println("FINE WILL BE COLLECTED IF THERE IS A DELAY IN FEE PAYMENT.");
       System.out.println(" \n PRESS ENTER TO CONTINUE....");
       br.readLine();
       pay_quarterly_fees();
       a.printline();
    }
       if(choice == 3)
       {
           start();
        }
       if(choice == 2)
       {
       System.out.println("WHICH WAY DO YOU WANT TO PAY THE FEES ?");
       System.out.println(" 1. PAY ON QUARTERLY BASIS ");
       System.out.println(" 2. FOR THE WHOLE YEAR ");
       System.out.println(" \n OR DO YOU WANT TO EXIT? PRESS 3 AND ENTER TO DO SO.");
       choice =  Integer.parseInt(br.readLine());
       if(choice == 1)
       {
           a.printline();
           System.out.print("PLEASE ENTER THE AMOUNT : ");
           fees = Long.parseLong(br.readLine());
           if(fees == 5000)
           {
               System.out.print("ENTER PASSWORD TO CONFIRM THAT THIS IS CLERK : ");
               String pwd = br.readLine();
               if(pwd.equals("vini"))
               {
               System.out.println(" FEES PAID ");
               quarter_fees_check = true;
            }
               else
               {
                   System.out.println(" WRONG PASSWORD. FEES NOT PAID . PRESS ENTER TO CONTINUE.");
                   br.readLine();
                   pay_quarterly_fees();
                }
            }
        }
   
                
                else
                {
                    System.out.println("AMOUNT SHOULD BE EQUAL TO RS. 500O ");
                    System.out.println("PRESS ENTER TO CONTINUE...");
                    br.readLine();
                    a.printline();
                    pay_quarterly_fees();
            }
        }
        
        if(choice == 2)
        {
             a.printline();
           System.out.print("PLEASE ENTER THE AMOUNT : ");
           fees = Long.parseLong(br.readLine());
           if(fees == 20000)
           {
               System.out.print("ENTER PASSWORD TO CONFIRM THAT THIS IS CLERK : ");
               String pwd = br.readLine();
               if(pwd.equals("vini"))
               {
               System.out.println(" FEES PAID ");
               year_fees_check = true;         
            }
               else
               {
                   System.out.println(" WRONG PASSWORD. FEES NOT PAID . PRESS ENTER TO CONTINUE.");
                   br.readLine();
                   pay_quarterly_fees();
                }
            }
                
                else
                {
                    System.out.println("AMOUNT SHOULD BE EQUAL TO RS. 500O.FEES NOT PAID. ");
                    System.out.println("PRESS ENTER TO CONTINUE...");
                    br.readLine();
                    a.printline();
                    pay_quarterly_fees();
            }
        }
            
        
        if(choice == 3)
        {
            a.printline();
            pay_quarterly_fees();
        }
   
    }
    catch(Exception e)
    {
        System.out.println("ERROR..!! " + e + " PRESS ENTER TO CONTINUE...");
    }
    try
    {
          br.readLine();
          a.printline();
          start();
        }
        catch(Exception e){}
    }
     
//------------------------------------------------------------------------------------------------------------------------------   
   public static void total_fine()
   {
       try
       {
       a.printline();
       System.out.println(" \n Total fine the student has payed is : " + fin_dam + fin_late_payment_fees );
       System.out.println("\n PRESS ENTER TO CONTINUE....");
       br.readLine();
       a.pageflow();
       start();
    }
    catch(Exception e)
    {
        System.out.println("ERROR..!!! " + e + ". PRESS ENTER TO CONTINUE...");     
    }
    try
    {
       br.readLine();
       start();
    }
    catch(Exception e){}
}
//------------------------------------------------------------------------------------------------------------------------------
 public static void set_default()throws IOException
 {
     a.printline();
     System.out.println("WRONG CHOICE...!!!! PRESS ENTER TO CONTINUE.");
     br.readLine();
     start();
    }
//------------------------------------------------------------------------------------------------------------------------------
   public static void   fine_for_late_payment_of_fees()
   {
    try
     {
        a.printline();
       System.out.println(" \n FINE IS CALCULATED AS RS. 5 FOR EACH  DAY DELAY ");
       System.out.println(" \n PRESS ENTER TO CALCULATE THR FINE TO BE PAYED..... ");
       br.readLine();
       System.out.println(" \n BY HOW MANYDAYS WAS THE FEE PAYMENT DELAYED?? \n");
       int days = Integer.parseInt(br.readLine());
       fin_late_payment_fees = days * 5 ;
       System.out.println("THE STUDENT HAS TO PAY RS. " + fin_late_payment_fees + ". PLEASE COLLECT IT FROM THE STUDENT.");
       System.out.println("PRESS ENTER TO CONTINUE....");
       br.readLine();
       a.printline();
       System.out.println("PLEASE ENTER YOUR PASSWORD TO ENSURE THAT THE FINE WAS COLLECTED BY THE SHOOL CLERK AND");
       System.out.println(" NO ONE ELSE.");
       String pwd = br.readLine();
       if(pwd.equals("vini"))
       a.animation("FINE PAYED....!!!THANK YOU." , " " );
       else
            {
            System.out.println("SORRY...!! WRONG PASSWORD...!!! \n");
            System.out.println("1. TRY AGAIN ");
            System.out.println("2. EXIT ");
            choice = Integer.parseInt(br.readLine());
            if(choice == 1 )
            fine_for_late_payment_of_fees();
            else
            System.out.println("\n FINE NOT PAYED!!! PRESS ENTER TO CONTINUE...");
            br.readLine();
            start();  
     }     
    }
    catch(Exception e)
    {
        System.out.println("ERROR...!!! " + e + " PRESS ENTER TO CONTINUE.....");
    }
    try
    {
        br.readLine();
        start();
    }
    catch(Exception e) {}
   }
       
//------------------------------------------------------------------------------------------------------------------------------
  public static void fine_for_damaging_school_things()
  {
   try
   {
       
      a.printline();
      System.out.println("\n SELECT YOUR CHOICES : \n");
      System.out.println(" 1. FINE SCHEME ");
      System.out.println(" 2. PAY FINE ");
      System.out.println(" 3. EXIT ");
      choice  = Integer.parseInt(br.readLine());
      a.printline();
      if(choice == 1)
      {
         a.printline();
         System.out.println(" \n The amount to be payed for the damage of different objects differ.The amount");
         System.out.println(" is displayed to the right of the object name when the fine is payed. \n ");
         System.out.println(" PRESS ENTER TO CONTINUE..... \n");
         br.readLine();
         a.pageflow();
         fine_for_damaging_school_things();
        }
        
        if(choice == 2)
        {
           int srlno[] = { 1 , 2 , 3 , 4 , 5 , 6  } ;
        String nam_of_objects[] = { "BENCH   " , "CHAIR    " , "POT      " , "BAT     " , "PROJECTOR" , "SMART BOARD"};
        int damage_cost[] = { 1500, 270 , 100 , 700 , 25000 , 80000 };
        System.out.println("\n \n ");
        for(int i = 0; i < 6 ; i++ )
        {
        System.out.println("\t" + srlno[i] + "\t" + nam_of_objects[i] + "\t" + damage_cost[i] );
        } 
         int j = 1;
         int l = 1;
        System.out.print("\n\nENTER THE NUMBER OF CATAGORIES OF THINGS GAMAGED : ");
        int no = Integer.parseInt(br.readLine());
        int obj_damaged[ ] = new int[no];
        System.out.println("\n PLEASE ENTER THEIR SERIAL NUMBER ONE AFER THE OTHER BY PRESSING ENTER AFTER EACH ONE :");
        for(int i = 0   ; i < no ; i++)
        {
            
        System.out.print(" " + j + ". ");
        obj_damaged [i] = Integer.parseInt(br.readLine());  
        j++;
    }
           System.out.println(" \n PLEASE ENTER THE NUMBER EACH CATOGORY IS DAMAGED IN THE SAME ORDER AS WAS EnTERED");
        System.out.println(" IN LAST STEP AND IN THE SAME WAY : ");
        int no_each_damaged[ ] = new int[no];
        for( int i = 0  ; i < no ; i ++ )
        {
           
        System.out.print(" "+ l + ". ");
        no_each_damaged[i] = Integer.parseInt(br.readLine());
         l++;
    }
        
        for(int i = 0 ; i < no ; i++)
        {
        fin_dam += ( damage_cost[obj_damaged[i]] * no_each_damaged[i] );
          }  
          
          System.out.println("The fine to be payed is : " + fin_dam);
          
          if(choice == 3)
    {
        start();
    }
   }
}
      catch(Exception e)
    {
        System.out.println("ERROR.... " + e + " PRESS ENTER TO GO BACK...");
     } 
     
     try
     {
     br.readLine();
     start();
    }
    catch(Exception e){}
   }
          
        
 //------------------------------------------------------------------------------------------------------------------------------   
      public static void pay_fine_dam()
       {
        try
        {
          System.out.println("PRESS ENTER TO VIEW THE FINE TO BE PAYED.");
          br.readLine();
          System.out.println("PLEASE PAY AN AMOUNT OF " + fin_dam + " TO THE SCHOOL CLERK. ");
          a.printline();
          System.out.print(" PLEASE TYPE YOUR PASSWORD TO CONFIRM THAT ITS THE SCHOOLL CLERK : ");
          String pwd = br.readLine();
          if(pwd.equals("vini"));
          else
            {
            System.out.println("SORRY...!! WRONG PASSWORD...!!! \n");
            System.out.println("1. TRY AGAIN ");
            System.out.println("2. EXIT ");
            choice = Integer.parseInt(br.readLine());
            if(choice == 1 )
            pay_fine_dam();
            else
            System.out.println("\n FINE NOT PAYED!!! PRESS ENTER TO CONTINUE...");
            br.readLine();
            start();  
     }     
    }
    catch(Exception e)
    {
        System.out.println("ERROR...!!! " + e + " PRESS ENTER TO CONTINUE.....");
    }
    try
    {
        br.readLine();
        start();
    }
    catch(Exception e) {}
   }

          
 //------------------------------------------------------------------------------------------------------------------------------
  public static void pay_admission_fees()
  {
     try
     {
      a.printline();
      System.out.println(" SELECT YOUR CHOICES : ");
      System.out.println("\n");
      System.out.println(" 1. ADMISSION FEES STRUCTURE ");
      System.out.println(" 2. PAY ADMISSION FEES ");
      choice = Integer.parseInt(br.readLine());
      
      switch(choice)
      {
          case 1 : adm_fees_structure();
          break ;
          case 2 : pay_adm_fees();
          break ;
          case 135 : start();
          break ;
          default : pay_admission_fees();
          break ;
        }
    }
  catch(Exception e)
  {
      System.out.println("ERROR.....!!" + e);
      pay_admission_fees();
    }
}
//------------------------------------------------------------------------------------------------------------------------------
  public static void adm_fees_structure()
  {
      try
      {
      a.printline();
      System.out.println(" The admission fees for the admission in SPS is Rs. 15,000 . once you pay this amount");
      System.out.println(" your name will be written in the school register for the particular class.");
      System.out.println("And the admission fees are the same for all the classes.");
      System.out.println(" \n ");
      System.out.println(" Press enter to continue....... ");
      br.readLine();
      pay_admission_fees();
    }
    
    catch(Exception e)
    {
        System.out.println("ERROR...!!! " + e);
  }
  try
  {
    System.out.println("Press Enter To Go To Last Menu...");
    br.readLine();
    pay_admission_fees();
  }
  catch(Exception e){}
}
//------------------------------------------------------------------------------------------------------------------------------
  public static void pay_adm_fees()
  {
      try
      {
      a.printline();
      
      System.out.println(" Select the class you are in : \n ");
      System.out.println(" 1. 6TH ");
      System.out.println(" 2. 7TH ");
      System.out.println(" 3. 8TH ");
      System.out.println(" 4. 9TH ");
      System.out.println(" 5. 10TH ");
      
      choice = Integer.parseInt(br.readLine());
      switch(choice)
      {
          case 1 : standard = 6 ;
          break ;
          case 2 : standard = 7 ;
          break ;
          case 3 : standard = 8 ;
          break ;
          case 4 : standard = 9 ;
          break ;
          case 5 : standard = 10 ;
          break ;
          default : wrn_choice();
          break;
    }
    a.printline();
    System.out.println(" \n ");

        System.out.println("TAKE AN AMOUNT OF RS.15,000 NEEDS TO BE TAKEN FROM THE STUDENT TO BE JOINED FOR ");
        System.out.println(standard + " TH CLASS  ... \n ");
        System.out.println(" PLEASE PRESS THE ENTER AFTER THE AMOINT IS TAKEN FROM THE STUDENT");
        br.readLine();
        a.printline();
        System.out.print("TYPE THE PASSWORD TO CONFIRM THAT FEES HAS BEEN TAKEN BY THE SCHOOL CLERK :");
        String pwd = br.readLine();
        if (pwd.equals("vini"))
        System.out.println(" \n CONGRATULATION....!!! THE NAME OF THE STUDENT HAS BEEN REGISTERD IN SPS FOR THE " + standard + "TH CLASS. ");
        adm_fees_check = true;
        System.out.println(" FOR THE STUDENT'S REFERENCE THE REGISTER OF THE CLASS WILL BE SHOWN LATER.");
        System.out.println(" \n PRESS ENTER TO CONTINUE.... ");
        name = entrance_form_info[0];
        br.readLine();
        start();
      }
 catch(Exception e)
 {
     System.out.println("ERROR..!!! " + e + "FEES NOT PAID. PRESS ENTER TO CONTINUE.");
     System.out.println("PRESS ENTER TO GO TO MAIN MENU...");
  }
  
  try
  {
      br.readLine();
      start();
    }
    
    catch(Exception e){}
}
//------------------------------------------------------------------------------------------------------------------------------ 
    public static void wrn_choice()throws IOException
    {
        System.out.println("WRONG CHOICE..!!! PRESS ENTER AND SELECT AGAIN");
        br.readLine();
        pay_adm_fees();
    }
//------------------------------------------------------------------------------------------------------------------------------

 public static void admission_interview()
 {
   try
   {
       a.printline();
     System.out.println("  TAKE ADMISSION INTERVIEW IN SPS...? SELECT YOUR CHOICE...");
     System.out.println(" \n \n ");
     System.out.println("  1. YES ");
     System.out.println("  2. N0");
     choice = Integer.parseInt(br.readLine());
     switch(choice)
     {
         case 1 : getentrance1();
         break;
         case 2 : start();
         break ;
         default : start();
        }
    }
    catch(Exception e)
    {
        System.out.println("ERROR....!!! PRESS ENTER TO GO BACK..." + e);
    } 
    try
    {
    br.readLine();
        admission_interview();
    }
    catch(Exception e){}
 }
  //------------------------------------------------------------------------------------------------------------------------------   
 public static void getentrance1()
 {
   try
   {
     a.printline();
     System.out.println("  To be eligible for entrance in SPS , The student has to write an entrance test");
     System.out.println("  and submit the marks of  his previous class. If he gets above 75% in both of");
     System.out.println("  the above spheres taken together , he can get his admissio into SPS. ");
     System.out.println("  the test is the same for students of classes 6th to 10th . for the Reasons that  ");
     System.out.println("  this public school has classes from 6th to 10th only. ");
     System.out.println("\n");
     System.out.println(" Press Enter To Continue....");
     br.readLine();
     getentrance2();
        }
         catch(Exception e)
    {
        System.out.println("ERROR....!!! PRESS ENTER TO RESELECT..." + e);   
    }   
    try
    {
        br.readLine();
        start();
    }
    catch(Exception e){}
    }
//------------------------------------------------------------------------------------------------------------------------------   
     public static void getentrance2()
 {
   try
   {
     a.printline();
     System.out.println("CHOOSE THE  OPTIONS ONE AFTER THE OTHER :");
     System.out.println(" \n \n ");
     System.out.println("  1. ENTRANCE FORM ");
     System.out.println("  2. WRITE ENTRANCE TEST ");
     System.out.println("  3. SUBMIT THE MARKS OF THE STUDENT'S PREVIOUS CLASS");
     System.out.println("  4. EXIT ");
     choice = Integer.parseInt(br.readLine());
     switch(choice)
     {
         case 1 : get_entrance_form() ;
         break;
         case 2 : wrt1_entrance_test();
         break ;
         case 3 : sbt_previous_class_marks();
         break ;
         case 4 : start();
         break ;
         default : System.out.println( "  INCORRECT OPTION SELECTED")  ;
        }
        a.timedelay2();
         start();
        }
         catch(Exception e)
    {
        System.out.println("ERROR....!!! PRESS ENTER TO RESELECT..." + e);   
    }   
    try
    {
        br.readLine();
        getentrance2();
    }
    catch(Exception e){}
    }
  
 //------------------------------------------------------------------------------------------------------------------------------

 public static void admission()
 {
     try
     {
     a.printline();
     System.out.println("PRESS ENTER TO VIEW YOUR REPORT");
     br.readLine();
     test_perc = counter * 10 ; 
     previous_class_perc = ( submarks[0] + submarks[1] + submarks[2] + submarks[3] + submarks[4] + submarks[5] + submarks[6]) * 100 / 700 ;
     if((test_perc + previous_class_perc) / 2 >= 75 )
     {
         System.out.println("CONGRADULATION...!!! STUDENT ELIGIBLE FOR ADMISSION...");
         System.out.println("\n \n ");
         System.out.println("CHILD CAN NOW BE TAKEN INTO SPS GIVEN THAT HE/SHE PAYS THE ADMISSION FEES WITHIN 5 DAYS.");
         System.out.println("PRESS ENTER TO CONTINUE.....");
         br.readLine();
         a.printline();
         start();
        }
      if ((counter == 0) && (counter1 == 0 ))
        {
            System.out.println("REPORT CANNOT BE PROVIDED AS NO TEST HAS BEEN WRITTEN");
            System.out.println("PRESS ENTER TO CONTINUE.....");
            br.readLine();
            start();
    }
    
    if ((test_perc + previous_class_perc) / 2 < 75)
    {
        System.out.println("SORRY.. STUDENT NOT ELIGIBLE FOR ADMISSION IN SPS...");
        System.out.println("PRESS ENTER TO CONTINUE.....");
         br.readLine();
         start();
        }
}
    catch(Exception e)
    {
       System.out.println("ERROR....!!! PRESS ENTER TO GO TO THE MAIN MENU..." + e );     
        }
        try
        {
            br.readLine();
         start();
        }
            catch(Exception e) {}
    }
        
//------------------------------------------------------------------------------------------------------------------------------       
     public static void  sbt_previous_class_marks() 
     {
         try
         {
            
         System.out.println("\t \t \t \t \t PLEASE ENTER THE MARKS IN YOUR PREVIOUS CLASS : \n \n");
         System.out.println("  ///////////////////////////////////");
         System.out.print("\n  /////// MATHS : " );
         submarks[1] = Integer.parseInt(br.readLine());
         System.out.print("\n  /////// PHYSICS : " );
         submarks[2] = Integer.parseInt(br.readLine());
         System.out.print("\n  /////// CHEMISTRY : " );
         submarks[1] = Integer.parseInt(br.readLine());
         System.out.print("\n  /////// BIOLOGY : " );
         submarks[3] = Integer.parseInt(br.readLine());
         System.out.print("\n  /////// COMPUTER : " );
         submarks[4] = Integer.parseInt(br.readLine());
         System.out.print("\n  /////// HISTORY & CIVICS : " );
         submarks[5] = Integer.parseInt(br.readLine());
         System.out.print("\n/////// GEOGRAPHY : " );
         submarks[6] = Integer.parseInt(br.readLine());
         System.out.println("  ///////////////////////////////////");
         System.out.println(" \n  ");
         a.printline();
         System.out.println(" \n  ");
         System.out.println("  THANK YOU.... YOU WILL BE TOLD WHETHER YOU HAVE QUALIFIED WITH THE TEST RESULTS. \n");
         System.out.println("  PRESS ENTER TO CONTINUE....");
         br.readLine();
         a.printline();
         getentrance2();
        }
        
        catch(Exception e )
        {
            System.out.println("ERROR....!!! PRESS ENTER TO GO TO THE ENTRANCE MENU..." + e );     
        }
        try
        {
            br.readLine();
         getentrance2();
        }
            catch(Exception e) {}
    }  
 //------------------------------------------------------------------------------------------------------------------------------        public static void  sbt_previous_class_marks() 
    public static void  get_entrance_form() 
     { 
         try
         {
         a.printline();
         a.pageflow();
         System.out.println("\t \t \t \t \t PLEASE ENTER THE MARKS IN YOUR PREVIOUS CLASS : \n \n");
         System.out.println("  ///////////////////////////////////");
         System.out.print("\n  /////// NAME : " );
         entrance_form_info[0] = br.readLine();
         System.out.print("\n  /////// CLASS : " );
         entrance_form_info[1] = br.readLine();
         System.out.print("\n  /////// FATHER'S NAME : " );
         entrance_form_info[2] = br.readLine();
         System.out.print("\n  /////// MOTHER'S NAME : " );
         entrance_form_info[3] = br.readLine();
         System.out.print("\n  /////// MOBILE NO. 1 : " );
         entrance_form_info[4] = br.readLine();
         System.out.print("\n  /////// MOBILE NO. 2 : " );
         entrance_form_info[5] = br.readLine();
         System.out.println("  ///////////////////////////////////");
         System.out.println(" \n  ");
         a.printline();
         System.out.println(" \n  ");
         System.out.println("  THANK YOU..... A UNIQUE ID NUMBER WLL BE GIVEN WHICH CAN BE USED TO GET ENTRANCE TEST. \n");
         System.out.println("  PRESS ENTER TO CONTINUE....");
         br.readLine();
         a.printline();
         unqid = (int)Math.floor((Math.random())*1000); ;
         System.out.println("YOU UNIQUE ID NUBER IS " + unqid + "\n");
         System.out.println("PRESS ENTER TO CONTINUE");
         br.readLine();
         getentrance2();
        }
        
        catch(Exception e )
        {
            System.out.println("ERROR....!!! PRESS ENTER TO GO TO THE ENTRANCE MENU..." + e );     
        }
        try
        {
            br.readLine();
         getentrance2();
        }
            catch(Exception e) {}
    }
 //------------------------------------------------------------------------------------------------------------------------------
  public static void wrt1_entrance_test()
   {
     try
     {
       a.pageflow();
       System.out.print("PLEASE ENTER THE UNIQUE ID NUMBER : ");
       get_unqid = Integer.parseInt( br.readLine());
       if(get_unqid == unqid)
       {
           System.out.println(" CORRECT ID NO...!!! PRESS ENTER TO PROCEDE ");
           br.readLine();
           wrt2_entrance_test();
        }
        
       else
        {
            System.out.println("WRONG ID NO...!!! PRESS ENTER TO TRY ONCE AGAIN...");
            wrt1_entrance_test();
        }
    
            if( get_unqid == 1234567890)
            {
                getentrance2();
            }
        
    }
    catch(Exception e)
    {
        System.out.println("ERROR...!!!" + e);
        System.out.println("PRESS ENTER TO CONTINUE");        
    }
    try
    {
        br.readLine();
        wrt2_entrance_test();
    }
    catch(Exception e){}
}
 //--------------------------------------------------------------------------------------------------------------------------------------------------   
       public static void wrt2_entrance_test()
       {
           try
           {
       a.pageflow();
       System.out.println("  THE TEST GIVEN IS A MULTIPLE CHOICE TYPE AND CONSISTS OF 10 quetions.");
       System.out.println("  THE RESULTS WILL NOT BE GIVEN NOW.THEY WILL BE SHOWN TO THE PARENTS WHENTHEY VIEW THE REPORTS.");
       System.out.println("  IT MAY CONTAIN QUETIONS FROM ALL SUBJECTS");
       System.out.println("\n \n " );
       a.load();
       a.timedelay2();
       System.out.println(" \n \n ");
       System.out.println("  WRAPPING UP OF DATA IS KNOWN AS : \n "); 
       System.out.println("  ####ABSTRACTION####");
       System.out.println("  ####ENCAPSULATION####"); // ANS
       System.out.println("  ####POLYMORPHISM####");
       System.out.println("  ####STTRIBUTE#### \n");
       System.out.println("  ENTER YOUR CHOICE... ");
       ans = 2 ;
       choice = Integer.parseInt(br.readLine());
       if(choice == ans)
       ++counter;
       
       a.printline();
       System.out.println(" \n \n ");
       System.out.println(" COMPUTER PART FROM WHICH WE TYPE : \n "); 
       System.out.println(" ####KEYBOARD##### "); // ANS
       System.out.println(" ####MOUSE#### ");
       System.out.println(" ####MONITOR#### ");
       System.out.println(" ####CPU#### \n ");
       System.out.println("  ENTER YOUR CHOICE... ");
       ans = 1;
       choice = Integer.parseInt(br.readLine());
       if(choice == ans )
       ++counter;
       a.printline();
       
       System.out.println(" \n \n ");
       System.out.println(" WHAT IS THE BASI AND THE FUNCTIONAL UNIT OF AN ORGANISM? \n "); 
       System.out.println(" ####EYE#### ");
       System.out.println(" ####CELL#### "); // ANS
       System.out.println(" ####MOUTH#### ");
       System.out.println(" ####EARS#### \n ");
       System.out.println("  ENTER YOUR CHOICE... ");
       ans = 2;
       choice = Integer.parseInt(br.readLine());
       if(choice == ans )
       ++counter;
       a.printline();
       
       System.out.println(" \n \n ");
       System.out.println(" WHAT IS MATTER MADE OF? \n "); 
       System.out.println(" ####PLASTIC#### ");
       System.out.println(" ####SOIL#### ");
       System.out.println(" ####AIR#### ");
       System.out.println(" ####ATOM#### \n "); // ANS
       System.out.println("  ENTER YOUR CHOICE... ");
       ans = 4;
       choice = Integer.parseInt(br.readLine());
       if(choice == ans )
       ++counter;
       a.printline();
       
       System.out.println(" \n \n ");
       System.out.println(" WHICH IS THE CAPITAL OF KARNATAKA? \n ");
       System.out.println(" #### MANGLORE #### ");
       System.out.println(" #### MYSORE #### ");
       System.out.println(" #### TUMKUR #### ");
       System.out.println(" #### BENGALURU #### \n "); // ANS
       System.out.println("  ENTER YOUR CHOICE... ");
       ans = 4 ;
       choice = Integer.parseInt(br.readLine());
       if(choice == ans )
       ++counter;
       a.printline();
       
       System.out.println(" \n \n ");
       System.out.println(" WHO WON THE MAHABHARATHA WAR? \n ");
       System.out.println(" #### KAURAVAS #### "); 
       System.out.println(" #### KRISHNA #### ");
       System.out.println(" #### PANDAVAS #### "); // ANS
       System.out.println(" #### RAMA #### \n ");
       System.out.println("  ENTER YOUR CHOICE... ");
       ans = 3 ;
       choice = Integer.parseInt(br.readLine());
       if(choice == ans )
       ++counter;
       a.printline();
       
       System.out.println(" \n \n ");
       System.out.println(" WHERE IS INDIA LOCATED? \n ");
       System.out.println(" #### ASIA #### "); // ANS
       System.out.println(" #### EUROPE #### ");
       System.out.println(" #### AFRICA #### ");
       System.out.println(" #### AUSTRALIA #### \n ");
       System.out.println("  ENTER YOUR CHOICE... ");
       ans = 1 ;
       choice = Integer.parseInt(br.readLine());
       if(choice == ans )
       ++counter;
       a.printline();
       
       System.out.println(" \n \n ");
       System.out.println(" SOLVE THIS : 2 * 2  - 2 / 2 \n ");
       System.out.println(" #### 4 #### ");
       System.out.println(" #### 3 #### "); // ANS
       System.out.println(" #### 0 #### ");
       System.out.println(" #### 1 #### \n ");
       System.out.println("  ENTER YOUR CHOICE... ");
       ans = 2 ;
       choice = Integer.parseInt(br.readLine());
       if(choice == ans )
       ++counter;
       a.printline();
       
       System.out.println(" \n \n ");
       System.out.println(" SOLVE THIS : 17 * 6 \n ");
       System.out.println(" #### 98 #### ");
       System.out.println(" #### 12 ####  ");
       System.out.println(" #### 102 #### "); // ANS
       System.out.println(" #### 109 #### \n ");
       System.out.println("  ENTER YOUR CHOICE... ");
       ans = 3 ;
       choice = Integer.parseInt(br.readLine());
       if(choice == ans )
       ++counter;
       a.printline();
       
       System.out.println(" \n \n ");
       System.out.println(" HE WAS PLAYING ______ THE PARK. FILL IN THE BLANK WITH PROPER PREPOSITION . \n ");
       System.out.println(" #### ON #### ");
       System.out.println(" #### UPON #### ");
       System.out.println(" #### IN #### "); // ANS
       System.out.println(" #### DOWN #### \n ");
       System.out.println("  ENTER YOUR CHOICE... ");
       ans = 3 ;
       choice = Integer.parseInt(br.readLine());
       if(choice == ans )
       ++counter;
       a.printline();
       
       System.out.println("  TEST IS COMPLETED.RESULTS WILL BE GIVEN WITH THE REORTS. \n ");
       System.out.println("  PRESS ENTER TO CONTINUE....");
       br.readLine();
       getentrance2();
    }
    catch(Exception e)
    {
        System.out.println("ERROR....!!! PRESS ENTER TO GO TO THE ENTRANCE MENU...." + e);   
    }
      try
    {
        br.readLine();
        start();
    }
    catch(Exception e){}
 }  

// ------------------------------------------------------------------------------------------------------------------------------    
     public static void idcard()throws IOException //SHOWS A SAMPLE ID CARD IN AN ANIMATED WAY...
     // I.E. THE ID CARD IS DISPLAYED AS IN A POWERPOINT PRESENTATION
      {
          
      try{
          a.printline();
          System.out.println(" Please the following information: \n \n ");
          
          System.out.print("\n   NAME : " );
          String  n = br.readLine(); // ACCEPTS STRING VALUE AND STORES THE NAME OF STUDENT
          System.out.print("\n   CLASS : " );
          String  c = br.readLine(); // ACCEPTS STRING VALUE AND STORES THE CLASS OF STUDENT
          System.out.print("\n   DATE OF BIRTH :");
          String  r = br.readLine(); // ACCEPTS STRING VALUE AND STORES THE DATE OF BIRTH OF STUDENT
          System.out.print("\n   BLOOD GROUP :");
          String b = br.readLine(); // ACCEPTS STRING VALUE AND STORES THE BLOOD GROUP OF STUDENT
          System.out.print("\n   TOWN :");
          String t = br.readLine(); // ACCEPTS STRING VALUE AND STORES THE TOWN OF STUDENT WHERE HE LIVES
          System.out.print("\n   SCHOOL : ");
          String s = br.readLine(); // ACCEPTS STRING VALUE AND STORES THE SCHOOL NAME OF STUDENT
          
          n = n.toUpperCase();
          t = t.toUpperCase();
          b = b.toUpperCase();
          s = s.toUpperCase();   
                                                                         
         System.out.println("                                                     ==     ");  
         a.timedelay2();
         System.out.println("                                                  ==     ==       ");  
         a.timedelay2();
         System.out.println("                                                ==        ==        ");  
         a.timedelay2();
         System.out.println("                                               ==          == ");  
         a.timedelay2();
         System.out.println("                                              ==             ==     ");      
         a.timedelay2();
         System.out.println("                                             ==               ==      ");       
         a.timedelay2();
         System.out.println("                                            ==                 ==       ");    
         a.timedelay2();
         System.out.println("                                           ==                   ==      ");  
         a.timedelay2();
         System.out.println("                                          ==                     ==       ");  
         a.timedelay2();
         System.out.println("                                         ==                       ==       ");  
         a.timedelay2();
         System.out.println("                                        ==                         ==         ");     
         a.timedelay2();
         System.out.println("                                       ==                           ==       ");   
         a.timedelay2();
         System.out.println("                                      ==                             ==        ");    
         a.timedelay2();
         System.out.println("                                     ==                               ==        ");  
         a.timedelay2();
         System.out.println("                                    ==                                 ==      ");  
         a.timedelay2();
         System.out.println("                                    ==                                 ==       ");  
         a.timedelay2();
         System.out.println("                                     ==                               ==       ");  
         a.timedelay2();
         System.out.println("                                      ==                             ==      ");  
         a.timedelay2();
         System.out.println("                                       ==                           ==       ");  
         a.timedelay2();
         System.out.println("                                        ==                         ==      ");  
         a.timedelay2();
         System.out.println("                                         ==                       ==          ");  
         a.timedelay2();
         System.out.println("                                          ==                     ==          ");  
         a.timedelay2();
         System.out.println("                                           ==                   ==    ");  
         a.timedelay2();
         System.out.println("                                            ==                 ==      ");  
         a.timedelay2();
         System.out.println("                                             ==               ==   ");  
         a.timedelay2();
         System.out.println("                                              ==             ==        ");  
         a.timedelay2();
         System.out.println("                                               ==           ==    ");  
         a.timedelay2();
         System.out.println("                                                 ==        ==         ");  
         a.timedelay2();
         System.out.println("                                                   ==     ==             ");  
         a.timedelay2();
         System.out.println("                                ==============================================");
         a.timedelay2();
         System.out.println("                                                                          ");                   
         a.timedelay2();
         System.out.println("                                  NAME              ::|::     " + n + "          ");   
         a.timedelay2();
         System.out.println("                                  CLASS             ::|::     " + c + "          ");  
         a.timedelay2();
         System.out.println("                                  DATE OF BIRTH     ::|::     " + r + "          ");   
         a.timedelay2();
         System.out.println("                                  BLOOD GROUP       ::|::     " + b + "          "); 
         a.timedelay2();
         System.out.println("                                  TOWN              ::|::     " + t + "          ");
         a.timedelay2();
         System.out.println("                                  SCHOOL            ::|::     " + s + "          ");
         a.timedelay2();
         System.out.println("                                                                          ");   
         a.timedelay2();
         System.out.println("                                ============================================== ");
         a.timedelay2();
         System.out.println("\n \n");
         System.out.println("Please press enter to continue......");
         br.readLine();
         start();
                            
        }

    catch(Exception e)
        {
            System.out.println("ERROR.....!!!!!" + e);
            start();
          }
    }
      
// ------------------------------------------------------------------------------------------------------------------------------    
    
   public static void exit()
    {
         a.pageflow();
         System.out.println();
         System.out.println();
         a.printline();
         System.out.println();
         System.out.println("           ######## ##   ##  ######  ###    ##  ##  ## ######  ");
         a.timedelay2();
         System.out.println("              ##    ##   ##  ##  ##  ## ##  ##  ## ##  ##      ");
         a.timedelay2();
         System.out.println("              ##    #######  ######  ##  ## ##  ####   ######  ");
         a.timedelay2();
         System.out.println("              ##    ##   ##  ##  ##  ##   ####  ## ##      ##  ");
         a.timedelay2();
         System.out.println("              ##    ##   ##  ##  ##  ##    ###  ##  ## ######  ");
         System.out.println();
         System.out.println("");
         a.printline();
         System.out.println("");
         System.out.println("");
         System.out.println("");
         System.out.println("SCHOOL MANAGEMENT SYSTEM BY VINAYAK, 10TH STD. SHESHADRIPURAM PUBLIC SCHOOL");
         System.out.println("");
         System.out.println("");
    }
    
    
}
//############################################################################################################################################
//#########################################4TH CLASS DECLARATION AND DEFINITION ###############################################################
 //########################################LIBRARY MANAGEMENT SYSTEM###############################################################      
 class library
{
    
    static start a = new start(); //object created
    static management man = new management(); // another object created
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int bookcode[]={1,2,3,4,5,6,7,8,9,10,11};
    static String bookname[]={"Discover India","Julius Ceaser","Gitanjali","The Guide","King Lear","The Jungle Book","Malgudi Days","Chandragupt","Sayunkt Rashtra","Comp. Basics","Mudrarakshasha"};
    static String author[]={"Pt Nehru","Shakespeare","R. Tagore","RK Narayan","Shakespeare","Rudyard Kipling","RK Narayan","Prakash Nagaych","Liladhar P","Sumita Arora","Bishakadatta"};
    static String publisher[]={"Goyal","Selina","Allied","Goyal","Selina","Allied","Goyal","Selina","Allied","Goyal","Selina"};
    static float price[]={200,800,300,450,600,750,500,1000,1500,650,625}; // prices of books
    static int bookcount[]={10,20,10,5,8,9,12,32,3,5,11};
    static int count=11; //  no of books in library
    static int flag1=0; //used in if-else statements
    static int issuebookcode[]=new int[count]; // stores book code
    static String issuebookname[]=new String[count];// stores book name
    static String issueauthor[]=new String[count]; // stores author name
    static int bookissue=0; //to know how many boks are issued

    static float late; // used to store the no of days given late(books)
    static float lost;  //used to store the book lost
 //------------------------------------------------------------------------------------------------------   
  public static void libmenu() throws IOException
    {
        try
        {
            a.animation("LIBRARY MANAGEMENT SYSTEM" , "" );
            System.out.println("\n\n\n\n====================== LIBRARY MENU =====================");
            System.out.println("1. Display all the Books");
            System.out.println("2. Search Books");
            System.out.println("3. Delete Book");
            System.out.println("4. Issue Books");
            System.out.println("5. Return Book");
            System.out.println("6. Late Fine");
            System.out.println("7. Lost Fine");
            System.out.println("8. Report");
            System.out.println("9. Introduction Menu");
            System.out.println("10. Quit");
            System.out.println("======================================================");
            System.out.println();
            System.out.print("Enter your choice : ");
            InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(isr);
            String input = br.readLine();
            int val=Integer.parseInt(input);

            switch(val)
            {
                case 1 : display();
                            break;
                case 2 : search();
                            break;
                case 3 : delbook();
                            break;
                case 4 : issueBook();
                            break;
                case 5 : returnBook();
                            break;
                case 6 : lateFine();
                            break;
                case 7 : lostFine();
                            break;
                case 8 : report();
                            break;
               case 9 : man.start();
                          break;
                case 10 : man.exit();
                            break;
               
            }
        }

        catch(Exception e)
        {
            System.out.println("Error Message "+e + "press enter to continue"); 
        }

    try
    {
        br.readLine();
        man.start();
    }
        catch(Exception e){}
    }
 //-------------------------------------------------------------------------------------------------------------   

//------------------------------------------------------------------------------------------------------------
  public static  void delbook() throws IOException
    {
        BufferedReader brs=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the book code to be deleted");
        int code=Integer.parseInt(brs.readLine());
        int temp=0,flg=0,i,j;

        for(i=0;i<count;i++)
        {
            for(j=0;j<bookissue;j++)
            {
                if(issuebookcode[j]==code)
                {
                    System.out.println("Sorry! Cannot delete the book.. Book is already issued to the student");
                    temp=1;
                    break;
                }
            }

            if (temp==1)
                break;
            else
              if(bookcode[i]==code)
                {
                    bookname[i]=bookname[count-1];
                    author[i]=author[count-1];
                    bookcount[i]=bookcount[count-1];
                    publisher[i]=publisher[count-1];
                    price[i]=price[count-1];
                    bookcode[i]=bookcode[count-1];
                    count--;
                    System.out.println("Book Deleted");
                    flg=1;
                    break;
                }
		}
			if(flg==0)
                {
                    System.out.println("Book Not Found");
                }

        System.out.println("Press ENTER to continue...");
        String wait=brs.readLine();

        libmenu();
    }   
//----------------------------------------------------------------------------------------------------------
  public static void display() throws IOException
    {
            // l.pageflow();
             a.printline();

             System.out.println("Code\tBook Name\tAuthor Name\tPublisher\tCopies\tPrice");
             a.printline();

            try
            {
                int i;
                for(i=0;i<count;i++)
                {
                    if(bookcode[i]!=0)
                     System.out.println(bookcode[i] + "\t" +bookname[i] + "\t" + author[i] + "\t" + publisher[i] +"\t\t"+ bookcount[i] + "\t" +price[i]);
                }
                a.printline();
                System.out.println();
                System.out.println();

                System.out.println("Press Enter to continue...");
                String dsp=br.readLine();
                libmenu();
            }

            catch(Exception e)
            {
                System.out.println(e);
                libmenu();
            }
    }
//------------------------------------------------------------------------------------------------------------
  public  static void search() throws IOException
    {
        try
        {
            int x=0;
            System.out.println("Enter the book code to be searched");
            String bk=br.readLine();
            int code=Integer.parseInt(bk);

             a.printline();

             System.out.println("Code\tBook Name\tAuthor Name\tPublisher\tCopies\tPrice");
             a.printline();

            for(int i=0;i<count;i++)
            {
                if(bookcode[i]==code)
                {
                     System.out.println(bookcode[i] + "\t" +bookname[i] + "\t" + author[i] + "\t" + publisher[i] +"\t\t"+ bookcount[i] + "\t" +price[i]);
                     x=1;
                }
            }

            if(x==0)
                 System.out.println("Book Not Found");

            a.printline();
            System.out.println("Press Enter to continue...");
            String wait=br.readLine();
            libmenu();
        }

        catch(Exception e)
        {
            System.out.println("SEARCH BOOK ERROR");
            libmenu();
        }
    } 
//----------------------------------------------------------------------------------------------------------------------
  public static void issueBook() throws IOException
    {
        int x=0;

        try
        {
            System.out.println("\nNumber of Books exists in the Library = "+count);
            a.printline();

            System.out.print("Enter the book code to be Issued : ");
            String bk=br.readLine();
            int code=Integer.parseInt(bk);
            a.printline();

            for(int i=0;i<count;i++)
            {
                if(bookcode[i]==code)
                {
                    {
                        issuebookname[bookissue]=bookname[i];
                        issuebookcode[bookissue]=bookcode[i];
                        issueauthor[bookissue]=author[i];
                        bookcount[i]--;

                        System.out.println("Issued book\n" + (i+1) + "\t" +issuebookname[bookissue] + "\t" +issuebookcode[bookissue]+ "\t" + issueauthor[bookissue] + "\t"+bookcount[i]);
                    }
                    bookissue++;
                    x=1;
	                break;
                }
            }
            if(x==0)
                 System.out.println("Book Not Found");

            a.printline();
            System.out.println("Total Number of Books issued : " + bookissue);
        }

        catch(Exception e)
        {
            System.out.println("BOOK ISSUE ERROR");
            libmenu();
        }

        System.out.println();
        System.out.println("Press Enter to continue...");

        String wait=br.readLine();
            libmenu();
    }
    
//-------------------------------------------------------------------------------------------------------------------
  public static void returnBook() throws IOException
    {
        int x=0;

        try
        {
            BufferedReader brs=new BufferedReader(new InputStreamReader(System.in));

			for(int j=0;j<=bookissue;j++)
				{
					System.out.print("BookName Issued : " + issuebookname[j]);
					System.out.print("\tBookCode : " + issuebookcode[j]);
					System.out.println("\tAuthor : " + issueauthor[j]);
				}

            System.out.println("Enter the book code of the returned book");
            String bk=brs.readLine();
            int code=Integer.parseInt(bk);
            a.printline();

            for(int i=0;i<=bookissue && x==0;i++)
            {
                if(issuebookcode[i]==code)
                {
                     x=1;
                        {
                            issuebookname[i]="";
                            issuebookcode[i]=0;
                            issueauthor[i]="";
                            bookissue--;
                        }
                    for(int bc=0;bc<count;bc++)
                    {
                        if(bookcode[bc]==code)
                        {
                            bookcount[bc]++;
                            break;
                        }
                    }
                }
            }

            if(x==0)
                 System.out.println("Book Not Found");

            a.printline();

            System.out.println("Press Enter to continue...");

            String wait=brs.readLine();
                libmenu();
        }

        catch(Exception e)
        {
            System.out.println("Book Return Error");
            libmenu();
        }
    }
//---------------------------------------------------------------------------------------------------------------------
  public static void lateFine() throws IOException
    {
        try
        {
			int tmp=0;
            BufferedReader lf = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("\nEnter the bookcode returning late : ");
            String bkcode=lf.readLine();
            int bkcd=Integer.parseInt(bkcode);

            System.out.print("\nEnter the number of days delayed in returning the book : ");
            String lfstr=lf.readLine();
            late=Integer.parseInt(lfstr);

            a.printline();
            System.out.println("Penalty Structure");
            System.out.println("1. Rs.5 per day Late Fine");
            System.out.println("2. Actual Cost of the Book for \"Lost Fine\" & Rs. 100 Penalty");
            a.printline();

            late=late*5;

            for(int b=0;b<count;b++)
            {
                if(bookcode[b]==bkcd)
                {
                    System.out.println("Please pay the penalty of Rs. " + late + " for delayed return of the book \"" + bookname[b]+"\"");
                    tmp=1;
                    break;
                }
            }
				if(tmp==0)
				{
					System.out.println("Book Code Not Found");
				}

            a.printline();
            System.out.println("Press Enter to continue...");

            String wait=lf.readLine();
            libmenu();
        }

        catch(Exception e)
        {
            System.out.println("LATE FINE ERROR");
            libmenu();
        }
    }
//--------------------------------------------------------------------------------------------------------------------
  public static void lostFine() throws IOException
    {
		int tmp=0;
        try
        {
            a.printline();
            System.out.println("Penalty Structure");
            System.out.println("1. Rs.5 per day Late Fine");
            System.out.println("2. Actual Cost of the Book for \"Lost Fine\" & Rs. 100 Penalty");
            a.printline();

            BufferedReader lof = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("\nEnter the bookcode of the book, which is lost : ");
            String bkcode=lof.readLine();
            int bkcd=Integer.parseInt(bkcode);

            a.printline();
            for(int b=0;b<count;b++)
            {
                if(bookcode[b]==bkcd)
                {
                    bookissue--;
                    lost = price[b] + 100;
                    System.out.println("Please pay the penalty of Rs. " + lost + " for loss of the book \"" + bookname[b]+"\"");
                    tmp=1;
                    break;
                }

                if(issuebookcode[b]==bkcd)
                {
                    issuebookname[b]="";
                    issuebookcode[b]=0;
                    issueauthor[b]="";
                }
            }
                if(tmp==0)
                {
                    System.out.println("Book Code Not Found");
                }

            a.printline();
            System.out.println("Press Enter to continue...");

            String wait=lof.readLine();
            libmenu();
        }
        catch(Exception e)
        {
            System.out.println("LOST BOOK ERROR");
            libmenu();
        }
    }
//---------------------------------------------------------------------------------------------------------------------------
  public static void report() throws IOException
    {
        int totbooks=0;
        for(int x=0;x<count;x++)
        {
            totbooks+=bookcount[x];
        }

       // l.pageflow();
        a.printline();

        if(bookissue<0)
        	bookissue=0;

        System.out.println("Number of Book Category in the Library : " + count);
        System.out.println("Number of Books issued                 : " + bookissue);
        System.out.println("Number of Total Books available        : " + totbooks);
        System.out.println("Total Late Fees Penalty Collected      : " + late);
        System.out.println("Total Books Lost Penalty Collected     : " + lost);
        System.out.println();

        a.printline();
        System.out.println("Press Enter to continue...");

        String wait=br.readLine();
        libmenu();   
    }     
 //----------------------------------------------------------------------------------------------------------   
  
        
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////// PROGRAM ENDS HERE//////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////