/* 
   Author : Amit Dutta
   College : BIT Mesra
   Year/Department : 2nd Year/CSE
   E-Mail Id : amitdutta2406@gmail.com
*/

#include <bits/stdc++.h> 
using namespace std; 
  
struct Node 
{ 
  int data; 
  Node* next; 
}; 
  
/* Function to get the nth node from the end of a linked list*/
void printNthFromLast(Node *head, int n) 
{ 
  Node *main_ptr = head, *sec_ptr = head; 
  
  int count = 0; 
  if(head != NULL) 
  { 
     while( count < n) 
     { 
        if(sec_ptr == NULL) 
        { 
           cout<<n<<" is greater than no. of nodes in the given list"<<endl;
           return; 
        } 
        sec_ptr = sec_ptr->next; 
        count++; 
     } 
     while(sec_ptr != NULL) 
     { 
        main_ptr = main_ptr->next; 
        sec_ptr  = sec_ptr->next; 
     } 
     cout<<"Node no. "<<n<<" from last is "<<main_ptr->data<<endl; 
  } 
} 

//Inserts node at the beginning of linked list 
void push(Node** head_sec, int new_data) 
{ 
  Node* new_node = new Node();
  new_node->data  = new_data; 
  new_node->next = (*head_sec);     
  (*head_sec) = new_node; 
} 
  
int main() 
{ 
  Node* head = NULL; 
  int m, i = 1;
  cout<<"Enter total no. of nodes in the list: ";
  cin>>m;
  cout<<"Enter values in the linked list to insert at the beginning\n\n";
  while(m--)
  {
      cout<<"Enter value of node"<<i<<" : ";
      int x;
      cin>>x;
      push(&head, x);
      i++;
  }
  int pos;
  cout<<"Enter position of nth node from the end: ";
  cin>>pos;  
  printNthFromLast(head, pos); 
} 