package StaticProgram.Number;

public class BinarySearch 
{
    public static void main(String[] args) 
    {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int search = 3;
        int si = 0;
        int ei = arr.length - 1;

        while (si <= ei) 
        {
            int mid = (si + ei) / 2;

            if (arr[mid] == search) 
            {
                System.out.println("Search element is Found at index ---> " + mid);
                return;
            }

            if (arr[mid] < search) 
            {
                si = mid + 1;
            } 
            else 
            {
                ei = mid - 1;
            }
        }

        System.out.println("Search element is not found.");
    }
}
