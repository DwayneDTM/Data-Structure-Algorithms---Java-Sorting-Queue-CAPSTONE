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
### Main Menu
![Main Menu]([Screenshot 2026-10-31 225808.png](https://1drv.ms/i/c/743fd89f8ea2c58d/IQD_56BCX3kQRoxDVq0OtciqAVmlhhpc-SUhHYhTipU6NxQ?e=nsUugH))

### Adding a Ticket
![Adding a Ticket]([screenshots/02-add-ticket.png](https://1drv.ms/i/c/743fd89f8ea2c58d/IQAcR8x4ABwETY-yrNOHqpLLATrPBwBDjnNkkfYNoRBJ0lA?e=cZzwIu))

### Displaying the Queue
![Displaying the Queue]([screenshots/03-display-queue.png](https://1drv.ms/i/c/743fd89f8ea2c58d/IQD-yldJ5ruwSYCCuzBlHlo-AeqcazRNJtDGwNJ4-gDDQbU?e=gUk5Zw))

### Sorting Tickets
![Bubble Sort]([screenshots/04-bubble-sort.png](https://1drv.ms/i/c/743fd89f8ea2c58d/IQDzmh356xP2RoQokdvOS4VOAXIXTiMxpdt9inkELCehrjU?e=jj4eol))

### Searching for a Ticket
![Searching for a Ticket]([screenshots/05-search-ticket.png](https://1drv.ms/i/c/743fd89f8ea2c58d/IQDzmh356xP2RoQokdvOS4VOAXIXTiMxpdt9inkELCehrjU?e=jj4eol))

### Processing a Ticket
![Processing a Ticket]([screenshots/06-process-ticket.png](https://1drv.ms/i/c/743fd89f8ea2c58d/IQDzmh356xP2RoQokdvOS4VOAXIXTiMxpdt9inkELCehrjU?e=jj4eol))

## Developer
Dwayne Kaiser Menodza

## Repository
This project was created as a Data Structures and Algorithms capstone project.
