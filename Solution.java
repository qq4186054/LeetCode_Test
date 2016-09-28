package Test2_Add_Two_Numbers;

public class Solution {
	
	public ListNode addTwoNumbers(ListNode l1,ListNode l2){
		int carry = 0;
		ListNode preNode= new ListNode(0);//初始化前一个节点
		ListNode head = preNode;//初始化头节点
		if(l1 == null)
			return l1;
		if(l2 == null)
			return l2;
		
		while(l1 != null||l2 != null||carry != 0){
			ListNode nextNode = new ListNode(0);//初始化后一个节点
			nextNode.val = ((l1 != null)?l1.val:0)+((l2 != null)?l2.val:0)+carry;
			carry = nextNode.val/10;//计算进位
			nextNode.val = nextNode.val%10;//计算余位			
			preNode.next = nextNode;
			preNode = nextNode;
			
			l1 = ((l1 != null)?l1.next:l1);
			l2 = ((l2 != null)?l2.next:l2);
		}

		return head.next;		
	}
}
