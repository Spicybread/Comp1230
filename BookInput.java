/*
    Student name: Vu Nguyen
    Student number: T00612390
    Due date: Oct 22, 2019
    Seminar: 5

    Description: This  BookInput class is a program that takes in a string,
    40 long, 20 for the title, 15 for author, 4 for the year, and 1 for the book location.

    ie:    Java Foundations    Lewis et al    2015H
           | ←  20 chars   →   |←15 chars→    |

 */
import java.util.Scanner;
import java.lang.Exception;
public  class BookInput
    {

        public static void main(String[] args)
        {

            String bookInfo;
            boolean check = true;
            String title;
            String author;
            int year;
            char library;


            Scanner input = new Scanner(System.in);
            System.out.println("Enter book information, type \"STOP\" to stop ");
            bookInfo = input.nextLine();


            while (!bookInfo.equals("STOP"))
                {


                try
                    {
                    // System.out.println(bookInfo.length());


                    //these are specific scenarios that indicate a missing section:
                    //                                      title, author, or year

                    // wouldn't make too much sense to put these in since .length()
                    // might be 20, but not necessarilybe missing the title section
                    // but might be useful if needed.

                    //                if(bookInfo.length() == 20)
                    //                    throw new StringIndexOutOfBoundsException("Book inputed is
                    //                  missing title section ");
                    //
                    //                if(bookInfo.length() == 35)
                    //                    throw new StringIndexOutOfBoundsException("Book inputed is
                    //                                          missing author section");
                    //
                    //                if(bookInfo.length() == 39)
                    //                    throw new StringIndexOutOfBoundsException("Book inputed is
                    //                                            missing year section");
                    //


                    //this if-statement checks and throws NumberFormatException exception whether or not
                    //                                                      the year is too old and new
                    if (bookInfo.length() > 40)
                        throw new StringIndexOutOfBoundsException("Book inputed is too long");
                    if (bookInfo.length() < 40)
                        throw new StringIndexOutOfBoundsException("Book inputed is too short");


                    title = bookInfo.substring(0, 19);
                    author = bookInfo.substring(20, 35);
                    year = Integer.parseInt(bookInfo.substring(35, 39));
                    library = bookInfo.charAt(39);

                    //this checks and then throws a NumberFormatException if the year is too old
                    //                                                                   or new*

                     if(year > 2019)
                        {
                        throw new YearCheck(title.trim() + " published in " + year +
                                                                " is an invalid year");
                        }
                    else if (year < 2000)
                        {
                        throw new YearCheck(title.trim() + " published in " + year +
                                                                        " is too old");
                        }

                    //these four if-statements checks, then throws the isAtLibrary exception
                    //                  whether or not the final-character has been satisfied


                    if (library == 'H')
                        throw new isAtLibrary(title.trim() + " by " + author.trim() +
                                " published in " + year + " is at the House of Learning Library");

                    if (library == 'L')
                        throw new isAtLibrary(title.trim() + " by " + author.trim() +
                                " published in " + year + " is at the Main Library");

                    if (library == 'O')
                        throw new isAtLibrary(title.trim() + " by " + author.trim() + " publishef in "
                                                        + year + " is at a library that is not at TRU");

                    if (library != 'h' | library != 'L' | library != 'O')
                        throw new isAtLibrary("Book inputed does not have one of the " +
                                "                                   required final character");


                    }
                //Start of exception catch blocks

                    //unique exception to check the year
                catch (YearCheck exception)
                    {
                    System.out.println(exception);
                    }

                    //unique exception to check the book location
                catch (isAtLibrary exception)
                    {
                    System.out.println(exception);
                    }

                catch(StringIndexOutOfBoundsException exception)
                    {
                    System.out.println(exception);
                    }

                catch(NumberFormatException exception)
                    {

                    System.out.println(bookInfo.substring(35, 39) + " is an invalid year");
                    }

                catch(ArithmeticException exception)
                    {
                    System.out.println("incorrect calculation");
                    }


                System.out.print("Enter a book title or STOP to quit: ");
                bookInfo = input.nextLine();


                }
            //if input == "STOP", program goes through these two lines
            System.out.println("Program has stopped");

            //not sure if it's 100% needed, but here we close the scanner stream.
            input.close();
        }
    }



