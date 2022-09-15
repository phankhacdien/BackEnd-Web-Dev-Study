package Manager;

import Entity.Apartment;

import java.util.ArrayList;
import java.util.List;

public class Town {
    List<Apartment> apartmentList;

    public Town() {
        this.apartmentList = new ArrayList<Apartment>();
    }

    public void addApartment(Apartment newApartment) {
        apartmentList.add(newApartment);
    }

    public void showTownInformation() {
        apartmentList.stream()
                .forEach(apartment -> System.out.println(apartment.toString()));
    }

    public List<Apartment> getApartmentList() {
        return apartmentList;
    }

    public void setApartmentList(List<Apartment> apartmentList) {
        this.apartmentList = apartmentList;
    }
}
