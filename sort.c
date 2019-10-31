#include<stdlib.h>
#include<Stdio.h>
typedef struct  node{
int data;
struct node*next;
}node;
void main()
{ node*head,*p,*q,*h2;
 int i,n,ch,flag,x,val;
 printf("Enter the number of nodes\n");
 scanf("%d",&n);
head=(node*)malloc(sizeof(node));
printf("Enter data for first node\n");
scanf("%d",&head->data);
head->next=NULL;
p=head;
for(i=0;i<n-1;i++)
{ p->next=(node*)malloc(sizeof(node));
p=p->next;
printf("enter data for new node\n");
scanf("%d",&p->data);
p->next=NULL;
}
// PRINTING
p=head;
while(p!=NULL)
{ printf("%d\t",p->data);
p=p->next;
}

p=head;
while(p->next!=NULL){
        for(q=p->next;q!=NULL;q=q->next){
    if(p->data > q->data){
        x=p->data;
        p->data=q->data;
        q->data=x;
    }
        else{
        p=p->next;
        }
   }
}

printf("\nSorted\n");
p=head;
while(p!=NULL)
{ printf("%d\t",p->data);
p=p->next;
}

}

