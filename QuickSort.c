#include<stdio.h>

void swap(int *x,int *y)
{
	int temp;
	temp=*x;
	*x=*y;
	*y=temp;
}

int part(int a[],int l,int r)
{
	if(l>=r)
		return -1;
	int i=l,j=r-1;
	while(i<=j)
	{
		if(i<=j && a[i]>=a[r]){
			swap(&a[i],&a[j]);
			j--;}
		else i++;
	}
	swap(&a[i],&a[r]);
	return i;
}

void sort(int a[],int l,int r)
{
	int x;
	if(l>r)return;
	x=part(a,l,r);
	if(x==-1)return;
	sort(a,l,x-1);
	sort(a,x+1,r);
	return ;
}

int main()
{
	int n,a[100],i;
	scanf("%d",&n);
	for(i=0;i<n;i++)
		scanf("%d",&a[i]);
	sort(a,0,n-1);
	for(i=0;i<n;i++)
	printf("%d ",a[i]);
	return 0;
}



