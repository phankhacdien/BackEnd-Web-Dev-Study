package Service;

import Model_Entity.Room;

import java.util.ArrayList;
import java.util.List;

public class HotelManagement {
    private List<GuessManagement> guessManagementList;

    public HotelManagement() {
        this.guessManagementList = new ArrayList<GuessManagement>();
    }

    public void insert(GuessManagement new_Guess) {
        this.guessManagementList.add(new_Guess);
        System.out.println("Guess inserted: " + new_Guess.toString());
    }

    public void deleteByID(String deleteID) {
        GuessManagement delete_guess = this.guessManagementList.stream()
                .filter(guessManagement -> guessManagement.getHumanID().equals(deleteID))
                .findAny().orElse(null);

        if (delete_guess != null) {
            this.guessManagementList.remove(delete_guess);
        } else {
            System.out.println("No guess match ID: " + deleteID);
        }
    }

    public int payment(String humanID) {
        GuessManagement payment_guess = this.guessManagementList.stream()
                .filter(guessManagement -> guessManagement.getHumanID().equals(humanID))
                .findAny().orElse(null);

        if (payment_guess != null) {
            return payment_guess.getRentDays() * payment_guess.getRoomType().getPrice();
        } else {
            System.out.println("No guess match ID: " + humanID);
            return 0;
        }
    }
}
