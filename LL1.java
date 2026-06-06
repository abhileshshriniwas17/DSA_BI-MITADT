static Node findCycleStart(Node head){

    Node turtle = head;
    Node rabbit = head;

    boolean hasCycle = false;

    while(rabbit != null && rabbit.next != null){

        turtle = turtle.next;
        rabbit = rabbit.next.next;

        if(turtle == rabbit){
            hasCycle = true;
            break;
        }
    }

    if(!hasCycle){
        return null;
    }

    turtle = head;

    while(turtle != rabbit){
        turtle = turtle.next;
        rabbit = rabbit.next;
    }

    return turtle;
}
    public static void main(String[] args) {

        Node head1 = new Node(10);
        head1.next = new Node(20);
        head1.next.next = new Node(30);
        head1.next.next.next = new Node(40);
        head1.next.next.next.next = head1.next;
        System.out.println(detectCycle(head1));
        Node start = findCycleStart(head1);
        if(start != null){
            System.out.println("Cycle starts at: " + start.data);
        }
//         Node head = null;

//         head = addAtHead(head, 10);
//         head = addAtHead(head, 5);

//         head = addAtTail(head, 20);
//         head = addAtTail(head, 30);

//         head = addAtPos(head, 15, 3);

//         printList(head);

//         head = updateAtPos(head, 2, 99);
//         printList(head);

//         head = deleteAtHead(head);
//         printList(head);

//         head = deleteAtTail(head);
//         printList(head);

//         head = deleteAtPos(head, 2);
//         printList(head);

//         head = deleteWithData(head, 20);
//         printList(head);

//         Node middle = findMiddle(head);

// if(middle != null){
//     System.out.println("Middle Node = " + middle.data);
// }
//     System.out.println(detectCycle(head));
   }
}    