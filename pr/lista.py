c
class node:
    def __init__(self, data = None, next = None):
        self.data = data
        self.next = next
 

class linked_list: 
    def __init__(self):
        self.head = None
    
    
    def addFront(self, data):
        self.head = node(data=data, next=self.head)  
 
    
    def is_empty(self):
        return self.head == None
 
   
    def addEnd(self, data):
        if not self.head:
            self.head = node(data=data)
            return
        curr = self.head
        while curr.next:
            curr = curr.next
        curr.next = node(data=data)
    
    
    def deleteNode(self, key):
        curr = self.head
        prev = None
        while curr and curr.data != key:
            prev = curr
            curr = curr.next
        if prev is None:
            self.head = curr.next
        elif curr:
            prev.next = curr.next
            curr.next = None
 
   
    def get_last_node(self):
        temp = self.head
        while(temp.next is not None):
            temp = temp.next
        return temp.data
 
    
    def printList( self ):
        node = self.head
        while node != None:
            print(node.data, end =" ")
            node = node.next
 
s = linked_list() 
s.addFront(5) 
s.addEnd(8)
s.addFront(9) 
 
s.printList() 