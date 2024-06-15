
public class AllocatingHotelRooms {
    @SuppressWarnings("unused")
    public static int[] allocateRooms(int[][] customers) {
        // Each customer is represented by a pair of integers, their arrival and departure days.
        int arriveDay = customers[0][0] ;
        int departureDay = customers[customers.length-1][customers.length-1] ;
        int x = 0;

        
        Integer rooms[] = new Integer[customers.length];
        
        
        return new int[rooms.length];
    }
    public static boolean OpenRoom(int arriveDay,int departureDay){
        if(arriveDay < departureDay){
            return true;
        }else return false;
    }
    
}
