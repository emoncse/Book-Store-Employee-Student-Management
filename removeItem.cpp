void removeItem(int val)
{
   struct node *temp=head;
   struct node *prev=0;
   while(temp!=0){
        if(temp->data==val) break;
        prev=temp;
        temp=temp->next;
   }
   if(temp==0) return;
   else if(temp==head){
        head=head->next;
        free(temp);
   }
   else{
        prev->next=temp->next;
        free(temp);
   }
}
