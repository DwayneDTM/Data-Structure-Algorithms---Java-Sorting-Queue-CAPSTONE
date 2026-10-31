import java.util.ArrayList;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

static Scanner input = new Scanner(System.in);

static ArrayList<Integer> ticketIds = new ArrayList<>();
static ArrayList<String> requesters = new ArrayList<>();
static ArrayList<String> issues = new ArrayList<>();

static Queue<Integer> ticketQueue = new ArrayDeque<>();

static int nextTicketId = 1001;

public static void main(String[] args) {

int choice;

do {
System.out.println("\n===== IT HELP DESK TICKETING SYSTEM =====");
System.out.println("1. Add Ticket");
System.out.println("2. Process Next Ticket");
System.out.println("3. View Next Ticket");
System.out.println("4. Display Ticket Queue");
System.out.println("5. Display All Tickets");
System.out.println("6. Sort Tickets by Ticket Number (Bubble Sort)");
System.out.println("7. Sort Tickets by Requester Name (Selection Sort)");
System.out.println("8. Search Ticket");
System.out.println("9. Exit");

choice = readInt("Enter your choice: ");

switch (choice) {
case 1:
addTicket();
break;
case 2:
processNextTicket();
break;
case 3:
viewNextTicket();
break;
case 4:
displayQueue();
break;
case 5:
displayAllTickets();
break;
case 6:
bubbleSortByTicketId();
break;
case 7:
selectionSortByRequester();
break;
case 8:
searchTicket();
break;
case 9:
System.out.println("Thank you for using the system!");
break;
default:
System.out.println("Invalid choice. Please choose 1 to 9.");
}

} while (choice != 9);
    }

static int readInt(String prompt) {
while (true) {
System.out.print(prompt);

try {
return Integer.parseInt(input.nextLine());
} catch (NumberFormatException e) {
System.out.println("Invalid input. Please enter a number.");
        }
    }
}

    static void addTicket() {
    System.out.print("Enter requester name: ");
    String requester = input.nextLine().trim();

if (requester.isEmpty()) {
    System.out.println("Requester name cannot be empty.");
    return;
}

    System.out.print("Enter issue description: ");
    String issue = input.nextLine().trim();

if (issue.isEmpty()) {
    System.out.println("Issue description cannot be empty.");
return;
}

int ticketId = nextTicketId++;

ticketIds.add(ticketId);
requesters.add(requester);
issues.add(issue);

ticketQueue.offer(ticketId);

    System.out.println("Ticket added successfully!");
    System.out.println("Ticket Number: " + ticketId);
    System.out.println("Ticket placed in the queue.");
}

static void processNextTicket() {
if (ticketQueue.isEmpty()) {
    System.out.println("The ticket queue is empty.");
return;
}

int ticketId = ticketQueue.poll();
int index = ticketIds.indexOf(ticketId);

if (index != -1) {
    System.out.println("\nProcessing next ticket:");
    System.out.println("Ticket Number: " + ticketIds.get(index));
    System.out.println("Requester: " + requesters.get(index));
    System.out.println("Issue: " + issues.get(index));
    System.out.println("Ticket removed from the waiting queue.");
    }
}

static void viewNextTicket() {
if (ticketQueue.isEmpty()) {
System.out.println("The ticket queue is empty.");
return;
}

int ticketId = ticketQueue.peek();
int index = ticketIds.indexOf(ticketId);

if (index != -1) {
System.out.println("\nNext ticket in queue:");
System.out.println("Ticket Number: " + ticketIds.get(index));
System.out.println("Requester: " + requesters.get(index));
System.out.println("Issue: " + issues.get(index));
    }
}

static void displayQueue() {
if (ticketQueue.isEmpty()) {
System.out.println("The ticket queue is empty.");
return;
}

System.out.println("\n===== TICKET QUEUE (FIFO) =====");

for (int ticketId : ticketQueue) {
int index = ticketIds.indexOf(ticketId);

if (index != -1) {
System.out.println(
"Ticket #" + ticketIds.get(index)
+ " | Requester: " + requesters.get(index)
+ " | Issue: " + issues.get(index)
);
}
}
}

static void displayAllTickets() {
if (ticketIds.isEmpty()) {
System.out.println("No tickets have been recorded.");
return;
}

System.out.println("\n===== ALL TICKETS =====");

for (int i = 0; i < ticketIds.size(); i++) {
System.out.println(
"Ticket #" + ticketIds.get(i)
+ " | Requester: " + requesters.get(i)
+ " | Issue: " + issues.get(i)
);
}
}

static void bubbleSortByTicketId() {
if (ticketIds.isEmpty()) {
System.out.println("No tickets to sort.");
return;
}

int n = ticketIds.size();

for (int i = 0; i < n - 1; i++) {
for (int j = 0; j < n - i - 1; j++) {

if (ticketIds.get(j) > ticketIds.get(j + 1)) {
swapTickets(j, j + 1);
}
}
}

System.out.println("Tickets sorted by ticket number using Bubble Sort.");
displayAllTickets();
}

static void selectionSortByRequester() {
if (requesters.isEmpty()) {
System.out.println("No tickets to sort.");
return;
}

int n = requesters.size();

for (int i = 0; i < n - 1; i++) {
int minIndex = i;

for (int j = i + 1; j < n; j++) {
if (requesters.get(j).compareToIgnoreCase(
requesters.get(minIndex)) < 0) {
minIndex = j;
}
}

if (minIndex != i) {
swapTickets(i, minIndex);
}
}

System.out.println("Tickets sorted by requester name using Selection Sort.");
displayAllTickets();
}

static void swapTickets(int first, int second) {
int tempId = ticketIds.get(first);
ticketIds.set(first, ticketIds.get(second));
ticketIds.set(second, tempId);

String tempRequester = requesters.get(first);
requesters.set(first, requesters.get(second));
requesters.set(second, tempRequester);

String tempIssue = issues.get(first);
issues.set(first, issues.get(second));
issues.set(second, tempIssue);
}

static void searchTicket() {
if (ticketIds.isEmpty()) {
System.out.println("No tickets available to search.");
return;
}

int searchId = readInt("Enter ticket number to search: ");
int index = ticketIds.indexOf(searchId);

if (index == -1) {
System.out.println("Ticket #" + searchId + " was not found.");
} else {
System.out.println("\n===== TICKET FOUND =====");
System.out.println("Ticket Number: " + ticketIds.get(index));
System.out.println("Requester: " + requesters.get(index));
System.out.println("Issue: " + issues.get(index));

if (ticketQueue.contains(searchId)) {
System.out.println("Queue Status: Waiting");
} else {
System.out.println("Queue Status: Not currently waiting");
}
        }
    }
}