import {
  LinkedList,
  createLinkedListFromJson,
} from "../../helpers/linked_list_helpers";

function linkedListPalindrome(head: LinkedList | null) {
  // Write your code here.
  if (head == null) {
    return true;
  }

  let head_2 = find_the_mid_node(head);
  head_2 = reverse_linked_list(head_2);
  // compare the fast and slow
  let head_1: LinkedList | null = head
  while (head_1 != null && head_2 != null) {
    if (head_1.value == head_2.value) {
      head_1 = head_1.next;
      head_2 = head_2.next;
    } else {
      return false;
    }
  }
  return true;
}

function find_the_mid_node(head: LinkedList | null): LinkedList | null {
  let slow: LinkedList | null = head;
  let fast: LinkedList | null = head;

  while (fast?.next != null) {
    slow = slow?.next!;
    fast = fast.next.next;
  }
  return slow;
}

function reverse_linked_list(head: LinkedList | null): LinkedList | null {
  let prev: LinkedList | null = null;
  let curr = head;

  while (curr != null) {
    let temp: LinkedList | null = curr.next;
    curr.next = prev;
    prev = curr;
    curr = temp;
  }

  return prev;
}

describe("Is linkedlist palindrom", () => {
  it("Happy Path - Even List", () => {
    let head = createLinkedListFromJson({
      head: "0",
      nodes: [
        { id: "0", next: "1", value: 0 },
        { id: "1", next: "2", value: 1 },
        { id: "2", next: "2-2", value: 2 },
        { id: "2-2", next: "1-2", value: 2 },
        { id: "1-2", next: "0-2", value: 1 },
        { id: "0-2", next: null, value: 0 },
      ],
    });
    expect(linkedListPalindrome(head!)).toStrictEqual(true);
  });

  it("Happy Path - Odd List", () => {
    let head = createLinkedListFromJson({
      head: "0",
      nodes: [
        { id: "0", next: "1", value: 0 },
        { id: "1", next: "2", value: 1 },
        { id: "2", next: "3", value: 2 },
        { id: "3", next: "3-2", value: 3 },
        { id: "3-2", next: "1-2", value: 2 },
        { id: "1-2", next: "0-2", value: 1 },
        { id: "0-2", next: null, value: 0 },
      ],
    });
    expect(linkedListPalindrome(head!)).toStrictEqual(true);
  });

  it("Failure Path - Odd List", () => {
    let head = createLinkedListFromJson({
      head: "0",
      nodes: [
        { id: "0", next: "1", value: 0 },
        { id: "1", next: "2", value: 1 },
        { id: "2", next: "3", value: 2 },
        { id: "3", next: "3-2", value: 3 },
        { id: "3-2", next: "1-2", value: 1 },
        { id: "1-2", next: "0-2", value: 1 },
        { id: "0-2", next: null, value: 0 },
      ],
    });
    expect(linkedListPalindrome(head!)).toStrictEqual(false);
  });
});
