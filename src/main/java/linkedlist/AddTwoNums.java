package linkedlist;

import java.util.Stack;

public class AddTwoNums {

     static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuffer s = new StringBuffer();
        StringBuffer s1 = new StringBuffer();
        while(l1.next != null){
           s.append(l1.val);
           l1 = l1.next;
        }
        s.append(l1.val);
        while(l2.next != null){
            s1.append(l2.val);
            l2 = l2.next;
        }
        s1.append(l2.val);
        Long i = Long.valueOf(s.reverse().toString());
        Long i1 = Long.valueOf(s1.reverse().toString());
        Long i2 = i+i1;
        StringBuffer s2 = new StringBuffer(String.valueOf(i2));
        StringBuffer s3 = s2.reverse();
        Stack<ListNode> nodeStack = new Stack<>();
        for(int j=0;j<s3.length();j++){
            Long tailVal = Long.valueOf(String.valueOf(s3.charAt(j)));
            ListNode newNode = new ListNode(Integer.valueOf(String.valueOf(tailVal)));
            if(nodeStack.empty()){
                nodeStack.push(newNode);
            }else{
                ListNode tailNode = nodeStack.pop();
                tailNode.next = newNode;
                nodeStack.push(tailNode);
                nodeStack.push(newNode);
            }
        }
        ListNode resultNode = null;
        while(!nodeStack.empty()){
            resultNode = nodeStack.pop();
        }
        return resultNode;
    }

    public static void main(String[] args){
         int[] a1 = new int[]{2,4,3};
         int[] a2 = new int[]{5,6,4};
         ListNode node1 = new ListNode(a1[0]);
         ListNode node2 = new ListNode(a1[1]);
         ListNode node3 = new ListNode(a1[2]);
         node1.next = node2;node2.next = node3;
        ListNode node4 = new ListNode(a2[0]);
        ListNode node5 = new ListNode(a2[1]);
        ListNode node6 = new ListNode(a2[2]);
        node4.next = node5;node5.next = node6;
        addTwoNumbers(node1,node4);
    }
}
