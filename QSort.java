class SortArray
{
    public sort(int a[])
    {
        int temp;
        for(int i=0;i<=a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int k=0;k<a.length;k++)
        {
            System.out.println(a[k]);
        }
    }
}
public class QuickSort
{
    public static void main(String args[])
    {
        int arr[]={3,5,6,0,1,2,8,4,7,9};
        SortArray sr=new SortArray();
        sr.sort(arr);
    }
}
