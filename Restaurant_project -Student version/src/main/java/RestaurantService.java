import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class RestaurantService {
    private static List<Restaurant> restaurants = new ArrayList<>();

    public Restaurant findRestaurantByName(String restaurantName) throws restaurantNotFoundException{
        Restaurant newRestaurant = null;
        for(int i=0;i<restaurants.size();i++){
            if(restaurants.get(i).getName().toLowerCase().equals(restaurantName.toLowerCase())){
                newRestaurant = restaurants.get(i);
            }
        }
        if(newRestaurant == null){
            throw new restaurantNotFoundException(restaurantName);
        }
        return newRestaurant;
    }


    public Restaurant addRestaurant(String name, String location, LocalTime openingTime, LocalTime closingTime) {
        Restaurant newRestaurant = new Restaurant(name, location, openingTime, closingTime);
        restaurants.add(newRestaurant);
        return newRestaurant;
    }

    public Restaurant removeRestaurant(String restaurantName) throws restaurantNotFoundException {
        Restaurant restaurantToBeRemoved = findRestaurantByName(restaurantName);
        restaurants.remove(restaurantToBeRemoved);
        return restaurantToBeRemoved;
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

    public int getSelectedItemTotal(List<String> selectedItemList,String restaurantName){
        int totalPrice = 0;

        return totalPrice;
    }

}
