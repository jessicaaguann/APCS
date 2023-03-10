/*
Implement class Ticket to represent an event ticket. Each ticket has a unique number and a price.
There are three types of tickets: walk-up tickets, advance tickets, and student advance tickets.

                               	      Ticket
                                field: number
                                constructor: Ticket(number)
                                method: getPrice()
                                method: toString()
                                        |
			       _____________________
			      |		     	    |
                        Walkup Ticket        Advance Ticket
              					    |
					  Student Advance Ticket

? Walk-up tickets are purchased the day of the event and cost $50.
? Advance tickets purchased 10 or more days before the event cost $30, while advance tickets
purchased fewer than 10 days before the event cost $40.
? Student advance tickets are sold at half the price of normal advance tickets.

Class Ticket will serve as the superclass for all three types of tickets.
Define all common operations in this class, and specify all differing operations in such a way
that every subclass must implement them. No actual objects of type Ticket will be created: Each
actual ticket will be an object of a subclass type. Define the following operations:
? The ability to construct a ticket by number.
? The ability to ask for a ticket?s price.
? The ability to println a ticket object as a String, e.g. "Number: 17, Price: 50.0"
*/

/*
Class Ticket is abstract, i.e. it cannot be instantiated; rather, it serves as a super-class
to hold common code and declare abstract behavior.  No one buys just a ticket; the Ticket class
represents a general category that we want the other classes to extend. An abstract class can
count on its subclasses to implement its abstract methods.

Really, the Employee class introduced earlier in this chapter should also have been an abstract
class. We did not especially want client code to construct Employee objects. No one is just an
employee; as with abstract class Ticket, the Employee class merely represents a general category
that we want the other classes to extend.
*/


public abstract class Ticket {

	double price = 50.0;
	int ticketIDNumber;

    //implement field and constructor
	
	public Ticket (int ticketIDNumber) {
		this.ticketIDNumber = ticketIDNumber;
	}

	public double getPrice() {
        return price;
    }

    //implement toString method
    
    public String toString() {
    	return String.format("Number: ", this.ticketIDNumber, ", Price: ", this.getPrice());
    }
    
}
