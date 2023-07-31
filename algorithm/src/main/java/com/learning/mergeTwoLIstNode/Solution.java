package com.learning.mergeTwoLIstNode;

/**
 * @author lujun
 * @date 2023/7/31 10:37
 * @description 合并两个有序链表
 */
public class Solution {


    /**
     * 合并两个单向列表
     *
     * @param list1 e.g [1,2,4]
     * @param list2 e.g [1,3,4]
     * @return e.g [1,1,2,3,4,4]
     * @description: 实现方案： 定义一个虚拟节点头dummy  然后比较p1 p2 的值
     * p1.val<p2.val 这时候dummy.next =p1 然后p1 =p1.next
     * p1.val>=p2.val 这时候dummy.next =p2 然后p2=p2.next
     * 每次做完一次比较
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(), p = dummy;
        ListNode p1 = list1, p2 = list2;
        while (p1 != null && p2 != null) {
            if (p1.val < p2.val) {
                p.next = p1;
                p1 = p1.next;
            } else {
                p.next = p2;
                p2 = p2.next;
            }
            p = p.next;
        }
        if (p1 != null) {
            p.next = p1;
        }
        if (p2 != null) {
            p.next = p2;
        }
        return dummy.next;
    }

}
