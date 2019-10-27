/*
    Student name: Vu Nguyen
    Student number: T00612390
    Due date: Oct 22, 2019
    Seminar: 5

    Description: This is the YearCheck exception for the BookInput class.
                   This exception just returns the string s, some message s.
                   None of the Checked throwable exceptions fit the naming description
                   so this was made and does a generic thing, prints the message.
*/

public class YearCheck extends Exception
    {
        public YearCheck()
        {
            super("The value inputted is valid");
        }

        public YearCheck(String s)
        {
            super(s);
        }
    }
