#include <stdio.h>
#include <stdlib.h>

void swap(int *a,int *b)
{
	int t=*a;
	*a=*b;
	*b=t;
}

int partition (int a[],int start,int end)
{
	int i=start+1,j;
	int pivot=a[start]; //taking the first element as pivot; random element can also be taken
	for (j=start+1; j<=end;j++)//sorting both side of pivot
	{
		if (a[j]<pivot)
		{
			swap(&a[i],&a[j]);
			i++;
		}
	}
	swap(&a[start],&a[i-1]);//pivot in its proper place
	return i-1;
}


void q_sort(int a[],int start, int end)
{
	if (start<end)
	{
		int piv_in=partition(a,start,end);
		q_sort(a,start,piv_in-1);
		q_sort(a,piv_in+1,end);
	}
}


int main()
{
	int i,j,k,l,n;
	scanf ("%d",&n);
	int a[n];
	for (i=0; i<n; i++)
		scanf ("%d",&a[i]);
	int start=0,end=n-1;
	q_sort(a,start,end);
	for (i=0; i<n; i++)
		printf ("%d ",a[i]);
}
