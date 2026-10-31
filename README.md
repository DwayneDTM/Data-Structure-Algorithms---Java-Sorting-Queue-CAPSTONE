# IT Help Desk Ticketing System

## Project Description
The IT Help Desk Ticketing System is a console-based Java application that records IT support requests and manages them using sorting algorithms and a FIFO queue. It helps organize tickets and process them in the order they are received.

## Features
- Add help desk tickets with an automatically generated ticket number
- Store ticket information using ArrayLists
- Enqueue tickets in a FIFO queue
- Process and remove the next ticket in the queue
- View the next ticket without removing it
- Display the waiting queue and all recorded tickets
- Sort tickets by ticket number using Bubble Sort
- Sort tickets by requester name using Selection Sort
- Search for a ticket by its ticket number
- Validate menu input and prevent empty ticket fields

## Data Structures and Algorithms

### ArrayLists
The program uses ArrayLists to store ticket numbers, requester names, and issue descriptions.

### Queue
The queue follows the First In, First Out (FIFO) principle. The ticket added first is processed first.

### Bubble Sort
Bubble Sort arranges tickets by ticket number in ascending order by comparing adjacent elements and swapping them when needed.

### Selection Sort
Selection Sort arranges tickets alphabetically by requester name by repeatedly selecting the smallest name and placing it in the correct position.

## Requirements
- Java Development Kit (JDK)
- A terminal or command prompt

## How to Run
1. Open the project folder in a terminal.
2. Compile the program:

   ```bash
   javac Main.java
   ```

3. Run the program:

   ```bash
   java Main
   ```

## Screenshots
Add screenshots of the running program here, including the main menu, adding a ticket, displaying the queue, sorting tickets, searching for a ticket, and processing a ticket.

## Developers
[Add your name and group members here.]

## Repository
This project was created as a Data Structures and Algorithms capstone project.
