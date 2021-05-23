fun addTwoNumbers(l1:ListNode?, l2:ListNode?): ListNode {
        var node1 = l1
        var node2 = l2

        var resultNode = ListNode(0)
        var tempNode = resultNode

        var carry = 0
        var sum = 0

        while (node1 != null || node2 != null) {
            val num1 = node1?.value?: 0
            val num2 = node2?.value?: 0

            sum = (num1 + num2 + carry) % 10
            carry = (num1 + num2 + carry) / 10

            tempNode.next = ListNode(sum)
            tempNode = tempNode.next!!

            node1 = node1?.next ?: null
            node2 = node2?.next ?: null
        }

        if(carry > 0) {
            tempNode.next = ListNode(carry)
        }

        return resultNode.next!!
}

data class ListNode(var value:Int, var next :ListNode? = null) 