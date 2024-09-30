# Bookazon

Bookazon is a Java-based book ordering and management system designed to demonstrate object-oriented programming principles and best practices.

## Introduction

Bookazon is a simulated online bookstore system that allows users to manage books, users, and orders. It implements various design patterns and follows SOLID principles to create a robust and maintainable codebase.

## Features

- User management with different subscription levels (Normal, Silver, Gold, Platinum)
- Book and e-book item management
- Shopping cart functionality
- Order processing with shipping and billing address validation
- Subscription-based pricing discounts

## Project Structure

The project is organized into several key components:
- **Bookazon.java:** Main class that initializes the system and demonstrates its usage
- **User.java:** Represents a user of the system
- **Item.java:** Interface for book items
- **Book.java and Ebook.java:** Implementations of the Item interface
- **Cart.java and CartItem.java:** Handle shopping cart functionality
- **Order.java:** Manages order details and processing
- **Subscription.java:** Interface for subscription types
- **NormalSubscription.java, SilverSubscription.java, GoldSubscription.java, PlatinumSubscription.java:** Implement different subscription levels
- **Address.java and Addressable.java, AddressValidator.java:** Handle address information
- **BookValidator.java:** Validates book information

## To set up the Bookazon project:

Ensure you have Java Development Kit (JDK) 8 or higher installed.
- Clone the repository:
- Navigate to the project directory:

```git
git clone https://github.com/James23xr/Group-Sprint-1-Bookazon.git
```

- Navigate to the project directory:
- Compile the Java files:
```git
javac *.java
```

## Usage
To run the Bookazon system:

After compiling, run the main class:
Copyjava Bookazon

The system will initialize with sample data and demonstrate various operations.

Example usage in code:

## To run the Bookazon system:

- After compiling, run the main class:
```java
// Create a new Bookazon instance
Bookazon bookstore = new Bookazon();

// Add a new book
Book newBook = new Book("1984", "George Orwell", 1949, 9.99, true);
bookstore.getBookManager().addBook(newBook);

// Create a new user
User newUser = new User("John Doe", new NormalSubscription());
bookstore.getUserManager().addUser(newUser);

// Add a book to the user's cart
newUser.addToCart(newBook, 1);

// Process the order
newUser.checkout();
```

## Contributing
We welcome contributions to Bookazon! If you'd like to contribute:

- Fork the repository
- Create a new branch for your feature
- Commit your changes
- Push to your branch
- Create a new Pull Request

Please ensure your code adheres to the existing style and includes appropriate tests.


